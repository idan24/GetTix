/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author idans
 */
@javax.ws.rs.ApplicationPath("/GetTixServer")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(services.CategoryFacadeREST.class);
        resources.add(services.CustomerFacadeREST.class);
        resources.add(services.CustomerOrderFacadeREST.class);
        resources.add(services.DiscountFacadeREST.class);
        resources.add(services.EventFacadeREST.class);
        resources.add(services.HallFacadeREST.class);
        resources.add(services.ProducerFacadeREST.class);
        resources.add(services.SeatFacadeREST.class);
        resources.add(services.TicketFacadeREST.class);
    }
    
}
