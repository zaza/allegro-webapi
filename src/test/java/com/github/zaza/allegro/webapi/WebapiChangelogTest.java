package com.github.zaza.allegro.webapi;

import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.rometools.fetcher.FeedFetcher;
import com.rometools.fetcher.FetcherEvent;
import com.rometools.fetcher.FetcherException;
import com.rometools.fetcher.FetcherListener;
import com.rometools.fetcher.impl.FeedFetcherCache;
import com.rometools.fetcher.impl.HashMapFeedInfoCache;
import com.rometools.fetcher.impl.HttpURLFeedFetcher;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.FeedException;

public class WebapiChangelogTest {

	@Test
	public void noChangelogEntryAfterSourceGenerated() throws Exception {
		assertTrue("New changelog entry has been published. Regenerate sources.",
				lastTimeSourcesGenerated().after(latestChangelogEntryPublished()));
	}

	private Date lastTimeSourcesGenerated() throws ParseException {
		return new SimpleDateFormat("yyyy-MM-dd").parse("2017-08-21");
	}

	private Date latestChangelogEntryPublished()
			throws IllegalArgumentException, IOException, FeedException, FetcherException {
		return fetchFeed("http://allegro.pl/rss.php/webapi?all=0").getEntries().iterator().next().getPublishedDate();
	}

	/*
	 * https://github.com/rometools/rome-fetcher/blob/master/src/test/java/com/rometools/fetcher/samples/FeedReader.java
	 */
	private SyndFeed fetchFeed(String url)
			throws IllegalArgumentException, IOException, FeedException, FetcherException {
		URL feedUrl = new URL(url);
		FeedFetcherCache feedInfoCache = HashMapFeedInfoCache.getInstance();
		FeedFetcher fetcher = new HttpURLFeedFetcher(feedInfoCache);
		FetcherEventListenerImpl listener = new FetcherEventListenerImpl();
		fetcher.addFetcherEventListener(listener);
		return fetcher.retrieveFeed(feedUrl);
	}

	static class FetcherEventListenerImpl implements FetcherListener {
		@Override
		public void fetcherEvent(final FetcherEvent event) {
			final String eventType = event.getEventType();
			if (FetcherEvent.EVENT_TYPE_FEED_POLLED.equals(eventType)) {
				System.err.println("\tEVENT: Feed Polled. URL = " + event.getUrlString());
			} else if (FetcherEvent.EVENT_TYPE_FEED_RETRIEVED.equals(eventType)) {
				System.err.println("\tEVENT: Feed Retrieved. URL = " + event.getUrlString());
			} else if (FetcherEvent.EVENT_TYPE_FEED_UNCHANGED.equals(eventType)) {
				System.err.println("\tEVENT: Feed Unchanged. URL = " + event.getUrlString());
			}
		}
	}
}
