/**
 * PostActionDataStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class PostActionDataStruct  implements java.io.Serializable {
    private java.lang.String postActionKey;

    private java.lang.String postActionValue;

    public PostActionDataStruct() {
    }

    public PostActionDataStruct(
           java.lang.String postActionKey,
           java.lang.String postActionValue) {
           this.postActionKey = postActionKey;
           this.postActionValue = postActionValue;
    }


    /**
     * Gets the postActionKey value for this PostActionDataStruct.
     * 
     * @return postActionKey
     */
    public java.lang.String getPostActionKey() {
        return postActionKey;
    }


    /**
     * Sets the postActionKey value for this PostActionDataStruct.
     * 
     * @param postActionKey
     */
    public void setPostActionKey(java.lang.String postActionKey) {
        this.postActionKey = postActionKey;
    }


    /**
     * Gets the postActionValue value for this PostActionDataStruct.
     * 
     * @return postActionValue
     */
    public java.lang.String getPostActionValue() {
        return postActionValue;
    }


    /**
     * Sets the postActionValue value for this PostActionDataStruct.
     * 
     * @param postActionValue
     */
    public void setPostActionValue(java.lang.String postActionValue) {
        this.postActionValue = postActionValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PostActionDataStruct)) return false;
        PostActionDataStruct other = (PostActionDataStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postActionKey==null && other.getPostActionKey()==null) || 
             (this.postActionKey!=null &&
              this.postActionKey.equals(other.getPostActionKey()))) &&
            ((this.postActionValue==null && other.getPostActionValue()==null) || 
             (this.postActionValue!=null &&
              this.postActionValue.equals(other.getPostActionValue())));
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
        if (getPostActionKey() != null) {
            _hashCode += getPostActionKey().hashCode();
        }
        if (getPostActionValue() != null) {
            _hashCode += getPostActionValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PostActionDataStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostActionDataStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-action-key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-action-value"));
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
