/**
 * TransactionPayByLinkStruct.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class TransactionPayByLinkStruct  implements java.io.Serializable {
    private java.lang.String postAction;

    private com.allegro.webapi.PostActionDataStruct[] postActionData;

    public TransactionPayByLinkStruct() {
    }

    public TransactionPayByLinkStruct(
           java.lang.String postAction,
           com.allegro.webapi.PostActionDataStruct[] postActionData) {
           this.postAction = postAction;
           this.postActionData = postActionData;
    }


    /**
     * Gets the postAction value for this TransactionPayByLinkStruct.
     * 
     * @return postAction
     */
    public java.lang.String getPostAction() {
        return postAction;
    }


    /**
     * Sets the postAction value for this TransactionPayByLinkStruct.
     * 
     * @param postAction
     */
    public void setPostAction(java.lang.String postAction) {
        this.postAction = postAction;
    }


    /**
     * Gets the postActionData value for this TransactionPayByLinkStruct.
     * 
     * @return postActionData
     */
    public com.allegro.webapi.PostActionDataStruct[] getPostActionData() {
        return postActionData;
    }


    /**
     * Sets the postActionData value for this TransactionPayByLinkStruct.
     * 
     * @param postActionData
     */
    public void setPostActionData(com.allegro.webapi.PostActionDataStruct[] postActionData) {
        this.postActionData = postActionData;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransactionPayByLinkStruct)) return false;
        TransactionPayByLinkStruct other = (TransactionPayByLinkStruct) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.postAction==null && other.getPostAction()==null) || 
             (this.postAction!=null &&
              this.postAction.equals(other.getPostAction()))) &&
            ((this.postActionData==null && other.getPostActionData()==null) || 
             (this.postActionData!=null &&
              java.util.Arrays.equals(this.postActionData, other.getPostActionData())));
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
        if (getPostAction() != null) {
            _hashCode += getPostAction().hashCode();
        }
        if (getPostActionData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPostActionData());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPostActionData(), i);
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
        new org.apache.axis.description.TypeDesc(TransactionPayByLinkStruct.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "TransactionPayByLinkStruct"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postAction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-action"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("postActionData");
        elemField.setXmlName(new javax.xml.namespace.QName("", "post-action-data"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:AllegroWebApi", "PostActionDataStruct"));
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
