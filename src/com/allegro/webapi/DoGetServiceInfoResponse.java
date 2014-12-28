/**
 * DoGetServiceInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetServiceInfoResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfServiceinfostruct serviceInfoItemsList;

    public DoGetServiceInfoResponse() {
    }

    public DoGetServiceInfoResponse(
           com.allegro.webapi.ArrayOfServiceinfostruct serviceInfoItemsList) {
           this.serviceInfoItemsList = serviceInfoItemsList;
    }


    /**
     * Gets the serviceInfoItemsList value for this DoGetServiceInfoResponse.
     * 
     * @return serviceInfoItemsList
     */
    public com.allegro.webapi.ArrayOfServiceinfostruct getServiceInfoItemsList() {
        return serviceInfoItemsList;
    }


    /**
     * Sets the serviceInfoItemsList value for this DoGetServiceInfoResponse.
     * 
     * @param serviceInfoItemsList
     */
    public void setServiceInfoItemsList(com.allegro.webapi.ArrayOfServiceinfostruct serviceInfoItemsList) {
        this.serviceInfoItemsList = serviceInfoItemsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetServiceInfoResponse)) return false;
        DoGetServiceInfoResponse other = (DoGetServiceInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceInfoItemsList==null && other.getServiceInfoItemsList()==null) || 
             (this.serviceInfoItemsList!=null &&
              this.serviceInfoItemsList.equals(other.getServiceInfoItemsList())));
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
        if (getServiceInfoItemsList() != null) {
            _hashCode += getServiceInfoItemsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetServiceInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfoItemsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "serviceInfoItemsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfServiceinfostruct"));
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
