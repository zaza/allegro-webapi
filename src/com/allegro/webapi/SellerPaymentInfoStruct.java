/**
 * SellerPaymentInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class SellerPaymentInfoStruct  implements java.io.Serializable {
    private com.allegro.webapi.ShipmentPaymentInfoStruct[] shipmentPaymentInfoPza;

    private com.allegro.webapi.ShipmentPaymentInfoStruct[] shipmentPaymentInfoNonPza;

    public SellerPaymentInfoStruct() {
    }

    public SellerPaymentInfoStruct(
           com.allegro.webapi.ShipmentPaymentInfoStruct[] shipmentPaymentInfoPza,
           com.allegro.webapi.ShipmentPaymentInfoStruct[] shipmentPaymentInfoNonPza) {
           this.shipmentPaymentInfoPza = shipmentPaymentInfoPza;
           this.shipmentPaymentInfoNonPza = shipmentPaymentInfoNonPza;
    }


    /**
     * Gets the shipmentPaymentInfoPza value for this SellerPaymentInfoStruct.
     * 
     * @return shipmentPaymentInfoPza
     */
    public com.allegro.webapi.ShipmentPaymentInfoStruct[] getShipmentPaymentInfoPza() {
        return shipmentPaymentInfoPza;
    }


    /**
     * Sets the shipmentPaymentInfoPza value for this SellerPaymentInfoStruct.
     * 
     * @param shipmentPaymentInfoPza
     */
    public void setShipmentPaymentInfoPza(com.allegro.webapi.ShipmentPaymentInfoStruct[] shipmentPaymentInfoPza) {
        this.shipmentPaymentInfoPza = shipmentPaymentInfoPza;
    }


    /**
     * Gets the shipmentPaymentInfoNonPza value for this SellerPaymentInfoStruct.
     * 
     * @return shipmentPaymentInfoNonPza
     */
    public com.allegro.webapi.ShipmentPaymentInfoStruct[] getShipmentPaymentInfoNonPza() {
        return shipmentPaymentInfoNonPza;
    }


    /**
     * Sets the shipmentPaymentInfoNonPza value for this SellerPaymentInfoStruct.
     * 
     * @param shipmentPaymentInfoNonPza
     */
    public void setShipmentPaymentInfoNonPza(com.allegro.webapi.ShipmentPaymentInfoStruct[] shipmentPaymentInfoNonPza) {
        this.shipmentPaymentInfoNonPza = shipmentPaymentInfoNonPza;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SellerPaymentInfoStruct)) return false;
        SellerPaymentInfoStruct other = (SellerPaymentInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.shipmentPaymentInfoPza==null && other.getShipmentPaymentInfoPza()==null) || 
             (this.shipmentPaymentInfoPza!=null &&
              java.util.Arrays.equals(this.shipmentPaymentInfoPza, other.getShipmentPaymentInfoPza()))) &&
            ((this.shipmentPaymentInfoNonPza==null && other.getShipmentPaymentInfoNonPza()==null) || 
             (this.shipmentPaymentInfoNonPza!=null &&
              java.util.Arrays.equals(this.shipmentPaymentInfoNonPza, other.getShipmentPaymentInfoNonPza())));
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
        if (getShipmentPaymentInfoPza() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentPaymentInfoPza());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentPaymentInfoPza(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShipmentPaymentInfoNonPza() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShipmentPaymentInfoNonPza());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShipmentPaymentInfoNonPza(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SellerPaymentInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "SellerPaymentInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPaymentInfoPza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipment-payment-info-pza"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPaymentInfoStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shipmentPaymentInfoNonPza");
        elemField.setXmlName(new javax.xml.namespace.QName("", "shipment-payment-info-non-pza"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ShipmentPaymentInfoStruct"));
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
