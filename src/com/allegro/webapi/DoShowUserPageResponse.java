/**
 * DoShowUserPageResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoShowUserPageResponse  implements java.io.Serializable {
    private java.lang.String userPageContent;

    private java.lang.String userPagePharmacyPermit;

    private java.lang.String userPageAlcoholPermit;

    public DoShowUserPageResponse() {
    }

    public DoShowUserPageResponse(
           java.lang.String userPageContent,
           java.lang.String userPagePharmacyPermit,
           java.lang.String userPageAlcoholPermit) {
           this.userPageContent = userPageContent;
           this.userPagePharmacyPermit = userPagePharmacyPermit;
           this.userPageAlcoholPermit = userPageAlcoholPermit;
    }


    /**
     * Gets the userPageContent value for this DoShowUserPageResponse.
     * 
     * @return userPageContent
     */
    public java.lang.String getUserPageContent() {
        return userPageContent;
    }


    /**
     * Sets the userPageContent value for this DoShowUserPageResponse.
     * 
     * @param userPageContent
     */
    public void setUserPageContent(java.lang.String userPageContent) {
        this.userPageContent = userPageContent;
    }


    /**
     * Gets the userPagePharmacyPermit value for this DoShowUserPageResponse.
     * 
     * @return userPagePharmacyPermit
     */
    public java.lang.String getUserPagePharmacyPermit() {
        return userPagePharmacyPermit;
    }


    /**
     * Sets the userPagePharmacyPermit value for this DoShowUserPageResponse.
     * 
     * @param userPagePharmacyPermit
     */
    public void setUserPagePharmacyPermit(java.lang.String userPagePharmacyPermit) {
        this.userPagePharmacyPermit = userPagePharmacyPermit;
    }


    /**
     * Gets the userPageAlcoholPermit value for this DoShowUserPageResponse.
     * 
     * @return userPageAlcoholPermit
     */
    public java.lang.String getUserPageAlcoholPermit() {
        return userPageAlcoholPermit;
    }


    /**
     * Sets the userPageAlcoholPermit value for this DoShowUserPageResponse.
     * 
     * @param userPageAlcoholPermit
     */
    public void setUserPageAlcoholPermit(java.lang.String userPageAlcoholPermit) {
        this.userPageAlcoholPermit = userPageAlcoholPermit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowUserPageResponse)) return false;
        DoShowUserPageResponse other = (DoShowUserPageResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userPageContent==null && other.getUserPageContent()==null) || 
             (this.userPageContent!=null &&
              this.userPageContent.equals(other.getUserPageContent()))) &&
            ((this.userPagePharmacyPermit==null && other.getUserPagePharmacyPermit()==null) || 
             (this.userPagePharmacyPermit!=null &&
              this.userPagePharmacyPermit.equals(other.getUserPagePharmacyPermit()))) &&
            ((this.userPageAlcoholPermit==null && other.getUserPageAlcoholPermit()==null) || 
             (this.userPageAlcoholPermit!=null &&
              this.userPageAlcoholPermit.equals(other.getUserPageAlcoholPermit())));
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
        if (getUserPageContent() != null) {
            _hashCode += getUserPageContent().hashCode();
        }
        if (getUserPagePharmacyPermit() != null) {
            _hashCode += getUserPagePharmacyPermit().hashCode();
        }
        if (getUserPageAlcoholPermit() != null) {
            _hashCode += getUserPageAlcoholPermit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowUserPageResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowUserPageResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPageContent");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userPageContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPagePharmacyPermit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userPagePharmacyPermit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userPageAlcoholPermit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userPageAlcoholPermit"));
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
