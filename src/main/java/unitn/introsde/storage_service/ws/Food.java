/**
 * Food.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Food  implements java.io.Serializable {
    private int foodCalories;

    private double foodFat;

    private double foodProtein;

    private int food_id;

    private java.lang.String food_name;

    private unitn.introsde.storage_service.ws.User user;

    public Food() {
    }

    public Food(
           int foodCalories,
           double foodFat,
           double foodProtein,
           int food_id,
           java.lang.String food_name,
           unitn.introsde.storage_service.ws.User user) {
           this.foodCalories = foodCalories;
           this.foodFat = foodFat;
           this.foodProtein = foodProtein;
           this.food_id = food_id;
           this.food_name = food_name;
           this.user = user;
    }


    /**
     * Gets the foodCalories value for this Food.
     * 
     * @return foodCalories
     */
    public int getFoodCalories() {
        return foodCalories;
    }


    /**
     * Sets the foodCalories value for this Food.
     * 
     * @param foodCalories
     */
    public void setFoodCalories(int foodCalories) {
        this.foodCalories = foodCalories;
    }


    /**
     * Gets the foodFat value for this Food.
     * 
     * @return foodFat
     */
    public double getFoodFat() {
        return foodFat;
    }


    /**
     * Sets the foodFat value for this Food.
     * 
     * @param foodFat
     */
    public void setFoodFat(double foodFat) {
        this.foodFat = foodFat;
    }


    /**
     * Gets the foodProtein value for this Food.
     * 
     * @return foodProtein
     */
    public double getFoodProtein() {
        return foodProtein;
    }


    /**
     * Sets the foodProtein value for this Food.
     * 
     * @param foodProtein
     */
    public void setFoodProtein(double foodProtein) {
        this.foodProtein = foodProtein;
    }


    /**
     * Gets the food_id value for this Food.
     * 
     * @return food_id
     */
    public int getFood_id() {
        return food_id;
    }


    /**
     * Sets the food_id value for this Food.
     * 
     * @param food_id
     */
    public void setFood_id(int food_id) {
        this.food_id = food_id;
    }


    /**
     * Gets the food_name value for this Food.
     * 
     * @return food_name
     */
    public java.lang.String getFood_name() {
        return food_name;
    }


    /**
     * Sets the food_name value for this Food.
     * 
     * @param food_name
     */
    public void setFood_name(java.lang.String food_name) {
        this.food_name = food_name;
    }


    /**
     * Gets the user value for this Food.
     * 
     * @return user
     */
    public unitn.introsde.storage_service.ws.User getUser() {
        return user;
    }


    /**
     * Sets the user value for this Food.
     * 
     * @param user
     */
    public void setUser(unitn.introsde.storage_service.ws.User user) {
        this.user = user;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Food)) return false;
        Food other = (Food) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.foodCalories == other.getFoodCalories() &&
            this.foodFat == other.getFoodFat() &&
            this.foodProtein == other.getFoodProtein() &&
            this.food_id == other.getFood_id() &&
            ((this.food_name==null && other.getFood_name()==null) || 
             (this.food_name!=null &&
              this.food_name.equals(other.getFood_name()))) &&
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
        _hashCode += getFoodCalories();
        _hashCode += new Double(getFoodFat()).hashCode();
        _hashCode += new Double(getFoodProtein()).hashCode();
        _hashCode += getFood_id();
        if (getFood_name() != null) {
            _hashCode += getFood_name().hashCode();
        }
        if (getUser() != null) {
            _hashCode += getUser().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Food.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "food"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodCalories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodCalories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodFat");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodFat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("foodProtein");
        elemField.setXmlName(new javax.xml.namespace.QName("", "foodProtein"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("food_id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "food_id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("food_name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "food_name"));
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
