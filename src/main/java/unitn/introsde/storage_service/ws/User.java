/**
 * User.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User  implements java.io.Serializable {
    private java.util.Calendar userBirthDate;

    private java.lang.String userEmail;

    private java.lang.String userFirstName;

    private java.lang.String userGender;

    private int userId;

    private java.lang.String userLastName;

    public User() {
    }

    public User(
           java.util.Calendar userBirthDate,
           java.lang.String userEmail,
           java.lang.String userFirstName,
           java.lang.String userGender,
           int userId,
           java.lang.String userLastName) {
           this.userBirthDate = userBirthDate;
           this.userEmail = userEmail;
           this.userFirstName = userFirstName;
           this.userGender = userGender;
           this.userId = userId;
           this.userLastName = userLastName;
    }


    /**
     * Gets the userBirthDate value for this User.
     * 
     * @return userBirthDate
     */
    public java.util.Calendar getUserBirthDate() {
        return userBirthDate;
    }


    /**
     * Sets the userBirthDate value for this User.
     * 
     * @param userBirthDate
     */
    public void setUserBirthDate(java.util.Calendar userBirthDate) {
        this.userBirthDate = userBirthDate;
    }


    /**
     * Gets the userEmail value for this User.
     * 
     * @return userEmail
     */
    public java.lang.String getUserEmail() {
        return userEmail;
    }


    /**
     * Sets the userEmail value for this User.
     * 
     * @param userEmail
     */
    public void setUserEmail(java.lang.String userEmail) {
        this.userEmail = userEmail;
    }


    /**
     * Gets the userFirstName value for this User.
     * 
     * @return userFirstName
     */
    public java.lang.String getUserFirstName() {
        return userFirstName;
    }


    /**
     * Sets the userFirstName value for this User.
     * 
     * @param userFirstName
     */
    public void setUserFirstName(java.lang.String userFirstName) {
        this.userFirstName = userFirstName;
    }


    /**
     * Gets the userGender value for this User.
     * 
     * @return userGender
     */
    public java.lang.String getUserGender() {
        return userGender;
    }


    /**
     * Sets the userGender value for this User.
     * 
     * @param userGender
     */
    public void setUserGender(java.lang.String userGender) {
        this.userGender = userGender;
    }


    /**
     * Gets the userId value for this User.
     * 
     * @return userId
     */
    public int getUserId() {
        return userId;
    }


    /**
     * Sets the userId value for this User.
     * 
     * @param userId
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }


    /**
     * Gets the userLastName value for this User.
     * 
     * @return userLastName
     */
    public java.lang.String getUserLastName() {
        return userLastName;
    }


    /**
     * Sets the userLastName value for this User.
     * 
     * @param userLastName
     */
    public void setUserLastName(java.lang.String userLastName) {
        this.userLastName = userLastName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof User)) return false;
        User other = (User) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.userBirthDate==null && other.getUserBirthDate()==null) || 
             (this.userBirthDate!=null &&
              this.userBirthDate.equals(other.getUserBirthDate()))) &&
            ((this.userEmail==null && other.getUserEmail()==null) || 
             (this.userEmail!=null &&
              this.userEmail.equals(other.getUserEmail()))) &&
            ((this.userFirstName==null && other.getUserFirstName()==null) || 
             (this.userFirstName!=null &&
              this.userFirstName.equals(other.getUserFirstName()))) &&
            ((this.userGender==null && other.getUserGender()==null) || 
             (this.userGender!=null &&
              this.userGender.equals(other.getUserGender()))) &&
            this.userId == other.getUserId() &&
            ((this.userLastName==null && other.getUserLastName()==null) || 
             (this.userLastName!=null &&
              this.userLastName.equals(other.getUserLastName())));
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
        if (getUserBirthDate() != null) {
            _hashCode += getUserBirthDate().hashCode();
        }
        if (getUserEmail() != null) {
            _hashCode += getUserEmail().hashCode();
        }
        if (getUserFirstName() != null) {
            _hashCode += getUserFirstName().hashCode();
        }
        if (getUserGender() != null) {
            _hashCode += getUserGender().hashCode();
        }
        _hashCode += getUserId();
        if (getUserLastName() != null) {
            _hashCode += getUserLastName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(User.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "user"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userBirthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userBirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userGender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userGender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userLastName"));
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
