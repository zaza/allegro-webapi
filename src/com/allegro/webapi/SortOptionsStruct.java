/**
 * SortOptionsStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SortOptionsStruct  implements java.io.Serializable {
    private int sortType;

    private int sortOrder;

    public SortOptionsStruct() {
    }

    public SortOptionsStruct(
           int sortType,
           int sortOrder) {
           this.sortType = sortType;
           this.sortOrder = sortOrder;
    }


    /**
     * Gets the sortType value for this SortOptionsStruct.
     * 
     * @return sortType
     */
    public int getSortType() {
        return sortType;
    }


    /**
     * Sets the sortType value for this SortOptionsStruct.
     * 
     * @param sortType
     */
    public void setSortType(int sortType) {
        this.sortType = sortType;
    }


    /**
     * Gets the sortOrder value for this SortOptionsStruct.
     * 
     * @return sortOrder
     */
    public int getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this SortOptionsStruct.
     * 
     * @param sortOrder
     */
    public void setSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SortOptionsStruct)) return false;
        SortOptionsStruct other = (SortOptionsStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sortType == other.getSortType() &&
            this.sortOrder == other.getSortOrder();
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
        _hashCode += getSortType();
        _hashCode += getSortOrder();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SortOptionsStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SortOptionsStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort-type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sort-order"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
