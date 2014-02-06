/**
 * Tasktype.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Tasktype  implements java.io.Serializable {
    private unitn.introsde.storage_service.ws.Scheduledtask[] scheduledtasks;

    private java.lang.String taskType_description;

    private int taskType_id;

    private java.lang.String taskType_name;

    public Tasktype() {
    }

    public Tasktype(
           unitn.introsde.storage_service.ws.Scheduledtask[] scheduledtasks,
           java.lang.String taskType_description,
           int taskType_id,
           java.lang.String taskType_name) {
           this.scheduledtasks = scheduledtasks;
           this.taskType_description = taskType_description;
           this.taskType_id = taskType_id;
           this.taskType_name = taskType_name;
    }


    /**
     * Gets the scheduledtasks value for this Tasktype.
     * 
     * @return scheduledtasks
     */
    public unitn.introsde.storage_service.ws.Scheduledtask[] getScheduledtasks() {
        return scheduledtasks;
    }


    /**
     * Sets the scheduledtasks value for this Tasktype.
     * 
     * @param scheduledtasks
     */
    public void setScheduledtasks(unitn.introsde.storage_service.ws.Scheduledtask[] scheduledtasks) {
        this.scheduledtasks = scheduledtasks;
    }

    public unitn.introsde.storage_service.ws.Scheduledtask getScheduledtasks(int i) {
        return this.scheduledtasks[i];
    }

    public void setScheduledtasks(int i, unitn.introsde.storage_service.ws.Scheduledtask _value) {
        this.scheduledtasks[i] = _value;
    }


    /**
     * Gets the taskType_description value for this Tasktype.
     * 
     * @return taskType_description
     */
    public java.lang.String getTaskType_description() {
        return taskType_description;
    }


    /**
     * Sets the taskType_description value for this Tasktype.
     * 
     * @param taskType_description
     */
    public void setTaskType_description(java.lang.String taskType_description) {
        this.taskType_description = taskType_description;
    }


    /**
     * Gets the taskType_id value for this Tasktype.
     * 
     * @return taskType_id
     */
    public int getTaskType_id() {
        return taskType_id;
    }


    /**
     * Sets the taskType_id value for this Tasktype.
     * 
     * @param taskType_id
     */
    public void setTaskType_id(int taskType_id) {
        this.taskType_id = taskType_id;
    }


    /**
     * Gets the taskType_name value for this Tasktype.
     * 
     * @return taskType_name
     */
    public java.lang.String getTaskType_name() {
        return taskType_name;
    }


    /**
     * Sets the taskType_name value for this Tasktype.
     * 
     * @param taskType_name
     */
    public void setTaskType_name(java.lang.String taskType_name) {
        this.taskType_name = taskType_name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Tasktype)) return false;
        Tasktype other = (Tasktype) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.scheduledtasks==null && other.getScheduledtasks()==null) || 
             (this.scheduledtasks!=null &&
              java.util.Arrays.equals(this.scheduledtasks, other.getScheduledtasks()))) &&
            ((this.taskType_description==null && other.getTaskType_description()==null) || 
             (this.taskType_description!=null &&
              this.taskType_description.equals(other.getTaskType_description()))) &&
            this.taskType_id == other.getTaskType_id() &&
            ((this.taskType_name==null && other.getTaskType_name()==null) || 
             (this.taskType_name!=null &&
              this.taskType_name.equals(other.getTaskType_name())));
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
        if (getScheduledtasks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getScheduledtasks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getScheduledtasks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTaskType_description() != null) {
            _hashCode += getTaskType_description().hashCode();
        }
        _hashCode += getTaskType_id();
        if (getTaskType_name() != null) {
            _hashCode += getTaskType_name().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Tasktype.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "tasktype"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheduledtasks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheduledtasks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "scheduledtask"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType_description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskType_description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskType_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taskType_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "taskType_name"));
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
