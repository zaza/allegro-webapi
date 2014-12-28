/**
 * DoGetServiceInfoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoGetServiceInfoRequest  implements java.io.Serializable {
    private int countryCode;

    private int anCatId;

    private java.lang.Long anItDate;

    private java.lang.Integer anItId;

    private java.lang.String webapiKey;

    public DoGetServiceInfoRequest() {
    }

    public DoGetServiceInfoRequest(
           int countryCode,
           int anCatId,
           java.lang.Long anItDate,
           java.lang.Integer anItId,
           java.lang.String webapiKey) {
           this.countryCode = countryCode;
           this.anCatId = anCatId;
           this.anItDate = anItDate;
           this.anItId = anItId;
           this.webapiKey = webapiKey;
    }


    /**
     * Gets the countryCode value for this DoGetServiceInfoRequest.
     * 
     * @return countryCode
     */
    public int getCountryCode() {
        return countryCode;
    }


    /**
     * Sets the countryCode value for this DoGetServiceInfoRequest.
     * 
     * @param countryCode
     */
    public void setCountryCode(int countryCode) {
        this.countryCode = countryCode;
    }


    /**
     * Gets the anCatId value for this DoGetServiceInfoRequest.
     * 
     * @return anCatId
     */
    public int getAnCatId() {
        return anCatId;
    }


    /**
     * Sets the anCatId value for this DoGetServiceInfoRequest.
     * 
     * @param anCatId
     */
    public void setAnCatId(int anCatId) {
        this.anCatId = anCatId;
    }


    /**
     * Gets the anItDate value for this DoGetServiceInfoRequest.
     * 
     * @return anItDate
     */
    public java.lang.Long getAnItDate() {
        return anItDate;
    }


    /**
     * Sets the anItDate value for this DoGetServiceInfoRequest.
     * 
     * @param anItDate
     */
    public void setAnItDate(java.lang.Long anItDate) {
        this.anItDate = anItDate;
    }


    /**
     * Gets the anItId value for this DoGetServiceInfoRequest.
     * 
     * @return anItId
     */
    public java.lang.Integer getAnItId() {
        return anItId;
    }


    /**
     * Sets the anItId value for this DoGetServiceInfoRequest.
     * 
     * @param anItId
     */
    public void setAnItId(java.lang.Integer anItId) {
        this.anItId = anItId;
    }


    /**
     * Gets the webapiKey value for this DoGetServiceInfoRequest.
     * 
     * @return webapiKey
     */
    public java.lang.String getWebapiKey() {
        return webapiKey;
    }


    /**
     * Sets the webapiKey value for this DoGetServiceInfoRequest.
     * 
     * @param webapiKey
     */
    public void setWebapiKey(java.lang.String webapiKey) {
        this.webapiKey = webapiKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoGetServiceInfoRequest)) return false;
        DoGetServiceInfoRequest other = (DoGetServiceInfoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.countryCode == other.getCountryCode() &&
            this.anCatId == other.getAnCatId() &&
            ((this.anItDate==null && other.getAnItDate()==null) || 
             (this.anItDate!=null &&
              this.anItDate.equals(other.getAnItDate()))) &&
            ((this.anItId==null && other.getAnItId()==null) || 
             (this.anItId!=null &&
              this.anItId.equals(other.getAnItId()))) &&
            ((this.webapiKey==null && other.getWebapiKey()==null) || 
             (this.webapiKey!=null &&
              this.webapiKey.equals(other.getWebapiKey())));
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
        _hashCode += getCountryCode();
        _hashCode += getAnCatId();
        if (getAnItDate() != null) {
            _hashCode += getAnItDate().hashCode();
        }
        if (getAnItId() != null) {
            _hashCode += getAnItId().hashCode();
        }
        if (getWebapiKey() != null) {
            _hashCode += getWebapiKey().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoGetServiceInfoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoGetServiceInfoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "countryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anCatId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "anCatId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anItDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "anItDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("anItId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "anItId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webapiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "webapiKey"));
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
