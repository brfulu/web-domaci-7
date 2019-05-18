package fulu.app.coupon;

import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/coupons")
public class CouponController {
    private final CouponService couponService;

    public CouponController() {
        this.couponService = new CouponService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<CouponDto> getCoupons(@Context ServletContext ctx) {
        return couponService.getCoupons();
    }
}
