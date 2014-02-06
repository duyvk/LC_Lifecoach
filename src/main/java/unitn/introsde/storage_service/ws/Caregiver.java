/**
 * Caregiver.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class Caregiver  implements java.io.Serializable {
    private java.lang.String cgAddress;

    private java.lang.String cgEmail;

    private java.lang.String cgFirstName;

    private int cgId;

    private java.lang.String cgLastName;

    private java.lang.String cgPhoneNumber;

    public Caregiver() {
    }

    public Caregiver(
           java.lang.String cgAddress,
           java.lang.String cgEmail,
           java.lang.String cgFirstName,
           int cgId,
           java.lang.String cgLastName,
           java.lang.String cgPhoneNumber) {
           this.cgAddress = cgAddress;
           this.cgEmail = cgEmail;
           this.cgFirstName = cgFirstName;
           this.cgId = cgId;
           this.cgLastName = cgLastName;
           this.cgPhoneNumber = cgPhoneNumber;
    }


    /**
     * Gets the cgAddress value for this Caregiver.
     * 
     * @return cgAddress
     */
    public java.lang.String getCgAddress() {
        return cgAddress;
    }


    /**
     * Sets the cgAddress value for this Caregiver.
     * 
     * @param cgAddress
     */
    public void setCgAddress(java.lang.String cgAddress) {
        this.cgAddress = cgAddress;
    }


    /**
     * Gets the cgEmail value for this Caregiver.
     * 
     * @return cgEmail
     */
    public java.lang.String getCgEmail() {
        return cgEmail;
    }


    /**
     * Sets the cgEmail value for this Caregiver.
     * 
     * @param cgEmail
     */
    public void setCgEmail(java.lang.String cgEmail) {
        this.cgEmail = cgEmail;
    }


    /**
     * Gets the cgFirstName value for this Caregiver.
     * 
     * @return cgFirstName
     */
    public java.lang.String getCgFirstName() {
        return cgFirstName;
    }


    /**
     * Sets the cgFirstName value for this Caregiver.
     * 
     * @param cgFirstName
     */
    public void setCgFirstName(java.lang.String cgFirstName) {
        this.cgFirstName = cgFirstName;
    }


    /**
     * Gets the cgId value for this Caregiver.
     * 
     * @return cgId
     */
    public int getCgId() {
        return cgId;
    }


    /**
     * Sets the cgId value for this Caregiver.
     * 
     * @param cgId
     */
    public void setCgId(int cgId) {
        this.cgId = cgId;
    }


    /**
     * Gets the cgLastName value for this Caregiver.
     * 
     * @return cgLastName
     */
    public java.lang.String getCgLastName() {
        return cgLastName;
    }


    /**
     * Sets the cgLastName value for this Caregiver.
     * 
     * @param cgLastName
     */
    public void setCgLastName(java.lang.String cgLastName) {
        this.cgLastName = cgLastName;
    }


    /**
     * Gets the cgPhoneNumber value for this Caregiver.
     * 
     * @return cgPhoneNumber
     */
    public java.lang.String getCgPhoneNumber() {
        return cgPhoneNumber;
    }


    /**
     * Sets the cgPhoneNumber value for this Caregiver.
     * 
     * @param cgPhoneNumber
     */
    public void setCgPhoneNumber(java.lang.String cgPhoneNumber) {
        this.cgPhoneNumber = cgPhoneNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Caregiver)) return false;
        Caregiver other = (Caregiver) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cgAddress==null && other.getCgAddress()==null) || 
             (this.cgAddress!=null &&
              this.cgAddress.equals(other.getCgAddress()))) &&
            ((this.cgEmail==null && other.getCgEmail()==null) || 
             (this.cgEmail!=null &&
              this.cgEmail.equals(other.getCgEmail()))) &&
            ((this.cgFirstName==null && other.getCgFirstName()==null) || 
             (this.cgFirstName!=null &&
              this.cgFirstName.equals(other.getCgFirstName()))) &&
            this.cgId == other.getCgId() &&
            ((this.cgLastName==null && other.getCgLastName()==null) || 
             (this.cgLastName!=null &&
              this.cgLastName.equals(other.getCgLastName()))) &&
            ((this.cgPhoneNumber==null && other.getCgPhoneNumber()==null) || 
             (this.cgPhoneNumber!=null &&
              this.cgPhoneNumber.equals(other.getCgPhoneNumber())));
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
        if (getCgAddress() != null) {
            _hashCode += getCgAddress().hashCode();
        }
        if (getCgEmail() != null) {
            _hashCode += getCgEmail().hashCode();
        }
        if (getCgFirstName() != null) {
            _hashCode += getCgFirstName().hashCode();
        }
        _hashCode += getCgId();
        if (getCgLastName() != null) {
            _hashCode += getCgLastName().hashCode();
        }
        if (getCgPhoneNumber() != null) {
            _hashCode += getCgPhoneNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Caregiver.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "caregiver"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgAddress");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgAddress"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgEmail");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgEmail"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgFirstName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgFirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgLastName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgLastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cgPhoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cgPhoneNumber"));
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
