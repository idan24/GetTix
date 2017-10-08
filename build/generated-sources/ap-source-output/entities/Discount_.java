package entities;

import entities.Event;
import entities.Ticket;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-14T02:28:31")
@StaticMetamodel(Discount.class)
public class Discount_ { 

    public static volatile SingularAttribute<Discount, Event> eventId;
    public static volatile SingularAttribute<Discount, Integer> code;
    public static volatile SingularAttribute<Discount, Double> discountedPrice;
    public static volatile CollectionAttribute<Discount, Ticket> ticketCollection;
    public static volatile SingularAttribute<Discount, String> name;
    public static volatile SingularAttribute<Discount, Integer> id;

}