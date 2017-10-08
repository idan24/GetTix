package entities;

import entities.CustomerOrder;
import entities.Discount;
import entities.Seat;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-14T02:28:31")
@StaticMetamodel(Ticket.class)
public class Ticket_ { 

    public static volatile SingularAttribute<Ticket, CustomerOrder> orderId;
    public static volatile SingularAttribute<Ticket, Seat> seatId;
    public static volatile SingularAttribute<Ticket, Integer> id;
    public static volatile SingularAttribute<Ticket, Discount> discountId;

}