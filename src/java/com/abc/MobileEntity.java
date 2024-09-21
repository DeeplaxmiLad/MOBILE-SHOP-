/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.abc;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Amey Patil
 */
@Entity
@XmlRootElement
public class MobileEntity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    private String Name;

    /**
     * Get the value of Name
     *
     * @return the value of Name
     */
    public String getName() {
        return Name;
    }

    /**
     * Set the value of Name
     *
     * @param Name new value of Name
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    private String Company;

    /**
     * Get the value of Company
     *
     * @return the value of Company
     */
    public String getCompany() {
        return Company;
    }

    /**
     * Set the value of Company
     *
     * @param Company new value of Company
     */
    public void setCompany(String Company) {
        this.Company = Company;
    }

    private String Colour;

    /**
     * Get the value of Colour
     *
     * @return the value of Colour
     */
    public String getColour() {
        return Colour;
    }

    /**
     * Set the value of Colour
     *
     * @param Colour new value of Colour
     */
    public void setColour(String Colour) {
        this.Colour = Colour;
    }

    private int Price;

    /**
     * Get the value of Price
     *
     * @return the value of Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * Set the value of Price
     *
     * @param Price new value of Price
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MobileEntity)) {
            return false;
        }
        MobileEntity other = (MobileEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.abc.MobileEntity[ id=" + id + " ]";
    }
    
}
