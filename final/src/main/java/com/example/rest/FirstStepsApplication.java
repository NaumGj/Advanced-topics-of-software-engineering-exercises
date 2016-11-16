package com.example.rest;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class FirstStepsApplication extends Application {

    /**
     * Creates a root Restlet that will receive all incoming calls.
     */
    @Override
    public Restlet createInboundRoot() {
        // Create a router Restlet that routes each call to a
        // new instance of HelloWorldResource.
        Router router = new Router(getContext());

        // Defines only one route
//        router.attachDefault(HelloWorldResource.class);
        
        router.attach("/", HelloWorldResource.class);
        router.attach("/guestbook/", GuestbookResource.class);
        router.attach("/guestbook/{greeting}", GreetingResource.class);

        return router;
    }
}
