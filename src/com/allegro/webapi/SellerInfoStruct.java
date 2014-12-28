/**
 * SellerInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellerInfoStruct  implements java.io.Serializable {
    private int sellerId;

    private java.lang.String sellerName;

    private int sellerRating;

    private int sellerInfo;

    public SellerInfoStruct() {
    }

    public SellerInfoStruct(
           int sellerId,
           java.lang.String sellerName,
           int sellerRating,
           int sellerInfo) {
           this.sellerId = sellerId;
           this.sellerName = sellerName;
           this.sellerRating = sellerRating;
           this.sellerInfo = sellerInfo;
    }


    /**
     * Gets the sellerId value for this SellerInfoStruct.
     * 
     * @return sellerId
     */
    public int getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this SellerInfoStruct.
     * 
     * @param sellerId
     */
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerName value for this SellerInfoStruct.
     * 
     * @return sellerName
     */
    public java.lang.String getSellerName() {
        return sellerName;
    }


    /**
     * Sets the sellerName value for this SellerInfoStruct.
     * 
     * @param sellerName
     */
    public void setSellerName(java.lang.String sellerName) {
        this.sellerName = sellerName;
    }


    /**
     * Gets the sellerRating value for this SellerInfoStruct.
     * 
     * @return sellerRating
     */
    public int getSellerRating() {
        return sellerRating;
    }


    /**
     * Sets the sellerRating value for this SellerInfoStruct.
     * 
     * @param sellerRating
     */
    public void setSellerRating(int sellerRating) {
        this.sellerRating = sellerRating;
    }


    /**
     * Gets the sellerInfo value for this SellerInfoStruct.
     * 
     * @return sellerInfo
     */
    public int getSellerInfo() {
        return sellerInfo;
    }


    /**
     * Sets the sellerInfo value for this SellerInfoStruct.
     * 
     * @param sellerInfo
     */
    public void setSellerInfo(int sellerInfo) {
        this.sellerInfo = sellerInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerInfoStruct)) return false;
        SellerInfoStruct other = (SellerInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellerId == other.getSellerId() &&
            ((this.sellerName==null && other.getSellerName()==null) || 
             (this.sellerName!=null &&
              this.sellerName.equals(other.getSellerName()))) &&
            this.sellerRating == other.getSellerRating() &&
            this.sellerInfo == other.getSellerInfo();
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
        _hashCode += getSellerId();
        if (getSellerName() != null) {
            _hashCode += getSellerName().hashCode();
        }
        _hashCode += getSellerRating();
        _hashCode += getSellerInfo();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "SellerInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerName");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerRating");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerRating"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sellerInfo"));
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
