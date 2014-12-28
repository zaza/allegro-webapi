/**
 * DoGetSpecialItemsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSpecialItemsResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfSpecialauctionstruct sSpecialList;

    public DoGetSpecialItemsResponse() {
    }

    public DoGetSpecialItemsResponse(
           com.allegro.webapi.ArrayOfSpecialauctionstruct sSpecialList) {
           this.sSpecialList = sSpecialList;
    }


    /**
     * Gets the sSpecialList value for this DoGetSpecialItemsResponse.
     * 
     * @return sSpecialList
     */
    public com.allegro.webapi.ArrayOfSpecialauctionstruct getSSpecialList() {
        return sSpecialList;
    }


    /**
     * Sets the sSpecialList value for this DoGetSpecialItemsResponse.
     * 
     * @param sSpecialList
     */
    public void setSSpecialList(com.allegro.webapi.ArrayOfSpecialauctionstruct sSpecialList) {
        this.sSpecialList = sSpecialList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSpecialItemsResponse)) return false;
        DoGetSpecialItemsResponse other = (DoGetSpecialItemsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sSpecialList==null && other.getSSpecialList()==null) || 
             (this.sSpecialList!=null &&
              this.sSpecialList.equals(other.getSSpecialList())));
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
        if (getSSpecialList() != null) {
            _hashCode += getSSpecialList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSpecialItemsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSpecialItemsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSpecialList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sSpecialList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSpecialauctionstruct"));
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
