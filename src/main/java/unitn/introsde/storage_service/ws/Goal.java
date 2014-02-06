/**
 * Goal.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Goal  implements java.io.Serializable {
    private unitn.introsde.storage_service.ws.Caregiver caregiver;

    private java.lang.String goalDesc;

    private int goalId;

    private double goal_expected_value;

    private java.util.Calendar goal_from_date;

    private java.util.Calendar goal_to_date;

    private java.lang.String goal_type;

    private unitn.introsde.storage_service.ws.Measuredefinition measuredefinition;

    private unitn.introsde.storage_service.ws.User user;

    public Goal() {
    }

    public Goal(
           unitn.introsde.storage_service.ws.Caregiver caregiver,
           java.lang.String goalDesc,
           int goalId,
           double goal_expected_value,
           java.util.Calendar goal_from_date,
           java.util.Calendar goal_to_date,
           java.lang.String goal_type,
           unitn.introsde.storage_service.ws.Measuredefinition measuredefinition,
           unitn.introsde.storage_service.ws.User user) {
           this.caregiver = caregiver;
           this.goalDesc = goalDesc;
           this.goalId = goalId;
           this.goal_expected_value = goal_expected_value;
           this.goal_from_date = goal_from_date;
           this.goal_to_date = goal_to_date;
           this.goal_type = goal_type;
           this.measuredefinition = measuredefinition;
           this.user = user;
    }


    /**
     * Gets the caregiver value for this Goal.
     * 
     * @return caregiver
     */
    public unitn.introsde.storage_service.ws.Caregiver getCaregiver() {
        return caregiver;
    }


    /**
     * Sets the caregiver value for this Goal.
     * 
     * @param caregiver
     */
    public void setCaregiver(unitn.introsde.storage_service.ws.Caregiver caregiver) {
        this.caregiver = caregiver;
    }


    /**
     * Gets the goalDesc value for this Goal.
     * 
     * @return goalDesc
     */
    public java.lang.String getGoalDesc() {
        return goalDesc;
    }


    /**
     * Sets the goalDesc value for this Goal.
     * 
     * @param goalDesc
     */
    public void setGoalDesc(java.lang.String goalDesc) {
        this.goalDesc = goalDesc;
    }


    /**
     * Gets the goalId value for this Goal.
     * 
     * @return goalId
     */
    public int getGoalId() {
        return goalId;
    }


    /**
     * Sets the goalId value for this Goal.
     * 
     * @param goalId
     */
    public void setGoalId(int goalId) {
        this.goalId = goalId;
    }


    /**
     * Gets the goal_expected_value value for this Goal.
     * 
     * @return goal_expected_value
     */
    public double getGoal_expected_value() {
        return goal_expected_value;
    }


    /**
     * Sets the goal_expected_value value for this Goal.
     * 
     * @param goal_expected_value
     */
    public void setGoal_expected_value(double goal_expected_value) {
        this.goal_expected_value = goal_expected_value;
    }


    /**
     * Gets the goal_from_date value for this Goal.
     * 
     * @return goal_from_date
     */
    public java.util.Calendar getGoal_from_date() {
        return goal_from_date;
    }


    /**
     * Sets the goal_from_date value for this Goal.
     * 
     * @param goal_from_date
     */
    public void setGoal_from_date(java.util.Calendar goal_from_date) {
        this.goal_from_date = goal_from_date;
    }


    /**
     * Gets the goal_to_date value for this Goal.
     * 
     * @return goal_to_date
     */
    public java.util.Calendar getGoal_to_date() {
        return goal_to_date;
    }


    /**
     * Sets the goal_to_date value for this Goal.
     * 
     * @param goal_to_date
     */
    public void setGoal_to_date(java.util.Calendar goal_to_date) {
        this.goal_to_date = goal_to_date;
    }


    /**
     * Gets the goal_type value for this Goal.
     * 
     * @return goal_type
     */
    public java.lang.String getGoal_type() {
        return goal_type;
    }


    /**
     * Sets the goal_type value for this Goal.
     * 
     * @param goal_type
     */
    public void setGoal_type(java.lang.String goal_type) {
        this.goal_type = goal_type;
    }


    /**
     * Gets the measuredefinition value for this Goal.
     * 
     * @return measuredefinition
     */
    public unitn.introsde.storage_service.ws.Measuredefinition getMeasuredefinition() {
        return measuredefinition;
    }


    /**
     * Sets the measuredefinition value for this Goal.
     * 
     * @param measuredefinition
     */
    public void setMeasuredefinition(unitn.introsde.storage_service.ws.Measuredefinition measuredefinition) {
        this.measuredefinition = measuredefinition;
    }


    /**
     * Gets the user value for this Goal.
     * 
     * @return user
     */
    public unitn.introsde.storage_service.ws.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Goal.
     * 
     * @param user
     */
    public void setUser(unitn.introsde.storage_service.ws.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Goal)) return false;
        Goal other = (Goal) obj;
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
            ((this.goalDesc==null && other.getGoalDesc()==null) || 
             (this.goalDesc!=null &&
              this.goalDesc.equals(other.getGoalDesc()))) &&
            this.goalId == other.getGoalId() &&
            this.goal_expected_value == other.getGoal_expected_value() &&
            ((this.goal_from_date==null && other.getGoal_from_date()==null) || 
             (this.goal_from_date!=null &&
              this.goal_from_date.equals(other.getGoal_from_date()))) &&
            ((this.goal_to_date==null && other.getGoal_to_date()==null) || 
             (this.goal_to_date!=null &&
              this.goal_to_date.equals(other.getGoal_to_date()))) &&
            ((this.goal_type==null && other.getGoal_type()==null) || 
             (this.goal_type!=null &&
              this.goal_type.equals(other.getGoal_type()))) &&
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
        if (getCaregiver() != null) {
            _hashCode += getCaregiver().hashCode();
        }
        if (getGoalDesc() != null) {
            _hashCode += getGoalDesc().hashCode();
        }
        _hashCode += getGoalId();
        _hashCode += new Double(getGoal_expected_value()).hashCode();
        if (getGoal_from_date() != null) {
            _hashCode += getGoal_from_date().hashCode();
        }
        if (getGoal_to_date() != null) {
            _hashCode += getGoal_to_date().hashCode();
        }
        if (getGoal_type() != null) {
            _hashCode += getGoal_type().hashCode();
        }
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
        new org.apache.axis.description.TypeDesc(Goal.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "goal"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caregiver");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "caregiver"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "caregiver"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goalDesc");
        elemField.setXmlName(new javax.xml.namespace.QName("", "goalDesc"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goalId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "goalId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goal_expected_value");
        elemField.setXmlName(new javax.xml.namespace.QName("", "goal_expected_value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goal_from_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "goal_from_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goal_to_date");
        elemField.setXmlName(new javax.xml.namespace.QName("", "goal_to_date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("goal_type");
        elemField.setXmlName(new javax.xml.namespace.QName("", "goal_type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
