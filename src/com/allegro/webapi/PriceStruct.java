/**
 * PriceStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PriceStruct  implements java.io.Serializable {
    private float priceAmount;

    private java.lang.String priceCurrency;

    public PriceStruct() {
    }

    public PriceStruct(
           float priceAmount,
           java.lang.String priceCurrency) {
           this.priceAmount = priceAmount;
           this.priceCurrency = priceCurrency;
    }


    /**
     * Gets the priceAmount value for this PriceStruct.
     * 
     * @return priceAmount
     */
    public float getPriceAmount() {
        return priceAmount;
    }


    /**
     * Sets the priceAmount value for this PriceStruct.
     * 
     * @param priceAmount
     */
    public void setPriceAmount(float priceAmount) {
        this.priceAmount = priceAmount;
    }


    /**
     * Gets the priceCurrency value for this PriceStruct.
     * 
     * @return priceCurrency
     */
    public java.lang.String getPriceCurrency() {
        return priceCurrency;
    }


    /**
     * Sets the priceCurrency value for this PriceStruct.
     * 
     * @param priceCurrency
     */
    public void setPriceCurrency(java.lang.String priceCurrency) {
        this.priceCurrency = priceCurrency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PriceStruct)) return false;
        PriceStruct other = (PriceStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.priceAmount == other.getPriceAmount() &&
            ((this.priceCurrency==null && other.getPriceCurrency()==null) || 
             (this.priceCurrency!=null &&
              this.priceCurrency.equals(other.getPriceCurrency())));
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
        _hashCode += new Float(getPriceAmount()).hashCode();
        if (getPriceCurrency() != null) {
            _hashCode += getPriceCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PriceStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PriceStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price-amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price-currency"));
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
