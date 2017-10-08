package entities;

import entities.Hall;
import entities.Ticket;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-14T02:28:31")
@StaticMetamodel(Seat.class)
public class Seat_ { 

    public static volatile SingularAttribute<Seat, Integer> number;
    public static volatile CollectionAttribute<Seat, Ticket> ticketCollection;
    public static volatile SingularAttribute<Seat, Hall> hallId;
    public static volatile SingularAttribute<Seat, Integer> id;
    public static volatile SingularAttribute<Seat, Integer> row;

}