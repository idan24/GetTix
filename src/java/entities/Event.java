/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author idans
 */
@Entity
@Table(name = "event")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Event.findAll", query = "SELECT e FROM Event e")
    , @NamedQuery(name = "Event.findById", query = "SELECT e FROM Event e WHERE e.id = :id")
    , @NamedQuery(name = "Event.findByName", query = "SELECT e FROM Event e WHERE e.name = :name")
    , @NamedQuery(name = "Event.findByDescription", query = "SELECT e FROM Event e WHERE e.description = :description")
    , @NamedQuery(name = "Event.findByPerformer", query = "SELECT e FROM Event e WHERE e.performer = :performer")
    , @NamedQuery(name = "Event.findByDatetime", query = "SELECT e FROM Event e WHERE e.datetime = :datetime")
    , @NamedQuery(name = "Event.findByDuration", query = "SELECT e FROM Event e WHERE e.duration = :duration")
    , @NamedQuery(name = "Event.findByPrice", query = "SELECT e FROM Event e WHERE e.price = :price")
    , @NamedQuery(name = "Event.findByImage", query = "SELECT e FROM Event e WHERE e.image = :image")
    , @NamedQuery(name = "Event.findByHasMarkedSeats", query = "SELECT e FROM Event e WHERE e.hasMarkedSeats = :hasMarkedSeats")
    , @NamedQuery(name = "Event.findByMaxCapacity", query = "SELECT e FROM Event e WHERE e.maxCapacity = :maxCapacity")
    , @NamedQuery(name = "Event.findByIsSoldOut", query = "SELECT e FROM Event e WHERE e.isSoldOut = :isSoldOut")})
public class Event implements Serializable {

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
    @Size(max = 2147483647)
    @Column(name = "description")
    private String description;
    @Size(max = 2147483647)
    @Column(name = "performer")
    private String performer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "datetime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datetime;
    @Column(name = "duration")
    private Integer duration;
    @Basic(optional = false)
    @NotNull
    @Column(name = "price")
    private double price;
    @Size(max = 2147483647)
    @Column(name = "image")
    private String image;
    @Basic(optional = false)
    @NotNull
    @Column(name = "has_marked_seats")
    private boolean hasMarkedSeats;
    @Column(name = "max_capacity")
    private Integer maxCapacity;
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_sold_out")
    private boolean isSoldOut;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventId")
    private Collection<Discount> discountCollection;
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Category categoryId;
    @JoinColumn(name = "hall_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Hall hallId;
    @JoinColumn(name = "producer_id", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Producer producerId;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "eventId")
    private Collection<CustomerOrder> customerOrderCollection;

    public Event() {
    }

    public Event(Integer id) {
        this.id = id;
    }

    public Event(Integer id, String name, Date datetime, double price, boolean hasMarkedSeats, boolean isSoldOut) {
        this.id = id;
        this.name = name;
        this.datetime = datetime;
        this.price = price;
        this.hasMarkedSeats = hasMarkedSeats;
        this.isSoldOut = isSoldOut;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean getHasMarkedSeats() {
        return hasMarkedSeats;
    }

    public void setHasMarkedSeats(boolean hasMarkedSeats) {
        this.hasMarkedSeats = hasMarkedSeats;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(Integer maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean getIsSoldOut() {
        return isSoldOut;
    }

    public void setIsSoldOut(boolean isSoldOut) {
        this.isSoldOut = isSoldOut;
    }

    @XmlTransient
    public Collection<Discount> getDiscountCollection() {
        return discountCollection;
    }

    public void setDiscountCollection(Collection<Discount> discountCollection) {
        this.discountCollection = discountCollection;
    }

    public Category getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Category categoryId) {
        this.categoryId = categoryId;
    }

    public Hall getHallId() {
        return hallId;
    }

    public void setHallId(Hall hallId) {
        this.hallId = hallId;
    }

    public Producer getProducerId() {
        return producerId;
    }

    public void setProducerId(Producer producerId) {
        this.producerId = producerId;
    }

    @XmlTransient
    public Collection<CustomerOrder> getCustomerOrderCollection() {
        return customerOrderCollection;
    }

    public void setCustomerOrderCollection(Collection<CustomerOrder> customerOrderCollection) {
        this.customerOrderCollection = customerOrderCollection;
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
        if (!(object instanceof Event)) {
            return false;
        }
        Event other = (Event) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Event[ id=" + id + " ]";
    }
    
}
