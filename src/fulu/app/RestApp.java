package fulu.app;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/user")
public class RestApp extends ResourceConfig {

    public RestApp() {
         packages("fulu.app.coupon", "fulu.app.shop");
    }
}
