/**
 * DoGetServiceInfoCategoriesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetServiceInfoCategoriesResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfServiceinfocatstruct serviceInfoCatsList;

    public DoGetServiceInfoCategoriesResponse() {
    }

    public DoGetServiceInfoCategoriesResponse(
           com.allegro.webapi.ArrayOfServiceinfocatstruct serviceInfoCatsList) {
           this.serviceInfoCatsList = serviceInfoCatsList;
    }


    /**
     * Gets the serviceInfoCatsList value for this DoGetServiceInfoCategoriesResponse.
     * 
     * @return serviceInfoCatsList
     */
    public com.allegro.webapi.ArrayOfServiceinfocatstruct getServiceInfoCatsList() {
        return serviceInfoCatsList;
    }


    /**
     * Sets the serviceInfoCatsList value for this DoGetServiceInfoCategoriesResponse.
     * 
     * @param serviceInfoCatsList
     */
    public void setServiceInfoCatsList(com.allegro.webapi.ArrayOfServiceinfocatstruct serviceInfoCatsList) {
        this.serviceInfoCatsList = serviceInfoCatsList;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetServiceInfoCategoriesResponse)) return false;
        DoGetServiceInfoCategoriesResponse other = (DoGetServiceInfoCategoriesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.serviceInfoCatsList==null && other.getServiceInfoCatsList()==null) || 
             (this.serviceInfoCatsList!=null &&
              this.serviceInfoCatsList.equals(other.getServiceInfoCatsList())));
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
        if (getServiceInfoCatsList() != null) {
            _hashCode += getServiceInfoCatsList().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetServiceInfoCategoriesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetServiceInfoCategoriesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceInfoCatsList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "serviceInfoCatsList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfServiceinfocatstruct"));
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
