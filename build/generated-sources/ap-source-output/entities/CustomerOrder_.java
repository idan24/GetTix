package entities;

import entities.Customer;
import entities.Event;
import entities.Ticket;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-14T02:28:31")
@StaticMetamodel(CustomerOrder.class)
public class CustomerOrder_ { 

    public static volatile SingularAttribute<CustomerOrder, Event> eventId;
    public static volatile CollectionAttribute<CustomerOrder, Ticket> ticketCollection;
    public static volatile SingularAttribute<CustomerOrder, Double> totalPrice;
    public static volatile SingularAttribute<CustomerOrder, Customer> customerId;
    public static volatile SingularAttribute<CustomerOrder, Integer> id;
    public static volatile SingularAttribute<CustomerOrder, String> creditCard;
    public static volatile SingularAttribute<CustomerOrder, Date> creationDate;
    public static volatile SingularAttribute<CustomerOrder, String> status;

}