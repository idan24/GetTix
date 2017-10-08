package entities;

import entities.Event;
import entities.Producer;
import entities.Seat;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-14T02:28:31")
@StaticMetamodel(Hall.class)
public class Hall_ { 

    public static volatile SingularAttribute<Hall, String> officialWebsite;
    public static volatile SingularAttribute<Hall, String> address;
    public static volatile CollectionAttribute<Hall, Event> eventCollection;
    public static volatile SingularAttribute<Hall, String> city;
    public static volatile SingularAttribute<Hall, String> name;
    public static volatile CollectionAttribute<Hall, Seat> seatCollection;
    public static volatile SingularAttribute<Hall, Integer> id;
    public static volatile SingularAttribute<Hall, Producer> creatingProducerId;

}