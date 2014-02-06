/**
 * Scheduledtask.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Scheduledtask  implements java.io.Serializable {
    private unitn.introsde.storage_service.ws.Caregiver caregiver;

    private java.lang.String schTask_address;

    private int schTask_cg_checked;

    private java.lang.String schTask_note;

    private int schTask_status;

    private int schTask_user_checked;

    private java.util.Calendar scheTask_from_time;

    private int scheTask_id;

    private java.util.Calendar scheTask_to_time;

    private unitn.introsde.storage_service.ws.Tasktype tasktype;

    private unitn.introsde.storage_service.ws.User user;

    public Scheduledtask() {
    }

    public Scheduledtask(
           unitn.introsde.storage_service.ws.Caregiver caregiver,
           java.lang.String schTask_address,
           int schTask_cg_checked,
           java.lang.String schTask_note,
           int schTask_status,
           int schTask_user_checked,
           java.util.Calendar scheTask_from_time,
           int scheTask_id,
           java.util.Calendar scheTask_to_time,
           unitn.introsde.storage_service.ws.Tasktype tasktype,
           unitn.introsde.storage_service.ws.User user) {
           this.caregiver = caregiver;
           this.schTask_address = schTask_address;
           this.schTask_cg_checked = schTask_cg_checked;
           this.schTask_note = schTask_note;
           this.schTask_status = schTask_status;
           this.schTask_user_checked = schTask_user_checked;
           this.scheTask_from_time = scheTask_from_time;
           this.scheTask_id = scheTask_id;
           this.scheTask_to_time = scheTask_to_time;
           this.tasktype = tasktype;
           this.user = user;
    }


    /**
     * Gets the caregiver value for this Scheduledtask.
     * 
     * @return caregiver
     */
    public unitn.introsde.storage_service.ws.Caregiver getCaregiver() {
        return caregiver;
    }


    /**
     * Sets the caregiver value for this Scheduledtask.
     * 
     * @param caregiver
     */
    public void setCaregiver(unitn.introsde.storage_service.ws.Caregiver caregiver) {
        this.caregiver = caregiver;
    }


    /**
     * Gets the schTask_address value for this Scheduledtask.
     * 
     * @return schTask_address
     */
    public java.lang.String getSchTask_address() {
        return schTask_address;
    }


    /**
     * Sets the schTask_address value for this Scheduledtask.
     * 
     * @param schTask_address
     */
    public void setSchTask_address(java.lang.String schTask_address) {
        this.schTask_address = schTask_address;
    }


    /**
     * Gets the schTask_cg_checked value for this Scheduledtask.
     * 
     * @return schTask_cg_checked
     */
    public int getSchTask_cg_checked() {
        return schTask_cg_checked;
    }


    /**
     * Sets the schTask_cg_checked value for this Scheduledtask.
     * 
     * @param schTask_cg_checked
     */
    public void setSchTask_cg_checked(int schTask_cg_checked) {
        this.schTask_cg_checked = schTask_cg_checked;
    }


    /**
     * Gets the schTask_note value for this Scheduledtask.
     * 
     * @return schTask_note
     */
    public java.lang.String getSchTask_note() {
        return schTask_note;
    }


    /**
     * Sets the schTask_note value for this Scheduledtask.
     * 
     * @param schTask_note
     */
    public void setSchTask_note(java.lang.String schTask_note) {
        this.schTask_note = schTask_note;
    }


    /**
     * Gets the schTask_status value for this Scheduledtask.
     * 
     * @return schTask_status
     */
    public int getSchTask_status() {
        return schTask_status;
    }


    /**
     * Sets the schTask_status value for this Scheduledtask.
     * 
     * @param schTask_status
     */
    public void setSchTask_status(int schTask_status) {
        this.schTask_status = schTask_status;
    }


    /**
     * Gets the schTask_user_checked value for this Scheduledtask.
     * 
     * @return schTask_user_checked
     */
    public int getSchTask_user_checked() {
        return schTask_user_checked;
    }


    /**
     * Sets the schTask_user_checked value for this Scheduledtask.
     * 
     * @param schTask_user_checked
     */
    public void setSchTask_user_checked(int schTask_user_checked) {
        this.schTask_user_checked = schTask_user_checked;
    }


    /**
     * Gets the scheTask_from_time value for this Scheduledtask.
     * 
     * @return scheTask_from_time
     */
    public java.util.Calendar getScheTask_from_time() {
        return scheTask_from_time;
    }


    /**
     * Sets the scheTask_from_time value for this Scheduledtask.
     * 
     * @param scheTask_from_time
     */
    public void setScheTask_from_time(java.util.Calendar scheTask_from_time) {
        this.scheTask_from_time = scheTask_from_time;
    }


    /**
     * Gets the scheTask_id value for this Scheduledtask.
     * 
     * @return scheTask_id
     */
    public int getScheTask_id() {
        return scheTask_id;
    }


    /**
     * Sets the scheTask_id value for this Scheduledtask.
     * 
     * @param scheTask_id
     */
    public void setScheTask_id(int scheTask_id) {
        this.scheTask_id = scheTask_id;
    }


    /**
     * Gets the scheTask_to_time value for this Scheduledtask.
     * 
     * @return scheTask_to_time
     */
    public java.util.Calendar getScheTask_to_time() {
        return scheTask_to_time;
    }


    /**
     * Sets the scheTask_to_time value for this Scheduledtask.
     * 
     * @param scheTask_to_time
     */
    public void setScheTask_to_time(java.util.Calendar scheTask_to_time) {
        this.scheTask_to_time = scheTask_to_time;
    }


    /**
     * Gets the tasktype value for this Scheduledtask.
     * 
     * @return tasktype
     */
    public unitn.introsde.storage_service.ws.Tasktype getTasktype() {
        return tasktype;
    }


    /**
     * Sets the tasktype value for this Scheduledtask.
     * 
     * @param tasktype
     */
    public void setTasktype(unitn.introsde.storage_service.ws.Tasktype tasktype) {
        this.tasktype = tasktype;
    }


    /**
     * Gets the user value for this Scheduledtask.
     * 
     * @return user
     */
    public unitn.introsde.storage_service.ws.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Scheduledtask.
     * 
     * @param user
     */
    public void setUser(unitn.introsde.storage_service.ws.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Scheduledtask)) return false;
        Scheduledtask other = (Scheduledtask) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.caregiver==null && other.getCaregiver()==null) || 
             (this.caregiver!=null &&
              this.caregiver.equals(other.getCaregiver()))) &&
            ((this.schTask_address==null && other.getSchTask_address()==null) || 
             (this.schTask_address!=null &&
              this.schTask_address.equals(other.getSchTask_address()))) &&
            this.schTask_cg_checked == other.getSchTask_cg_checked() &&
            ((this.schTask_note==null && other.getSchTask_note()==null) || 
             (this.schTask_note!=null &&
              this.schTask_note.equals(other.getSchTask_note()))) &&
            this.schTask_status == other.getSchTask_status() &&
            this.schTask_user_checked == other.getSchTask_user_checked() &&
            ((this.scheTask_from_time==null && other.getScheTask_from_time()==null) || 
             (this.scheTask_from_time!=null &&
              this.scheTask_from_time.equals(other.getScheTask_from_time()))) &&
            this.scheTask_id == other.getScheTask_id() &&
            ((this.scheTask_to_time==null && other.getScheTask_to_time()==null) || 
             (this.scheTask_to_time!=null &&
              this.scheTask_to_time.equals(other.getScheTask_to_time()))) &&
            ((this.tasktype==null && other.getTasktype()==null) || 
             (this.tasktype!=null &&
              this.tasktype.equals(other.getTasktype()))) &&
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
        if (getCaregiver() != null) {
            _hashCode += getCaregiver().hashCode();
        }
        if (getSchTask_address() != null) {
            _hashCode += getSchTask_address().hashCode();
        }
        _hashCode += getSchTask_cg_checked();
        if (getSchTask_note() != null) {
            _hashCode += getSchTask_note().hashCode();
        }
        _hashCode += getSchTask_status();
        _hashCode += getSchTask_user_checked();
        if (getScheTask_from_time() != null) {
            _hashCode += getScheTask_from_time().hashCode();
        }
        _hashCode += getScheTask_id();
        if (getScheTask_to_time() != null) {
            _hashCode += getScheTask_to_time().hashCode();
        }
        if (getTasktype() != null) {
            _hashCode += getTasktype().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Scheduledtask.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "scheduledtask"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caregiver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "caregiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "caregiver"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schTask_address");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schTask_address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schTask_cg_checked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schTask_cg_checked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schTask_note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schTask_note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schTask_status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schTask_status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("schTask_user_checked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "schTask_user_checked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheTask_from_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheTask_from_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheTask_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheTask_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("scheTask_to_time");
        elemField.setXmlName(new javax.xml.namespace.QName("", "scheTask_to_time"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tasktype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "tasktype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "tasktype"));
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
