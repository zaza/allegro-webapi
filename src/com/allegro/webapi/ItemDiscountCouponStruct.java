/**
 * ItemDiscountCouponStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class ItemDiscountCouponStruct  implements java.io.Serializable {
    private com.allegro.webapi.PriceStruct itemPriceOriginal;

    private com.allegro.webapi.PriceStruct itemPriceDiscounted;

    public ItemDiscountCouponStruct() {
    }

    public ItemDiscountCouponStruct(
           com.allegro.webapi.PriceStruct itemPriceOriginal,
           com.allegro.webapi.PriceStruct itemPriceDiscounted) {
           this.itemPriceOriginal = itemPriceOriginal;
           this.itemPriceDiscounted = itemPriceDiscounted;
    }


    /**
     * Gets the itemPriceOriginal value for this ItemDiscountCouponStruct.
     * 
     * @return itemPriceOriginal
     */
    public com.allegro.webapi.PriceStruct getItemPriceOriginal() {
        return itemPriceOriginal;
    }


    /**
     * Sets the itemPriceOriginal value for this ItemDiscountCouponStruct.
     * 
     * @param itemPriceOriginal
     */
    public void setItemPriceOriginal(com.allegro.webapi.PriceStruct itemPriceOriginal) {
        this.itemPriceOriginal = itemPriceOriginal;
    }


    /**
     * Gets the itemPriceDiscounted value for this ItemDiscountCouponStruct.
     * 
     * @return itemPriceDiscounted
     */
    public com.allegro.webapi.PriceStruct getItemPriceDiscounted() {
        return itemPriceDiscounted;
    }


    /**
     * Sets the itemPriceDiscounted value for this ItemDiscountCouponStruct.
     * 
     * @param itemPriceDiscounted
     */
    public void setItemPriceDiscounted(com.allegro.webapi.PriceStruct itemPriceDiscounted) {
        this.itemPriceDiscounted = itemPriceDiscounted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ItemDiscountCouponStruct)) return false;
        ItemDiscountCouponStruct other = (ItemDiscountCouponStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemPriceOriginal==null && other.getItemPriceOriginal()==null) || 
             (this.itemPriceOriginal!=null &&
              this.itemPriceOriginal.equals(other.getItemPriceOriginal()))) &&
            ((this.itemPriceDiscounted==null && other.getItemPriceDiscounted()==null) || 
             (this.itemPriceDiscounted!=null &&
              this.itemPriceDiscounted.equals(other.getItemPriceDiscounted())));
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
        if (getItemPriceOriginal() != null) {
            _hashCode += getItemPriceOriginal().hashCode();
        }
        if (getItemPriceDiscounted() != null) {
            _hashCode += getItemPriceDiscounted().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ItemDiscountCouponStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "ItemDiscountCouponStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPriceOriginal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-price-original"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PriceStruct"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemPriceDiscounted");
        elemField.setXmlName(new javax.xml.namespace.QName("", "item-price-discounted"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PriceStruct"));
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
