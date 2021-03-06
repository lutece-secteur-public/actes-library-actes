//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.0 in JDK 1.6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2007.12.01 at 02:04:49 AM CET 
//


package fr.gouv.interieur.actes_v1;

import java.util.Calendar;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

import org.w3._2001.xmlschema.Adapter2;


/**
 * Données relatives à un courrier de la préfecture (courrier simple, lettre
 * d'observations, demande de pieces complementaires): identifiant de l'acte +
 * date du courrier
 * 
 * <p>
 * Java class for DonneesCourrierPref complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 * 
 * <pre>
 * &lt;complexType name="DonneesCourrierPref">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DateCourrierPref" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}IDActe use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DonneesCourrierPref")
public class DonneesCourrierPref {

    @XmlAttribute(name = "DateCourrierPref", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Calendar dateCourrierPref;
    @XmlAttribute(name = "IDActe", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    protected String idActe;

    /**
     * Gets the value of the dateCourrierPref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateCourrierPref() {
        return dateCourrierPref;
    }

    /**
     * Sets the value of the dateCourrierPref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateCourrierPref(Calendar value) {
        this.dateCourrierPref = value;
    }

    /**
     * Gets the value of the idActe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIDActe() {
        return idActe;
    }

    /**
     * Sets the value of the idActe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIDActe(String value) {
        this.idActe = value;
    }

}
