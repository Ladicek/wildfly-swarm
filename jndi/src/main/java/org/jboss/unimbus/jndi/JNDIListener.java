package org.jboss.unimbus.jndi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.naming.InitialContext;

import org.jboss.unimbus.events.BeforeStart;
import org.jboss.unimbus.events.Initialize;

@ApplicationScoped
public class JNDIListener {

    public void preInitialize(@Observes @Initialize Boolean event) {
        System.err.println("**** initialized: " + context);
    }

    @Inject
    private InitialContext context;
}