/**
 * NewPostBuyFormSellerStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class NewPostBuyFormSellerStruct  implements java.io.Serializable {
    private int sellerId;

    private long[] sellerItemIds;

    private int sellerShipmentId;

    private float sellerShipmentAmount;

    private java.lang.String sellerMessageTo;

    public NewPostBuyFormSellerStruct() {
    }

    public NewPostBuyFormSellerStruct(
           int sellerId,
           long[] sellerItemIds,
           int sellerShipmentId,
           float sellerShipmentAmount,
           java.lang.String sellerMessageTo) {
           this.sellerId = sellerId;
           this.sellerItemIds = sellerItemIds;
           this.sellerShipmentId = sellerShipmentId;
           this.sellerShipmentAmount = sellerShipmentAmount;
           this.sellerMessageTo = sellerMessageTo;
    }


    /**
     * Gets the sellerId value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerId
     */
    public int getSellerId() {
        return sellerId;
    }


    /**
     * Sets the sellerId value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerId
     */
    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }


    /**
     * Gets the sellerItemIds value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerItemIds
     */
    public long[] getSellerItemIds() {
        return sellerItemIds;
    }


    /**
     * Sets the sellerItemIds value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerItemIds
     */
    public void setSellerItemIds(long[] sellerItemIds) {
        this.sellerItemIds = sellerItemIds;
    }


    /**
     * Gets the sellerShipmentId value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerShipmentId
     */
    public int getSellerShipmentId() {
        return sellerShipmentId;
    }


    /**
     * Sets the sellerShipmentId value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerShipmentId
     */
    public void setSellerShipmentId(int sellerShipmentId) {
        this.sellerShipmentId = sellerShipmentId;
    }


    /**
     * Gets the sellerShipmentAmount value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerShipmentAmount
     */
    public float getSellerShipmentAmount() {
        return sellerShipmentAmount;
    }


    /**
     * Sets the sellerShipmentAmount value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerShipmentAmount
     */
    public void setSellerShipmentAmount(float sellerShipmentAmount) {
        this.sellerShipmentAmount = sellerShipmentAmount;
    }


    /**
     * Gets the sellerMessageTo value for this NewPostBuyFormSellerStruct.
     * 
     * @return sellerMessageTo
     */
    public java.lang.String getSellerMessageTo() {
        return sellerMessageTo;
    }


    /**
     * Sets the sellerMessageTo value for this NewPostBuyFormSellerStruct.
     * 
     * @param sellerMessageTo
     */
    public void setSellerMessageTo(java.lang.String sellerMessageTo) {
        this.sellerMessageTo = sellerMessageTo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof NewPostBuyFormSellerStruct)) return false;
        NewPostBuyFormSellerStruct other = (NewPostBuyFormSellerStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sellerId == other.getSellerId() &&
            ((this.sellerItemIds==null && other.getSellerItemIds()==null) || 
             (this.sellerItemIds!=null &&
              java.util.Arrays.equals(this.sellerItemIds, other.getSellerItemIds()))) &&
            this.sellerShipmentId == other.getSellerShipmentId() &&
            this.sellerShipmentAmount == other.getSellerShipmentAmount() &&
            ((this.sellerMessageTo==null && other.getSellerMessageTo()==null) || 
             (this.sellerMessageTo!=null &&
              this.sellerMessageTo.equals(other.getSellerMessageTo())));
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
        if (getSellerItemIds() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSellerItemIds());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSellerItemIds(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getSellerShipmentId();
        _hashCode += new Float(getSellerShipmentAmount()).hashCode();
        if (getSellerMessageTo() != null) {
            _hashCode += getSellerMessageTo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(NewPostBuyFormSellerStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "NewPostBuyFormSellerStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerItemIds");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-item-ids"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerShipmentId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-shipment-id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerShipmentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-shipment-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sellerMessageTo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "seller-message-to"));
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
