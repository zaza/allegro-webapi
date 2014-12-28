/**
 * DoShowCatResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.allegro.webapi;

public class DoShowCatResponse  implements java.io.Serializable {
    private com.allegro.webapi.ArrayOfInfocatlist catParentArray;

    private com.allegro.webapi.ArrayOfInfocatlist catChildArray;

    private com.allegro.webapi.ArrayOfInfocatlist catSisterArray;

    private int catItemsCount;

    private int catItemsCountFeatured;

    private com.allegro.webapi.ArrayOfSearchresponsetype catItemsArray;

    public DoShowCatResponse() {
    }

    public DoShowCatResponse(
           com.allegro.webapi.ArrayOfInfocatlist catParentArray,
           com.allegro.webapi.ArrayOfInfocatlist catChildArray,
           com.allegro.webapi.ArrayOfInfocatlist catSisterArray,
           int catItemsCount,
           int catItemsCountFeatured,
           com.allegro.webapi.ArrayOfSearchresponsetype catItemsArray) {
           this.catParentArray = catParentArray;
           this.catChildArray = catChildArray;
           this.catSisterArray = catSisterArray;
           this.catItemsCount = catItemsCount;
           this.catItemsCountFeatured = catItemsCountFeatured;
           this.catItemsArray = catItemsArray;
    }


    /**
     * Gets the catParentArray value for this DoShowCatResponse.
     * 
     * @return catParentArray
     */
    public com.allegro.webapi.ArrayOfInfocatlist getCatParentArray() {
        return catParentArray;
    }


    /**
     * Sets the catParentArray value for this DoShowCatResponse.
     * 
     * @param catParentArray
     */
    public void setCatParentArray(com.allegro.webapi.ArrayOfInfocatlist catParentArray) {
        this.catParentArray = catParentArray;
    }


    /**
     * Gets the catChildArray value for this DoShowCatResponse.
     * 
     * @return catChildArray
     */
    public com.allegro.webapi.ArrayOfInfocatlist getCatChildArray() {
        return catChildArray;
    }


    /**
     * Sets the catChildArray value for this DoShowCatResponse.
     * 
     * @param catChildArray
     */
    public void setCatChildArray(com.allegro.webapi.ArrayOfInfocatlist catChildArray) {
        this.catChildArray = catChildArray;
    }


    /**
     * Gets the catSisterArray value for this DoShowCatResponse.
     * 
     * @return catSisterArray
     */
    public com.allegro.webapi.ArrayOfInfocatlist getCatSisterArray() {
        return catSisterArray;
    }


    /**
     * Sets the catSisterArray value for this DoShowCatResponse.
     * 
     * @param catSisterArray
     */
    public void setCatSisterArray(com.allegro.webapi.ArrayOfInfocatlist catSisterArray) {
        this.catSisterArray = catSisterArray;
    }


    /**
     * Gets the catItemsCount value for this DoShowCatResponse.
     * 
     * @return catItemsCount
     */
    public int getCatItemsCount() {
        return catItemsCount;
    }


    /**
     * Sets the catItemsCount value for this DoShowCatResponse.
     * 
     * @param catItemsCount
     */
    public void setCatItemsCount(int catItemsCount) {
        this.catItemsCount = catItemsCount;
    }


    /**
     * Gets the catItemsCountFeatured value for this DoShowCatResponse.
     * 
     * @return catItemsCountFeatured
     */
    public int getCatItemsCountFeatured() {
        return catItemsCountFeatured;
    }


    /**
     * Sets the catItemsCountFeatured value for this DoShowCatResponse.
     * 
     * @param catItemsCountFeatured
     */
    public void setCatItemsCountFeatured(int catItemsCountFeatured) {
        this.catItemsCountFeatured = catItemsCountFeatured;
    }


    /**
     * Gets the catItemsArray value for this DoShowCatResponse.
     * 
     * @return catItemsArray
     */
    public com.allegro.webapi.ArrayOfSearchresponsetype getCatItemsArray() {
        return catItemsArray;
    }


    /**
     * Sets the catItemsArray value for this DoShowCatResponse.
     * 
     * @param catItemsArray
     */
    public void setCatItemsArray(com.allegro.webapi.ArrayOfSearchresponsetype catItemsArray) {
        this.catItemsArray = catItemsArray;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DoShowCatResponse)) return false;
        DoShowCatResponse other = (DoShowCatResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.catParentArray==null && other.getCatParentArray()==null) || 
             (this.catParentArray!=null &&
              this.catParentArray.equals(other.getCatParentArray()))) &&
            ((this.catChildArray==null && other.getCatChildArray()==null) || 
             (this.catChildArray!=null &&
              this.catChildArray.equals(other.getCatChildArray()))) &&
            ((this.catSisterArray==null && other.getCatSisterArray()==null) || 
             (this.catSisterArray!=null &&
              this.catSisterArray.equals(other.getCatSisterArray()))) &&
            this.catItemsCount == other.getCatItemsCount() &&
            this.catItemsCountFeatured == other.getCatItemsCountFeatured() &&
            ((this.catItemsArray==null && other.getCatItemsArray()==null) || 
             (this.catItemsArray!=null &&
              this.catItemsArray.equals(other.getCatItemsArray())));
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
        if (getCatParentArray() != null) {
            _hashCode += getCatParentArray().hashCode();
        }
        if (getCatChildArray() != null) {
            _hashCode += getCatChildArray().hashCode();
        }
        if (getCatSisterArray() != null) {
            _hashCode += getCatSisterArray().hashCode();
        }
        _hashCode += getCatItemsCount();
        _hashCode += getCatItemsCountFeatured();
        if (getCatItemsArray() != null) {
            _hashCode += getCatItemsArray().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DoShowCatResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", ">doShowCatResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catParentArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catParentArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInfocatlist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catChildArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catChildArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInfocatlist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catSisterArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catSisterArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfInfocatlist"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsCount");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemsCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsCountFeatured");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemsCountFeatured"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("catItemsArray");
        elemField.setXmlName(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "catItemsArray"));
        elemField.setXmlType(new javax.xml.namespace.QName("https://webapi.allegro.pl/service.php", "ArrayOfSearchresponsetype"));
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
