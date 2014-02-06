/**
 * Measurehistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Measurehistory  implements java.io.Serializable {
    private double meaHis_calories;

    private int meaHis_id;

    private java.util.Calendar meaHis_updated_time;

    private double meaHis_value;

    private unitn.introsde.storage_service.ws.Measuredefinition measuredefinition;

    private unitn.introsde.storage_service.ws.User user;

    public Measurehistory() {
    }

    public Measurehistory(
           double meaHis_calories,
           int meaHis_id,
           java.util.Calendar meaHis_updated_time,
           double meaHis_value,
           unitn.introsde.storage_service.ws.Measuredefinition measuredefinition,
           unitn.introsde.storage_service.ws.User user) {
           this.meaHis_calories = meaHis_calories;
           this.meaHis_id = meaHis_id;
           this.meaHis_updated_time = meaHis_updated_time;
           this.meaHis_value = meaHis_value;
           this.measuredefinition = measuredefinition;
           this.user = user;
    }


    /**
     * Gets the meaHis_calories value for this Measurehistory.
     * 
     * @return meaHis_calories
     */
    public double getMeaHis_calories() {
        return meaHis_calories;
    }


    /**
     * Sets the meaHis_calories value for this Measurehistory.
     * 
     * @param meaHis_calories
     */
    public void setMeaHis_calories(double meaHis_calories) {
        this.meaHis_calories = meaHis_calories;
    }


    /**
     * Gets the meaHis_id value for this Measurehistory.
     * 
     * @return meaHis_id
     */
    public int getMeaHis_id() {
        return meaHis_id;
    }


    /**
     * Sets the meaHis_id value for this Measurehistory.
     * 
     * @param meaHis_id
     */
    public void setMeaHis_id(int meaHis_id) {
        this.meaHis_id = meaHis_id;
    }


    /**
     * Gets the meaHis_updated_time value for this Measurehistory.
     * 
     * @return meaHis_updated_time
     */
    public java.util.Calendar getMeaHis_updated_time() {
        return meaHis_updated_time;
    }


    /**
     * Sets the meaHis_updated_time value for this Measurehistory.
     * 
     * @param meaHis_updated_time
     */
    public void setMeaHis_updated_time(java.util.Calendar meaHis_updated_time) {
        this.meaHis_updated_time = meaHis_updated_time;
    }


    /**
     * Gets the meaHis_value value for this Measurehistory.
     * 
     * @return meaHis_value
     */
    public double getMeaHis_value() {
        return meaHis_value;
    }


    /**
     * Sets the meaHis_value value for this Measurehistory.
     * 
     * @param meaHis_value
     */
    public void setMeaHis_value(double meaHis_value) {
        this.meaHis_value = meaHis_value;
    }


    /**
     * Gets the measuredefinition value for this Measurehistory.
     * 
     * @return measuredefinition
     */
    public unitn.introsde.storage_service.ws.Measuredefinition getMeasuredefinition() {
        return measuredefinition;
    }


    /**
     * Sets the measuredefinition value for this Measurehistory.
     * 
     * @param measuredefinition
     */
    public void setMeasuredefinition(unitn.introsde.storage_service.ws.Measuredefinition measuredefinition) {
        this.measuredefinition = measuredefinition;
    }


    /**
     * Gets the user value for this Measurehistory.
     * 
     * @return user
     */
    public unitn.introsde.storage_service.ws.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Measurehistory.
     * 
     * @param user
     */
    public void setUser(unitn.introsde.storage_service.ws.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Measurehistory)) return false;
        Measurehistory other = (Measurehistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.meaHis_calories == other.getMeaHis_calories() &&
            this.meaHis_id == other.getMeaHis_id() &&
            ((this.meaHis_updated_time==null && other.getMeaHis_updated_time()==null) || 
             (this.meaHis_updated_time!=null &&
              this.meaHis_updated_time.equals(other.getMeaHis_updated_time()))) &&
            this.meaHis_value == other.getMeaHis_value() &&
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
        _hashCode += new Double(getMeaHis_calories()).hashCode();
        _hashCode += getMeaHis_id();
        if (getMeaHis_updated_time() != null) {
            _hashCode += getMeaHis_updated_time().hashCode();
        }
        _hashCode += new Double(getMeaHis_value()).hashCode();
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
        new org.apache.axis.description.TypeDesc(Measurehistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "measurehistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaHis_calories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaHis_calories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaHis_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaHis_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaHis_updated_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaHis_updated_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("meaHis_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "meaHis_value"));
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
