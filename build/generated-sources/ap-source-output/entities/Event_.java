package entities;

import entities.Category;
import entities.CustomerOrder;
import entities.Discount;
import entities.Hall;
import entities.Producer;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-14T02:28:31")
@StaticMetamodel(Event.class)
public class Event_ { 

    public static volatile SingularAttribute<Event, String> image;
    public static volatile CollectionAttribute<Event, CustomerOrder> customerOrderCollection;
    public static volatile SingularAttribute<Event, String> performer;
    public static volatile SingularAttribute<Event, String> description;
    public static volatile SingularAttribute<Event, Integer> maxCapacity;
    public static volatile CollectionAttribute<Event, Discount> discountCollection;
    public static volatile SingularAttribute<Event, Integer> duration;
    public static volatile SingularAttribute<Event, Date> datetime;
    public static volatile SingularAttribute<Event, Boolean> hasMarkedSeats;
    public static volatile SingularAttribute<Event, Hall> hallId;
    public static volatile SingularAttribute<Event, Double> price;
    public static volatile SingularAttribute<Event, String> name;
    public static volatile SingularAttribute<Event, Boolean> isSoldOut;
    public static volatile SingularAttribute<Event, Integer> id;
    public static volatile SingularAttribute<Event, Producer> producerId;
    public static volatile SingularAttribute<Event, Category> categoryId;

}