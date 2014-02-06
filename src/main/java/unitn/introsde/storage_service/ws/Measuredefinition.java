/**
 * Measuredefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Measuredefinition  implements java.io.Serializable {
    private double MET;

    private java.lang.String meaDef_description;

    private int meaDef_id;

    private java.lang.String meaDef_name;

    private java.lang.String meaDef_type;

    private java.lang.String meaDef_unit;

    public Measuredefinition() {
    }

    public Measuredefinition(
           double MET,
           java.lang.String meaDef_description,
           int meaDef_id,
           java.lang.String meaDef_name,
           java.lang.String meaDef_type,
           java.lang.String meaDef_unit) {
           this.MET = MET;
           this.meaDef_description = meaDef_description;
           this.meaDef_id = meaDef_id;
           this.meaDef_name = meaDef_name;
           this.meaDef_type = meaDef_type;
           this.meaDef_unit = meaDef_unit;
    }


    /**
     * Gets the MET value for this Measuredefinition.
     * 
     * @return MET
     */
    public double getMET() {
        return MET;
    }


    /**
     * Sets the MET value for this Measuredefinition.
     * 
     * @param MET
     */
    public void setMET(double MET) {
        this.MET = MET;
    }


    /**
     * Gets the meaDef_description value for this Measuredefinition.
     * 
     * @return meaDef_description
     */
    public java.lang.String getMeaDef_description() {
        return meaDef_description;
    }


    /**
     * Sets the meaDef_description value for this Measuredefinition.
     * 
     * @param meaDef_description
     */
    public void setMeaDef_description(java.lang.String meaDef_description) {
        this.meaDef_description = meaDef_description;
    }


    /**
     * Gets the meaDef_id value for this Measuredefinition.
     * 
     * @return meaDef_id
     */
    public int getMeaDef_id() {
        return meaDef_id;
    }


    /**
     * Sets the meaDef_id value for this Measuredefinition.
     * 
     * @param meaDef_id
     */
    public void setMeaDef_id(int meaDef_id) {
        this.meaDef_id = meaDef_id;
    }


    /**
     * Gets the meaDef_name value for this Measuredefinition.
     * 
     * @return meaDef_name
     */
    public java.lang.String getMeaDef_name() {
        return meaDef_name;
    }


    /**
     * Sets the meaDef_name value for this Measuredefinition.
     * 
     * @param meaDef_name
     */
    public void setMeaDef_name(java.lang.String meaDef_name) {
        this.meaDef_name = meaDef_name;
    }


    /**
     * Gets the meaDef_type value for this Measuredefinition.
     * 
     * @return meaDef_type
     */
    public java.lang.String getMeaDef_type() {
        return meaDef_type;
    }


    /**
     * Sets the meaDef_type value for this Measuredefinition.
     * 
     * @param meaDef_type
     */
    public void setMeaDef_type(java.lang.String meaDef_type) {
        this.meaDef_type = meaDef_type;
    }


    /**
     * Gets the meaDef_unit value for this Measuredefinition.
     * 
     * @return meaDef_unit
     */
    public java.lang.String getMeaDef_unit() {
        return meaDef_unit;
    }


    /**
     * Sets the meaDef_unit value for this Measuredefinition.
     * 
     * @param meaDef_unit
     */
    public void setMeaDef_unit(java.lang.String meaDef_unit) {
        this.meaDef_unit = meaDef_unit;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Measuredefinition)) return false;
        Measuredefinition other = (Measuredefinition) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.MET == other.getMET() &&
            ((this.meaDef_description==null && other.getMeaDef_description()==null) || 
             (this.meaDef_description!=null &&
              this.meaDef_description.equals(other.getMeaDef_description()))) &&
            this.meaDef_id == other.getMeaDef_id() &&
            ((this.meaDef_name==null && other.getMeaDef_name()==null) || 
             (this.meaDef_name!=null &&
              this.meaDef_name.equals(other.getMeaDef_name()))) &&
            ((this.meaDef_type==null && other.getMeaDef_type()==null) || 
             (this.meaDef_type!=null &&
              this.meaDef_type.equals(other.getMeaDef_type()))) &&
            ((this.meaDef_unit==null && other.getMeaDef_unit()==null) || 
             (this.meaDef_unit!=null &&
              this.meaDef_unit.equals(other.getMeaDef_unit())));
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
        _hashCode += new Double(getMET()).hashCode();
        if (getMeaDef_description() != null) {
            _hashCode += getMeaDef_description().hashCode();
        }
        _hashCode += getMeaDef_id();
        if (getMeaDef_name() != null) {
            _hashCode += getMeaDef_name().hashCode();
        }
        if (getMeaDef_type() != null) {
            _hashCode += getMeaDef_type().hashCode();
        }
        if (getMeaDef_unit() != null) {
            _hashCode += getMeaDef_unit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Measuredefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "measuredefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MET");
        elemField.setXmlName(new javax.xml.namespace.QName("", "MET"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaDef_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaDef_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaDef_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaDef_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaDef_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaDef_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaDef_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaDef_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaDef_unit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaDef_unit"));
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
