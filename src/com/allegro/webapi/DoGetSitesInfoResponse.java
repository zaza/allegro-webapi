/**
 * DoGetSitesInfoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetSitesInfoResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfSiteinfotype sitesInfoList;

    private long verKey;

    private java.lang.String verStr;

    public DoGetSitesInfoResponse() {
    }

    public DoGetSitesInfoResponse(
           com.allegro.webapi.ArrayOfSiteinfotype sitesInfoList,
           long verKey,
           java.lang.String verStr) {
           this.sitesInfoList = sitesInfoList;
           this.verKey = verKey;
           this.verStr = verStr;
    }


    /**
     * Gets the sitesInfoList value for this DoGetSitesInfoResponse.
     * 
     * @return sitesInfoList
     */
    public com.allegro.webapi.ArrayOfSiteinfotype getSitesInfoList() {
        return sitesInfoList;
    }


    /**
     * Sets the sitesInfoList value for this DoGetSitesInfoResponse.
     * 
     * @param sitesInfoList
     */
    public void setSitesInfoList(com.allegro.webapi.ArrayOfSiteinfotype sitesInfoList) {
        this.sitesInfoList = sitesInfoList;
    }


    /**
     * Gets the verKey value for this DoGetSitesInfoResponse.
     * 
     * @return verKey
     */
    public long getVerKey() {
        return verKey;
    }


    /**
     * Sets the verKey value for this DoGetSitesInfoResponse.
     * 
     * @param verKey
     */
    public void setVerKey(long verKey) {
        this.verKey = verKey;
    }


    /**
     * Gets the verStr value for this DoGetSitesInfoResponse.
     * 
     * @return verStr
     */
    public java.lang.String getVerStr() {
        return verStr;
    }


    /**
     * Sets the verStr value for this DoGetSitesInfoResponse.
     * 
     * @param verStr
     */
    public void setVerStr(java.lang.String verStr) {
        this.verStr = verStr;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetSitesInfoResponse)) return false;
        DoGetSitesInfoResponse other = (DoGetSitesInfoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.sitesInfoList==null && other.getSitesInfoList()==null) || 
             (this.sitesInfoList!=null &&
              this.sitesInfoList.equals(other.getSitesInfoList()))) &&
            this.verKey == other.getVerKey() &&
            ((this.verStr==null && other.getVerStr()==null) || 
             (this.verStr!=null &&
              this.verStr.equals(other.getVerStr())));
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
        if (getSitesInfoList() != null) {
            _hashCode += getSitesInfoList().hashCode();
        }
        _hashCode += new Long(getVerKey()).hashCode();
        if (getVerStr() != null) {
            _hashCode += getVerStr().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetSitesInfoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doGetSitesInfoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sitesInfoList");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sitesInfoList"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSiteinfotype"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "verKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("verStr");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "verStr"));
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
