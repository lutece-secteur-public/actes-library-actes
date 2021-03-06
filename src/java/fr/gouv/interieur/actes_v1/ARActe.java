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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActeRecu" type="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}DonneesActe"/>
 *         &lt;element name="ClassificationDateVersionEnCours" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *       &lt;/sequence>
 *       &lt;attribute name="DateReception" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute ref="{http://www.interieur.gouv.fr/ACTES#v1.1-20040216}IDActe use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "acteRecu",
    "classificationDateVersionEnCours"
})
@XmlRootElement(name = "ARActe")
public class ARActe {

    @XmlElement(name = "ActeRecu", required = true)
    protected DonneesActe acteRecu;
    @XmlElement(name = "ClassificationDateVersionEnCours", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Calendar classificationDateVersionEnCours;
    @XmlAttribute(name = "DateReception", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Calendar dateReception;
    @XmlAttribute(name = "IDActe", namespace = "http://www.interieur.gouv.fr/ACTES#v1.1-20040216", required = true)
    protected String idActe;

    /**
     * Gets the value of the acteRecu property.
     * 
     * @return
     *     possible object is
     *     {@link DonneesActe }
     *     
     */
    public DonneesActe getActeRecu() {
        return acteRecu;
    }

    /**
     * Sets the value of the acteRecu property.
     * 
     * @param value
     *     allowed object is
     *     {@link DonneesActe }
     *     
     */
    public void setActeRecu(DonneesActe value) {
        this.acteRecu = value;
    }

    /**
     * Gets the value of the classificationDateVersionEnCours property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getClassificationDateVersionEnCours() {
        return classificationDateVersionEnCours;
    }

    /**
     * Sets the value of the classificationDateVersionEnCours property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassificationDateVersionEnCours(Calendar value) {
        this.classificationDateVersionEnCours = value;
    }

    /**
     * Gets the value of the dateReception property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getDateReception() {
        return dateReception;
    }

    /**
     * Sets the value of the dateReception property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateReception(Calendar value) {
        this.dateReception = value;
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
