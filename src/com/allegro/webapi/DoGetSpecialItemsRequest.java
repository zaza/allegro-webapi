/**
 * DoGetSpecialItemsRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSpecialItemsRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private int specialType;

    private java.lang.Integer specialGroup;

    private java.lang.Integer offset;

    private java.lang.Integer orderFulfillmentTime;

    public DoGetSpecialItemsRequest() {
    }

    public DoGetSpecialItemsRequest(
           java.lang.String sessionHandle,
           int specialType,
           java.lang.Integer specialGroup,
           java.lang.Integer offset,
           java.lang.Integer orderFulfillmentTime) {
           this.sessionHandle = sessionHandle;
           this.specialType = specialType;
           this.specialGroup = specialGroup;
           this.offset = offset;
           this.orderFulfillmentTime = orderFulfillmentTime;
    }


    /**
     * Gets the sessionHandle value for this DoGetSpecialItemsRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoGetSpecialItemsRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the specialType value for this DoGetSpecialItemsRequest.
     * 
     * @return specialType
     */
    public int getSpecialType() {
        return specialType;
    }


    /**
     * Sets the specialType value for this DoGetSpecialItemsRequest.
     * 
     * @param specialType
     */
    public void setSpecialType(int specialType) {
        this.specialType = specialType;
    }


    /**
     * Gets the specialGroup value for this DoGetSpecialItemsRequest.
     * 
     * @return specialGroup
     */
    public java.lang.Integer getSpecialGroup() {
        return specialGroup;
    }


    /**
     * Sets the specialGroup value for this DoGetSpecialItemsRequest.
     * 
     * @param specialGroup
     */
    public void setSpecialGroup(java.lang.Integer specialGroup) {
        this.specialGroup = specialGroup;
    }


    /**
     * Gets the offset value for this DoGetSpecialItemsRequest.
     * 
     * @return offset
     */
    public java.lang.Integer getOffset() {
        return offset;
    }


    /**
     * Sets the offset value for this DoGetSpecialItemsRequest.
     * 
     * @param offset
     */
    public void setOffset(java.lang.Integer offset) {
        this.offset = offset;
    }


    /**
     * Gets the orderFulfillmentTime value for this DoGetSpecialItemsRequest.
     * 
     * @return orderFulfillmentTime
     */
    public java.lang.Integer getOrderFulfillmentTime() {
        return orderFulfillmentTime;
    }


    /**
     * Sets the orderFulfillmentTime value for this DoGetSpecialItemsRequest.
     * 
     * @param orderFulfillmentTime
     */
    public void setOrderFulfillmentTime(java.lang.Integer orderFulfillmentTime) {
        this.orderFulfillmentTime = orderFulfillmentTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSpecialItemsRequest)) return false;
        DoGetSpecialItemsRequest other = (DoGetSpecialItemsRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sessionHandle==null && other.getSessionHandle()==null) || 
             (this.sessionHandle!=null &&
              this.sessionHandle.equals(other.getSessionHandle()))) &&
            this.specialType == other.getSpecialType() &&
            ((this.specialGroup==null && other.getSpecialGroup()==null) || 
             (this.specialGroup!=null &&
              this.specialGroup.equals(other.getSpecialGroup()))) &&
            ((this.offset==null && other.getOffset()==null) || 
             (this.offset!=null &&
              this.offset.equals(other.getOffset()))) &&
            ((this.orderFulfillmentTime==null && other.getOrderFulfillmentTime()==null) || 
             (this.orderFulfillmentTime!=null &&
              this.orderFulfillmentTime.equals(other.getOrderFulfillmentTime())));
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
        if (getSessionHandle() != null) {
            _hashCode += getSessionHandle().hashCode();
        }
        _hashCode += getSpecialType();
        if (getSpecialGroup() != null) {
            _hashCode += getSpecialGroup().hashCode();
        }
        if (getOffset() != null) {
            _hashCode += getOffset().hashCode();
        }
        if (getOrderFulfillmentTime() != null) {
            _hashCode += getOrderFulfillmentTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSpecialItemsRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetSpecialItemsRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "specialType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("specialGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "specialGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("offset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "offset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderFulfillmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "orderFulfillmentTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
