/**
 * WatchListInfoStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class WatchListInfoStruct  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfLong itemsAdded;

    private com.allegro.webapi.ArrayOfItemsnotaddedstruct itemsNotAdded;

    public WatchListInfoStruct() {
    }

    public WatchListInfoStruct(
           com.allegro.webapi.ArrayOfLong itemsAdded,
           com.allegro.webapi.ArrayOfItemsnotaddedstruct itemsNotAdded) {
           this.itemsAdded = itemsAdded;
           this.itemsNotAdded = itemsNotAdded;
    }


    /**
     * Gets the itemsAdded value for this WatchListInfoStruct.
     * 
     * @return itemsAdded
     */
    public com.allegro.webapi.ArrayOfLong getItemsAdded() {
        return itemsAdded;
    }


    /**
     * Sets the itemsAdded value for this WatchListInfoStruct.
     * 
     * @param itemsAdded
     */
    public void setItemsAdded(com.allegro.webapi.ArrayOfLong itemsAdded) {
        this.itemsAdded = itemsAdded;
    }


    /**
     * Gets the itemsNotAdded value for this WatchListInfoStruct.
     * 
     * @return itemsNotAdded
     */
    public com.allegro.webapi.ArrayOfItemsnotaddedstruct getItemsNotAdded() {
        return itemsNotAdded;
    }


    /**
     * Sets the itemsNotAdded value for this WatchListInfoStruct.
     * 
     * @param itemsNotAdded
     */
    public void setItemsNotAdded(com.allegro.webapi.ArrayOfItemsnotaddedstruct itemsNotAdded) {
        this.itemsNotAdded = itemsNotAdded;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WatchListInfoStruct)) return false;
        WatchListInfoStruct other = (WatchListInfoStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.itemsAdded==null && other.getItemsAdded()==null) || 
             (this.itemsAdded!=null &&
              this.itemsAdded.equals(other.getItemsAdded()))) &&
            ((this.itemsNotAdded==null && other.getItemsNotAdded()==null) || 
             (this.itemsNotAdded!=null &&
              this.itemsNotAdded.equals(other.getItemsNotAdded())));
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
        if (getItemsAdded() != null) {
            _hashCode += getItemsAdded().hashCode();
        }
        if (getItemsNotAdded() != null) {
            _hashCode += getItemsNotAdded().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WatchListInfoStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "WatchListInfoStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfLong"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itemsNotAdded");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "itemsNotAdded"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfItemsnotaddedstruct"));
        elemField.setMinOccurs(0);
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
