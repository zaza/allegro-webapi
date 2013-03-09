/**
 * SellFilterOptionsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellFilterOptionsStruct  implements java.io.Serializable {
    private int filterFormat;

    private int filterBids;

    private int filterToEnd;

    private int filterFromStart;

    private int filterAutoListing;

    private com.allegro.webapi.FilterPriceStruct filterPrice;

    public SellFilterOptionsStruct() {
    }

    public SellFilterOptionsStruct(
           int filterFormat,
           int filterBids,
           int filterToEnd,
           int filterFromStart,
           int filterAutoListing,
           com.allegro.webapi.FilterPriceStruct filterPrice) {
           this.filterFormat = filterFormat;
           this.filterBids = filterBids;
           this.filterToEnd = filterToEnd;
           this.filterFromStart = filterFromStart;
           this.filterAutoListing = filterAutoListing;
           this.filterPrice = filterPrice;
    }


    /**
     * Gets the filterFormat value for this SellFilterOptionsStruct.
     * 
     * @return filterFormat
     */
    public int getFilterFormat() {
        return filterFormat;
    }


    /**
     * Sets the filterFormat value for this SellFilterOptionsStruct.
     * 
     * @param filterFormat
     */
    public void setFilterFormat(int filterFormat) {
        this.filterFormat = filterFormat;
    }


    /**
     * Gets the filterBids value for this SellFilterOptionsStruct.
     * 
     * @return filterBids
     */
    public int getFilterBids() {
        return filterBids;
    }


    /**
     * Sets the filterBids value for this SellFilterOptionsStruct.
     * 
     * @param filterBids
     */
    public void setFilterBids(int filterBids) {
        this.filterBids = filterBids;
    }


    /**
     * Gets the filterToEnd value for this SellFilterOptionsStruct.
     * 
     * @return filterToEnd
     */
    public int getFilterToEnd() {
        return filterToEnd;
    }


    /**
     * Sets the filterToEnd value for this SellFilterOptionsStruct.
     * 
     * @param filterToEnd
     */
    public void setFilterToEnd(int filterToEnd) {
        this.filterToEnd = filterToEnd;
    }


    /**
     * Gets the filterFromStart value for this SellFilterOptionsStruct.
     * 
     * @return filterFromStart
     */
    public int getFilterFromStart() {
        return filterFromStart;
    }


    /**
     * Sets the filterFromStart value for this SellFilterOptionsStruct.
     * 
     * @param filterFromStart
     */
    public void setFilterFromStart(int filterFromStart) {
        this.filterFromStart = filterFromStart;
    }


    /**
     * Gets the filterAutoListing value for this SellFilterOptionsStruct.
     * 
     * @return filterAutoListing
     */
    public int getFilterAutoListing() {
        return filterAutoListing;
    }


    /**
     * Sets the filterAutoListing value for this SellFilterOptionsStruct.
     * 
     * @param filterAutoListing
     */
    public void setFilterAutoListing(int filterAutoListing) {
        this.filterAutoListing = filterAutoListing;
    }


    /**
     * Gets the filterPrice value for this SellFilterOptionsStruct.
     * 
     * @return filterPrice
     */
    public com.allegro.webapi.FilterPriceStruct getFilterPrice() {
        return filterPrice;
    }


    /**
     * Sets the filterPrice value for this SellFilterOptionsStruct.
     * 
     * @param filterPrice
     */
    public void setFilterPrice(com.allegro.webapi.FilterPriceStruct filterPrice) {
        this.filterPrice = filterPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellFilterOptionsStruct)) return false;
        SellFilterOptionsStruct other = (SellFilterOptionsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.filterFormat == other.getFilterFormat() &&
            this.filterBids == other.getFilterBids() &&
            this.filterToEnd == other.getFilterToEnd() &&
            this.filterFromStart == other.getFilterFromStart() &&
            this.filterAutoListing == other.getFilterAutoListing() &&
            ((this.filterPrice==null && other.getFilterPrice()==null) || 
             (this.filterPrice!=null &&
              this.filterPrice.equals(other.getFilterPrice())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getFilterFormat();
        _hashCode += getFilterBids();
        _hashCode += getFilterToEnd();
        _hashCode += getFilterFromStart();
        _hashCode += getFilterAutoListing();
        if (getFilterPrice() != null) {
            _hashCode += getFilterPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellFilterOptionsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellFilterOptionsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterBids");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-bids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterToEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-to-end"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterFromStart");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-from-start"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterAutoListing");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-auto-listing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-price"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "FilterPriceStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
