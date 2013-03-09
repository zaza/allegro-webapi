/**
 * NotSoldFilterOptionsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class NotSoldFilterOptionsStruct  implements java.io.Serializable {
    private int filterFormat;

    private int filterFromEnd;

    private int filterAutoListing;

    private com.allegro.webapi.FilterPriceStruct filterPrice;

    public NotSoldFilterOptionsStruct() {
    }

    public NotSoldFilterOptionsStruct(
           int filterFormat,
           int filterFromEnd,
           int filterAutoListing,
           com.allegro.webapi.FilterPriceStruct filterPrice) {
           this.filterFormat = filterFormat;
           this.filterFromEnd = filterFromEnd;
           this.filterAutoListing = filterAutoListing;
           this.filterPrice = filterPrice;
    }


    /**
     * Gets the filterFormat value for this NotSoldFilterOptionsStruct.
     * 
     * @return filterFormat
     */
    public int getFilterFormat() {
        return filterFormat;
    }


    /**
     * Sets the filterFormat value for this NotSoldFilterOptionsStruct.
     * 
     * @param filterFormat
     */
    public void setFilterFormat(int filterFormat) {
        this.filterFormat = filterFormat;
    }


    /**
     * Gets the filterFromEnd value for this NotSoldFilterOptionsStruct.
     * 
     * @return filterFromEnd
     */
    public int getFilterFromEnd() {
        return filterFromEnd;
    }


    /**
     * Sets the filterFromEnd value for this NotSoldFilterOptionsStruct.
     * 
     * @param filterFromEnd
     */
    public void setFilterFromEnd(int filterFromEnd) {
        this.filterFromEnd = filterFromEnd;
    }


    /**
     * Gets the filterAutoListing value for this NotSoldFilterOptionsStruct.
     * 
     * @return filterAutoListing
     */
    public int getFilterAutoListing() {
        return filterAutoListing;
    }


    /**
     * Sets the filterAutoListing value for this NotSoldFilterOptionsStruct.
     * 
     * @param filterAutoListing
     */
    public void setFilterAutoListing(int filterAutoListing) {
        this.filterAutoListing = filterAutoListing;
    }


    /**
     * Gets the filterPrice value for this NotSoldFilterOptionsStruct.
     * 
     * @return filterPrice
     */
    public com.allegro.webapi.FilterPriceStruct getFilterPrice() {
        return filterPrice;
    }


    /**
     * Sets the filterPrice value for this NotSoldFilterOptionsStruct.
     * 
     * @param filterPrice
     */
    public void setFilterPrice(com.allegro.webapi.FilterPriceStruct filterPrice) {
        this.filterPrice = filterPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NotSoldFilterOptionsStruct)) return false;
        NotSoldFilterOptionsStruct other = (NotSoldFilterOptionsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.filterFormat == other.getFilterFormat() &&
            this.filterFromEnd == other.getFilterFromEnd() &&
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
        _hashCode += getFilterFromEnd();
        _hashCode += getFilterAutoListing();
        if (getFilterPrice() != null) {
            _hashCode += getFilterPrice().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NotSoldFilterOptionsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "NotSoldFilterOptionsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterFormat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-format"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filterFromEnd");
        elemField.setXmlName(new javax.xml.namespace.QName("", "filter-from-end"));
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
