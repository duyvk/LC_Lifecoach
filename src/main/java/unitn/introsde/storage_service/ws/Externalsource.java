/**
 * Externalsource.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Externalsource  implements java.io.Serializable {
    private int exSource_id;

    private java.lang.String exsourceDesc;

    private java.lang.String exsourceName;

    private java.lang.String exsourceUrl;

    public Externalsource() {
    }

    public Externalsource(
           int exSource_id,
           java.lang.String exsourceDesc,
           java.lang.String exsourceName,
           java.lang.String exsourceUrl) {
           this.exSource_id = exSource_id;
           this.exsourceDesc = exsourceDesc;
           this.exsourceName = exsourceName;
           this.exsourceUrl = exsourceUrl;
    }


    /**
     * Gets the exSource_id value for this Externalsource.
     * 
     * @return exSource_id
     */
    public int getExSource_id() {
        return exSource_id;
    }


    /**
     * Sets the exSource_id value for this Externalsource.
     * 
     * @param exSource_id
     */
    public void setExSource_id(int exSource_id) {
        this.exSource_id = exSource_id;
    }


    /**
     * Gets the exsourceDesc value for this Externalsource.
     * 
     * @return exsourceDesc
     */
    public java.lang.String getExsourceDesc() {
        return exsourceDesc;
    }


    /**
     * Sets the exsourceDesc value for this Externalsource.
     * 
     * @param exsourceDesc
     */
    public void setExsourceDesc(java.lang.String exsourceDesc) {
        this.exsourceDesc = exsourceDesc;
    }


    /**
     * Gets the exsourceName value for this Externalsource.
     * 
     * @return exsourceName
     */
    public java.lang.String getExsourceName() {
        return exsourceName;
    }


    /**
     * Sets the exsourceName value for this Externalsource.
     * 
     * @param exsourceName
     */
    public void setExsourceName(java.lang.String exsourceName) {
        this.exsourceName = exsourceName;
    }


    /**
     * Gets the exsourceUrl value for this Externalsource.
     * 
     * @return exsourceUrl
     */
    public java.lang.String getExsourceUrl() {
        return exsourceUrl;
    }


    /**
     * Sets the exsourceUrl value for this Externalsource.
     * 
     * @param exsourceUrl
     */
    public void setExsourceUrl(java.lang.String exsourceUrl) {
        this.exsourceUrl = exsourceUrl;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Externalsource)) return false;
        Externalsource other = (Externalsource) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.exSource_id == other.getExSource_id() &&
            ((this.exsourceDesc==null && other.getExsourceDesc()==null) || 
             (this.exsourceDesc!=null &&
              this.exsourceDesc.equals(other.getExsourceDesc()))) &&
            ((this.exsourceName==null && other.getExsourceName()==null) || 
             (this.exsourceName!=null &&
              this.exsourceName.equals(other.getExsourceName()))) &&
            ((this.exsourceUrl==null && other.getExsourceUrl()==null) || 
             (this.exsourceUrl!=null &&
              this.exsourceUrl.equals(other.getExsourceUrl())));
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
        _hashCode += getExSource_id();
        if (getExsourceDesc() != null) {
            _hashCode += getExsourceDesc().hashCode();
        }
        if (getExsourceName() != null) {
            _hashCode += getExsourceName().hashCode();
        }
        if (getExsourceUrl() != null) {
            _hashCode += getExsourceUrl().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Externalsource.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "externalsource"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exSource_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exSource_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exsourceDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exsourceDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exsourceName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exsourceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exsourceUrl");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exsourceUrl"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
