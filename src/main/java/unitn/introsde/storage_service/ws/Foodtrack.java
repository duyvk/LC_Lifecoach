/**
 * Foodtrack.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Foodtrack  implements java.io.Serializable {
    private unitn.introsde.storage_service.ws.Externalsource externalsource;

    private double foodtrackAmount;

    private int foodtrackFoodId;

    private int foodtrackId;

    private java.lang.String foodtrackMeal;

    private java.util.Calendar foodtrackTime;

    private java.lang.String foodtrackUnit;

    private unitn.introsde.storage_service.ws.User user;

    public Foodtrack() {
    }

    public Foodtrack(
           unitn.introsde.storage_service.ws.Externalsource externalsource,
           double foodtrackAmount,
           int foodtrackFoodId,
           int foodtrackId,
           java.lang.String foodtrackMeal,
           java.util.Calendar foodtrackTime,
           java.lang.String foodtrackUnit,
           unitn.introsde.storage_service.ws.User user) {
           this.externalsource = externalsource;
           this.foodtrackAmount = foodtrackAmount;
           this.foodtrackFoodId = foodtrackFoodId;
           this.foodtrackId = foodtrackId;
           this.foodtrackMeal = foodtrackMeal;
           this.foodtrackTime = foodtrackTime;
           this.foodtrackUnit = foodtrackUnit;
           this.user = user;
    }


    /**
     * Gets the externalsource value for this Foodtrack.
     * 
     * @return externalsource
     */
    public unitn.introsde.storage_service.ws.Externalsource getExternalsource() {
        return externalsource;
    }


    /**
     * Sets the externalsource value for this Foodtrack.
     * 
     * @param externalsource
     */
    public void setExternalsource(unitn.introsde.storage_service.ws.Externalsource externalsource) {
        this.externalsource = externalsource;
    }


    /**
     * Gets the foodtrackAmount value for this Foodtrack.
     * 
     * @return foodtrackAmount
     */
    public double getFoodtrackAmount() {
        return foodtrackAmount;
    }


    /**
     * Sets the foodtrackAmount value for this Foodtrack.
     * 
     * @param foodtrackAmount
     */
    public void setFoodtrackAmount(double foodtrackAmount) {
        this.foodtrackAmount = foodtrackAmount;
    }


    /**
     * Gets the foodtrackFoodId value for this Foodtrack.
     * 
     * @return foodtrackFoodId
     */
    public int getFoodtrackFoodId() {
        return foodtrackFoodId;
    }


    /**
     * Sets the foodtrackFoodId value for this Foodtrack.
     * 
     * @param foodtrackFoodId
     */
    public void setFoodtrackFoodId(int foodtrackFoodId) {
        this.foodtrackFoodId = foodtrackFoodId;
    }


    /**
     * Gets the foodtrackId value for this Foodtrack.
     * 
     * @return foodtrackId
     */
    public int getFoodtrackId() {
        return foodtrackId;
    }


    /**
     * Sets the foodtrackId value for this Foodtrack.
     * 
     * @param foodtrackId
     */
    public void setFoodtrackId(int foodtrackId) {
        this.foodtrackId = foodtrackId;
    }


    /**
     * Gets the foodtrackMeal value for this Foodtrack.
     * 
     * @return foodtrackMeal
     */
    public java.lang.String getFoodtrackMeal() {
        return foodtrackMeal;
    }


    /**
     * Sets the foodtrackMeal value for this Foodtrack.
     * 
     * @param foodtrackMeal
     */
    public void setFoodtrackMeal(java.lang.String foodtrackMeal) {
        this.foodtrackMeal = foodtrackMeal;
    }


    /**
     * Gets the foodtrackTime value for this Foodtrack.
     * 
     * @return foodtrackTime
     */
    public java.util.Calendar getFoodtrackTime() {
        return foodtrackTime;
    }


    /**
     * Sets the foodtrackTime value for this Foodtrack.
     * 
     * @param foodtrackTime
     */
    public void setFoodtrackTime(java.util.Calendar foodtrackTime) {
        this.foodtrackTime = foodtrackTime;
    }


    /**
     * Gets the foodtrackUnit value for this Foodtrack.
     * 
     * @return foodtrackUnit
     */
    public java.lang.String getFoodtrackUnit() {
        return foodtrackUnit;
    }


    /**
     * Sets the foodtrackUnit value for this Foodtrack.
     * 
     * @param foodtrackUnit
     */
    public void setFoodtrackUnit(java.lang.String foodtrackUnit) {
        this.foodtrackUnit = foodtrackUnit;
    }


    /**
     * Gets the user value for this Foodtrack.
     * 
     * @return user
     */
    public unitn.introsde.storage_service.ws.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Foodtrack.
     * 
     * @param user
     */
    public void setUser(unitn.introsde.storage_service.ws.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Foodtrack)) return false;
        Foodtrack other = (Foodtrack) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.externalsource==null && other.getExternalsource()==null) || 
             (this.externalsource!=null &&
              this.externalsource.equals(other.getExternalsource()))) &&
            this.foodtrackAmount == other.getFoodtrackAmount() &&
            this.foodtrackFoodId == other.getFoodtrackFoodId() &&
            this.foodtrackId == other.getFoodtrackId() &&
            ((this.foodtrackMeal==null && other.getFoodtrackMeal()==null) || 
             (this.foodtrackMeal!=null &&
              this.foodtrackMeal.equals(other.getFoodtrackMeal()))) &&
            ((this.foodtrackTime==null && other.getFoodtrackTime()==null) || 
             (this.foodtrackTime!=null &&
              this.foodtrackTime.equals(other.getFoodtrackTime()))) &&
            ((this.foodtrackUnit==null && other.getFoodtrackUnit()==null) || 
             (this.foodtrackUnit!=null &&
              this.foodtrackUnit.equals(other.getFoodtrackUnit()))) &&
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
        if (getExternalsource() != null) {
            _hashCode += getExternalsource().hashCode();
        }
        _hashCode += new Double(getFoodtrackAmount()).hashCode();
        _hashCode += getFoodtrackFoodId();
        _hashCode += getFoodtrackId();
        if (getFoodtrackMeal() != null) {
            _hashCode += getFoodtrackMeal().hashCode();
        }
        if (getFoodtrackTime() != null) {
            _hashCode += getFoodtrackTime().hashCode();
        }
        if (getFoodtrackUnit() != null) {
            _hashCode += getFoodtrackUnit().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Foodtrack.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "foodtrack"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalsource");
        elemField.setXmlName(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "externalsource"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "externalsource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodtrackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodtrackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodtrackFoodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodtrackFoodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodtrackId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodtrackId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodtrackMeal");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodtrackMeal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodtrackTime");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodtrackTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodtrackUnit");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodtrackUnit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
