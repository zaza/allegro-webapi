/**
 * AdvertInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class AdvertInfoStruct  implements java.io.Serializable {
    private int itemIsAdvert;

    private java.lang.String itemAdvertId;

    public AdvertInfoStruct() {
    }

    public AdvertInfoStruct(
           int itemIsAdvert,
           java.lang.String itemAdvertId) {
           this.itemIsAdvert = itemIsAdvert;
           this.itemAdvertId = itemAdvertId;
    }


    /**
     * Gets the itemIsAdvert value for this AdvertInfoStruct.
     * 
     * @return itemIsAdvert
     */
    public int getItemIsAdvert() {
        return itemIsAdvert;
    }


    /**
     * Sets the itemIsAdvert value for this AdvertInfoStruct.
     * 
     * @param itemIsAdvert
     */
    public void setItemIsAdvert(int itemIsAdvert) {
        this.itemIsAdvert = itemIsAdvert;
    }


    /**
     * Gets the itemAdvertId value for this AdvertInfoStruct.
     * 
     * @return itemAdvertId
     */
    public java.lang.String getItemAdvertId() {
        return itemAdvertId;
    }


    /**
     * Sets the itemAdvertId value for this AdvertInfoStruct.
     * 
     * @param itemAdvertId
     */
    public void setItemAdvertId(java.lang.String itemAdvertId) {
        this.itemAdvertId = itemAdvertId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AdvertInfoStruct)) return false;
        AdvertInfoStruct other = (AdvertInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.itemIsAdvert == other.getItemIsAdvert() &&
            ((this.itemAdvertId==null && other.getItemAdvertId()==null) || 
             (this.itemAdvertId!=null &&
              this.itemAdvertId.equals(other.getItemAdvertId())));
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
        _hashCode += getItemIsAdvert();
        if (getItemAdvertId() != null) {
            _hashCode += getItemAdvertId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AdvertInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "AdvertInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemIsAdvert");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemIsAdvert"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemAdvertId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemAdvertId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
