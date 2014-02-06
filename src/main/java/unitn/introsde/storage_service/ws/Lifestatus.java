/**
 * Lifestatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Lifestatus  implements java.io.Serializable {
    private int lifeStatus_id;

    private java.util.Calendar lifeStatus_update_time;

    private double lifeStatus_value;

    private unitn.introsde.storage_service.ws.Measuredefinition measuredefinition;

    private unitn.introsde.storage_service.ws.User user;

    public Lifestatus() {
    }

    public Lifestatus(
           int lifeStatus_id,
           java.util.Calendar lifeStatus_update_time,
           double lifeStatus_value,
           unitn.introsde.storage_service.ws.Measuredefinition measuredefinition,
           unitn.introsde.storage_service.ws.User user) {
           this.lifeStatus_id = lifeStatus_id;
           this.lifeStatus_update_time = lifeStatus_update_time;
           this.lifeStatus_value = lifeStatus_value;
           this.measuredefinition = measuredefinition;
           this.user = user;
    }


    /**
     * Gets the lifeStatus_id value for this Lifestatus.
     * 
     * @return lifeStatus_id
     */
    public int getLifeStatus_id() {
        return lifeStatus_id;
    }


    /**
     * Sets the lifeStatus_id value for this Lifestatus.
     * 
     * @param lifeStatus_id
     */
    public void setLifeStatus_id(int lifeStatus_id) {
        this.lifeStatus_id = lifeStatus_id;
    }


    /**
     * Gets the lifeStatus_update_time value for this Lifestatus.
     * 
     * @return lifeStatus_update_time
     */
    public java.util.Calendar getLifeStatus_update_time() {
        return lifeStatus_update_time;
    }


    /**
     * Sets the lifeStatus_update_time value for this Lifestatus.
     * 
     * @param lifeStatus_update_time
     */
    public void setLifeStatus_update_time(java.util.Calendar lifeStatus_update_time) {
        this.lifeStatus_update_time = lifeStatus_update_time;
    }


    /**
     * Gets the lifeStatus_value value for this Lifestatus.
     * 
     * @return lifeStatus_value
     */
    public double getLifeStatus_value() {
        return lifeStatus_value;
    }


    /**
     * Sets the lifeStatus_value value for this Lifestatus.
     * 
     * @param lifeStatus_value
     */
    public void setLifeStatus_value(double lifeStatus_value) {
        this.lifeStatus_value = lifeStatus_value;
    }


    /**
     * Gets the measuredefinition value for this Lifestatus.
     * 
     * @return measuredefinition
     */
    public unitn.introsde.storage_service.ws.Measuredefinition getMeasuredefinition() {
        return measuredefinition;
    }


    /**
     * Sets the measuredefinition value for this Lifestatus.
     * 
     * @param measuredefinition
     */
    public void setMeasuredefinition(unitn.introsde.storage_service.ws.Measuredefinition measuredefinition) {
        this.measuredefinition = measuredefinition;
    }


    /**
     * Gets the user value for this Lifestatus.
     * 
     * @return user
     */
    public unitn.introsde.storage_service.ws.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Lifestatus.
     * 
     * @param user
     */
    public void setUser(unitn.introsde.storage_service.ws.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Lifestatus)) return false;
        Lifestatus other = (Lifestatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lifeStatus_id == other.getLifeStatus_id() &&
            ((this.lifeStatus_update_time==null && other.getLifeStatus_update_time()==null) || 
             (this.lifeStatus_update_time!=null &&
              this.lifeStatus_update_time.equals(other.getLifeStatus_update_time()))) &&
            this.lifeStatus_value == other.getLifeStatus_value() &&
            ((this.measuredefinition==null && other.getMeasuredefinition()==null) || 
             (this.measuredefinition!=null &&
              this.measuredefinition.equals(other.getMeasuredefinition()))) &&
            ((this.user==null && other.getUser()==null) || 
             (this.user!=null &&
              this.user.equals(other.getUser())));
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
        _hashCode += getLifeStatus_id();
        if (getLifeStatus_update_time() != null) {
            _hashCode += getLifeStatus_update_time().hashCode();
        }
        _hashCode += new Double(getLifeStatus_value()).hashCode();
        if (getMeasuredefinition() != null) {
            _hashCode += getMeasuredefinition().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Lifestatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "lifestatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeStatus_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifeStatus_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeStatus_update_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifeStatus_update_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lifeStatus_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lifeStatus_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("measuredefinition");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "measuredefinition"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "measuredefinition"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("user");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "user"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "user"));
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
