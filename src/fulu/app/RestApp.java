package fulu.app;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("/rest")
public class RestApp extends ResourceConfig {

    public RestApp() {
         packages("fulu.app.coupon", "fulu.app.shop");
    }
}
