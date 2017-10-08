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
@Table(name = "producer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producer.findAll", query = "SELECT p FROM Producer p")
    , @NamedQuery(name = "Producer.findById", query = "SELECT p FROM Producer p WHERE p.id = :id")
    , @NamedQuery(name = "Producer.findByUserName", query = "SELECT p FROM Producer p WHERE p.userName = :userName")
    , @NamedQuery(name = "Producer.findByPassword", query = "SELECT p FROM Producer p WHERE p.password = :password")})
public class Producer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2147483647)
    @Column(name = "user_name")
    private String userName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "password")
    private Serializable password;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "creatingProducerId")
    private Collection<Hall> hallCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "producerId")
    private Collection<Event> eventCollection;

    public Producer() {
    }

    public Producer(Integer id) {
        this.id = id;
    }

    public Producer(Integer id, String userName, Serializable password) {
        this.id = id;
        this.userName = userName;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Serializable getPassword() {
        return password;
    }

    public void setPassword(Serializable password) {
        this.password = password;
    }

    @XmlTransient
    public Collection<Hall> getHallCollection() {
        return hallCollection;
    }

    public void setHallCollection(Collection<Hall> hallCollection) {
        this.hallCollection = hallCollection;
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
        if (!(object instanceof Producer)) {
            return false;
        }
        Producer other = (Producer) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Producer[ id=" + id + " ]";
    }
    
}
