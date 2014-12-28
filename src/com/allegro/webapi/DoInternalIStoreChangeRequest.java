/**
 * DoInternalIStoreChangeRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoInternalIStoreChangeRequest  implements java.io.Serializable {
    private java.lang.String webapiKey;

    private long userId;

    private long istoreId;

    private java.lang.String actionType;

    private long actionDate;

    private long validDate;

    public DoInternalIStoreChangeRequest() {
    }

    public DoInternalIStoreChangeRequest(
           java.lang.String webapiKey,
           long userId,
           long istoreId,
           java.lang.String actionType,
           long actionDate,
           long validDate) {
           this.webapiKey = webapiKey;
           this.userId = userId;
           this.istoreId = istoreId;
           this.actionType = actionType;
           this.actionDate = actionDate;
           this.validDate = validDate;
    }


    /**
     * Gets the webapiKey value for this DoInternalIStoreChangeRequest.
     * 
     * @return webapiKey
     */
    public java.lang.String getWebapiKey() {
        return webapiKey;
    }


    /**
     * Sets the webapiKey value for this DoInternalIStoreChangeRequest.
     * 
     * @param webapiKey
     */
    public void setWebapiKey(java.lang.String webapiKey) {
        this.webapiKey = webapiKey;
    }


    /**
     * Gets the userId value for this DoInternalIStoreChangeRequest.
     * 
     * @return userId
     */
    public long getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this DoInternalIStoreChangeRequest.
     * 
     * @param userId
     */
    public void setUserId(long userId) {
        this.userId = userId;
    }


    /**
     * Gets the istoreId value for this DoInternalIStoreChangeRequest.
     * 
     * @return istoreId
     */
    public long getIstoreId() {
        return istoreId;
    }


    /**
     * Sets the istoreId value for this DoInternalIStoreChangeRequest.
     * 
     * @param istoreId
     */
    public void setIstoreId(long istoreId) {
        this.istoreId = istoreId;
    }


    /**
     * Gets the actionType value for this DoInternalIStoreChangeRequest.
     * 
     * @return actionType
     */
    public java.lang.String getActionType() {
        return actionType;
    }


    /**
     * Sets the actionType value for this DoInternalIStoreChangeRequest.
     * 
     * @param actionType
     */
    public void setActionType(java.lang.String actionType) {
        this.actionType = actionType;
    }


    /**
     * Gets the actionDate value for this DoInternalIStoreChangeRequest.
     * 
     * @return actionDate
     */
    public long getActionDate() {
        return actionDate;
    }


    /**
     * Sets the actionDate value for this DoInternalIStoreChangeRequest.
     * 
     * @param actionDate
     */
    public void setActionDate(long actionDate) {
        this.actionDate = actionDate;
    }


    /**
     * Gets the validDate value for this DoInternalIStoreChangeRequest.
     * 
     * @return validDate
     */
    public long getValidDate() {
        return validDate;
    }


    /**
     * Sets the validDate value for this DoInternalIStoreChangeRequest.
     * 
     * @param validDate
     */
    public void setValidDate(long validDate) {
        this.validDate = validDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoInternalIStoreChangeRequest)) return false;
        DoInternalIStoreChangeRequest other = (DoInternalIStoreChangeRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.webapiKey==null && other.getWebapiKey()==null) || 
             (this.webapiKey!=null &&
              this.webapiKey.equals(other.getWebapiKey()))) &&
            this.userId == other.getUserId() &&
            this.istoreId == other.getIstoreId() &&
            ((this.actionType==null && other.getActionType()==null) || 
             (this.actionType!=null &&
              this.actionType.equals(other.getActionType()))) &&
            this.actionDate == other.getActionDate() &&
            this.validDate == other.getValidDate();
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
        if (getWebapiKey() != null) {
            _hashCode += getWebapiKey().hashCode();
        }
        _hashCode += new Long(getUserId()).hashCode();
        _hashCode += new Long(getIstoreId()).hashCode();
        if (getActionType() != null) {
            _hashCode += getActionType().hashCode();
        }
        _hashCode += new Long(getActionDate()).hashCode();
        _hashCode += new Long(getValidDate()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoInternalIStoreChangeRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoInternalIStoreChangeRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webapiKey");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "webapiKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("istoreId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "istoreId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionType");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "actionType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "actionDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validDate");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "validDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
