/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author idans
 */
@Entity
@Table(name = "hall")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hall.findAll", query = "SELECT h FROM Hall h")
    , @NamedQuery(name = "Hall.findById", query = "SELECT h FROM Hall h WHERE h.id = :id")
    , @NamedQuery(name = "Hall.findByName", query = "SELECT h FROM Hall h WHERE h.name = :name")
    , @NamedQuery(name = "Hall.findByAddress", query = "SELECT h FROM Hall h WHERE h.address = :address")
    , @NamedQuery(name = "Hall.findByCity", query = "SELECT h FROM Hall h WHERE h.city = :city")
    , @NamedQuery(name = "Hall.findByOfficialWebsite", query = "SELECT h FROM Hall h WHERE h.officialWebsite = :officialWebsite")})
public class Hall implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "address")
    private String address;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "city")
    private String city;
    @Size(max = 2147483647)
    @Column(name = "official_website")
    private String officialWebsite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hallId")
    private Collection<Seat> seatCollection;
    @JoinColumn(name = "creating_producer_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producer creatingProducerId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "hallId")
    private Collection<Event> eventCollection;

    public Hall() {
    }

    public Hall(Integer id) {
        this.id = id;
    }

    public Hall(Integer id, String name, String address, String city) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getOfficialWebsite() {
        return officialWebsite;
    }

    public void setOfficialWebsite(String officialWebsite) {
        this.officialWebsite = officialWebsite;
    }

    @XmlTransient
    public Collection<Seat> getSeatCollection() {
        return seatCollection;
    }

    public void setSeatCollection(Collection<Seat> seatCollection) {
        this.seatCollection = seatCollection;
    }

    public Producer getCreatingProducerId() {
        return creatingProducerId;
    }

    public void setCreatingProducerId(Producer creatingProducerId) {
        this.creatingProducerId = creatingProducerId;
    }

    @XmlTransient
    public Collection<Event> getEventCollection() {
        return eventCollection;
    }

    public void setEventCollection(Collection<Event> eventCollection) {
        this.eventCollection = eventCollection;
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
        if (!(object instanceof Hall)) {
            return false;
        }
        Hall other = (Hall) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hall[ id=" + id + " ]";
    }
    
}
