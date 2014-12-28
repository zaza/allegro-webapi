/**
 * DoShowCatRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoShowCatRequest  implements java.io.Serializable {
    private java.lang.String sessionHandle;

    private int catId;

    private java.lang.Integer catItemState;

    private java.lang.Integer catItemOption;

    private com.allegro.webapi.DurationTimeInfo catItemDurationOption;

    private com.allegro.webapi.ArrayOfFieldsvalue catAttribFields;

    private java.lang.Integer catSortOptions;

    private com.allegro.webapi.PriceCatInfo catItemsPrice;

    private java.lang.Integer catItemsOffset;

    private java.lang.Integer catItemsLimit;

    private java.lang.Integer catOrderFulfillmentTime;

    public DoShowCatRequest() {
    }

    public DoShowCatRequest(
           java.lang.String sessionHandle,
           int catId,
           java.lang.Integer catItemState,
           java.lang.Integer catItemOption,
           com.allegro.webapi.DurationTimeInfo catItemDurationOption,
           com.allegro.webapi.ArrayOfFieldsvalue catAttribFields,
           java.lang.Integer catSortOptions,
           com.allegro.webapi.PriceCatInfo catItemsPrice,
           java.lang.Integer catItemsOffset,
           java.lang.Integer catItemsLimit,
           java.lang.Integer catOrderFulfillmentTime) {
           this.sessionHandle = sessionHandle;
           this.catId = catId;
           this.catItemState = catItemState;
           this.catItemOption = catItemOption;
           this.catItemDurationOption = catItemDurationOption;
           this.catAttribFields = catAttribFields;
           this.catSortOptions = catSortOptions;
           this.catItemsPrice = catItemsPrice;
           this.catItemsOffset = catItemsOffset;
           this.catItemsLimit = catItemsLimit;
           this.catOrderFulfillmentTime = catOrderFulfillmentTime;
    }


    /**
     * Gets the sessionHandle value for this DoShowCatRequest.
     * 
     * @return sessionHandle
     */
    public java.lang.String getSessionHandle() {
        return sessionHandle;
    }


    /**
     * Sets the sessionHandle value for this DoShowCatRequest.
     * 
     * @param sessionHandle
     */
    public void setSessionHandle(java.lang.String sessionHandle) {
        this.sessionHandle = sessionHandle;
    }


    /**
     * Gets the catId value for this DoShowCatRequest.
     * 
     * @return catId
     */
    public int getCatId() {
        return catId;
    }


    /**
     * Sets the catId value for this DoShowCatRequest.
     * 
     * @param catId
     */
    public void setCatId(int catId) {
        this.catId = catId;
    }


    /**
     * Gets the catItemState value for this DoShowCatRequest.
     * 
     * @return catItemState
     */
    public java.lang.Integer getCatItemState() {
        return catItemState;
    }


    /**
     * Sets the catItemState value for this DoShowCatRequest.
     * 
     * @param catItemState
     */
    public void setCatItemState(java.lang.Integer catItemState) {
        this.catItemState = catItemState;
    }


    /**
     * Gets the catItemOption value for this DoShowCatRequest.
     * 
     * @return catItemOption
     */
    public java.lang.Integer getCatItemOption() {
        return catItemOption;
    }


    /**
     * Sets the catItemOption value for this DoShowCatRequest.
     * 
     * @param catItemOption
     */
    public void setCatItemOption(java.lang.Integer catItemOption) {
        this.catItemOption = catItemOption;
    }


    /**
     * Gets the catItemDurationOption value for this DoShowCatRequest.
     * 
     * @return catItemDurationOption
     */
    public com.allegro.webapi.DurationTimeInfo getCatItemDurationOption() {
        return catItemDurationOption;
    }


    /**
     * Sets the catItemDurationOption value for this DoShowCatRequest.
     * 
     * @param catItemDurationOption
     */
    public void setCatItemDurationOption(com.allegro.webapi.DurationTimeInfo catItemDurationOption) {
        this.catItemDurationOption = catItemDurationOption;
    }


    /**
     * Gets the catAttribFields value for this DoShowCatRequest.
     * 
     * @return catAttribFields
     */
    public com.allegro.webapi.ArrayOfFieldsvalue getCatAttribFields() {
        return catAttribFields;
    }


    /**
     * Sets the catAttribFields value for this DoShowCatRequest.
     * 
     * @param catAttribFields
     */
    public void setCatAttribFields(com.allegro.webapi.ArrayOfFieldsvalue catAttribFields) {
        this.catAttribFields = catAttribFields;
    }


    /**
     * Gets the catSortOptions value for this DoShowCatRequest.
     * 
     * @return catSortOptions
     */
    public java.lang.Integer getCatSortOptions() {
        return catSortOptions;
    }


    /**
     * Sets the catSortOptions value for this DoShowCatRequest.
     * 
     * @param catSortOptions
     */
    public void setCatSortOptions(java.lang.Integer catSortOptions) {
        this.catSortOptions = catSortOptions;
    }


    /**
     * Gets the catItemsPrice value for this DoShowCatRequest.
     * 
     * @return catItemsPrice
     */
    public com.allegro.webapi.PriceCatInfo getCatItemsPrice() {
        return catItemsPrice;
    }


    /**
     * Sets the catItemsPrice value for this DoShowCatRequest.
     * 
     * @param catItemsPrice
     */
    public void setCatItemsPrice(com.allegro.webapi.PriceCatInfo catItemsPrice) {
        this.catItemsPrice = catItemsPrice;
    }


    /**
     * Gets the catItemsOffset value for this DoShowCatRequest.
     * 
     * @return catItemsOffset
     */
    public java.lang.Integer getCatItemsOffset() {
        return catItemsOffset;
    }


    /**
     * Sets the catItemsOffset value for this DoShowCatRequest.
     * 
     * @param catItemsOffset
     */
    public void setCatItemsOffset(java.lang.Integer catItemsOffset) {
        this.catItemsOffset = catItemsOffset;
    }


    /**
     * Gets the catItemsLimit value for this DoShowCatRequest.
     * 
     * @return catItemsLimit
     */
    public java.lang.Integer getCatItemsLimit() {
        return catItemsLimit;
    }


    /**
     * Sets the catItemsLimit value for this DoShowCatRequest.
     * 
     * @param catItemsLimit
     */
    public void setCatItemsLimit(java.lang.Integer catItemsLimit) {
        this.catItemsLimit = catItemsLimit;
    }


    /**
     * Gets the catOrderFulfillmentTime value for this DoShowCatRequest.
     * 
     * @return catOrderFulfillmentTime
     */
    public java.lang.Integer getCatOrderFulfillmentTime() {
        return catOrderFulfillmentTime;
    }


    /**
     * Sets the catOrderFulfillmentTime value for this DoShowCatRequest.
     * 
     * @param catOrderFulfillmentTime
     */
    public void setCatOrderFulfillmentTime(java.lang.Integer catOrderFulfillmentTime) {
        this.catOrderFulfillmentTime = catOrderFulfillmentTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowCatRequest)) return false;
        DoShowCatRequest other = (DoShowCatRequest) obj;
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
            this.catId == other.getCatId() &&
            ((this.catItemState==null && other.getCatItemState()==null) || 
             (this.catItemState!=null &&
              this.catItemState.equals(other.getCatItemState()))) &&
            ((this.catItemOption==null && other.getCatItemOption()==null) || 
             (this.catItemOption!=null &&
              this.catItemOption.equals(other.getCatItemOption()))) &&
            ((this.catItemDurationOption==null && other.getCatItemDurationOption()==null) || 
             (this.catItemDurationOption!=null &&
              this.catItemDurationOption.equals(other.getCatItemDurationOption()))) &&
            ((this.catAttribFields==null && other.getCatAttribFields()==null) || 
             (this.catAttribFields!=null &&
              this.catAttribFields.equals(other.getCatAttribFields()))) &&
            ((this.catSortOptions==null && other.getCatSortOptions()==null) || 
             (this.catSortOptions!=null &&
              this.catSortOptions.equals(other.getCatSortOptions()))) &&
            ((this.catItemsPrice==null && other.getCatItemsPrice()==null) || 
             (this.catItemsPrice!=null &&
              this.catItemsPrice.equals(other.getCatItemsPrice()))) &&
            ((this.catItemsOffset==null && other.getCatItemsOffset()==null) || 
             (this.catItemsOffset!=null &&
              this.catItemsOffset.equals(other.getCatItemsOffset()))) &&
            ((this.catItemsLimit==null && other.getCatItemsLimit()==null) || 
             (this.catItemsLimit!=null &&
              this.catItemsLimit.equals(other.getCatItemsLimit()))) &&
            ((this.catOrderFulfillmentTime==null && other.getCatOrderFulfillmentTime()==null) || 
             (this.catOrderFulfillmentTime!=null &&
              this.catOrderFulfillmentTime.equals(other.getCatOrderFulfillmentTime())));
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
        _hashCode += getCatId();
        if (getCatItemState() != null) {
            _hashCode += getCatItemState().hashCode();
        }
        if (getCatItemOption() != null) {
            _hashCode += getCatItemOption().hashCode();
        }
        if (getCatItemDurationOption() != null) {
            _hashCode += getCatItemDurationOption().hashCode();
        }
        if (getCatAttribFields() != null) {
            _hashCode += getCatAttribFields().hashCode();
        }
        if (getCatSortOptions() != null) {
            _hashCode += getCatSortOptions().hashCode();
        }
        if (getCatItemsPrice() != null) {
            _hashCode += getCatItemsPrice().hashCode();
        }
        if (getCatItemsOffset() != null) {
            _hashCode += getCatItemsOffset().hashCode();
        }
        if (getCatItemsLimit() != null) {
            _hashCode += getCatItemsLimit().hashCode();
        }
        if (getCatOrderFulfillmentTime() != null) {
            _hashCode += getCatOrderFulfillmentTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowCatRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">DoShowCatRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionHandle");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "sessionHandle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catId");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemState");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemDurationOption");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemDurationOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "DurationTimeInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catAttribFields");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catAttribFields"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfFieldsvalue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catSortOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catSortOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemsPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "PriceCatInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemsOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemsLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catOrderFulfillmentTime");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catOrderFulfillmentTime"));
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
