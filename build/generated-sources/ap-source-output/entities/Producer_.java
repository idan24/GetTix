package entities;

import entities.Event;
import entities.Hall;
import java.io.Serializable;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-08-14T02:28:31")
@StaticMetamodel(Producer.class)
public class Producer_ { 

    public static volatile SingularAttribute<Producer, Serializable> password;
    public static volatile CollectionAttribute<Producer, Hall> hallCollection;
    public static volatile CollectionAttribute<Producer, Event> eventCollection;
    public static volatile SingularAttribute<Producer, Integer> id;
    public static volatile SingularAttribute<Producer, String> userName;

}