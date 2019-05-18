package fulu.app.coupon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import fulu.app.shop.Shop;
import fulu.app.shop.ShopRepository;

public class CouponRepository {
    private static List<CouponRecord> COUPON_RECORDS;

    static {
        COUPON_RECORDS = fillCouponRecords();
    }

    private static List<CouponRecord> fillCouponRecords() {
        List<CouponRecord> couponRecords = new ArrayList<>();
        couponRecords.add(new CouponRecord(1, "Tablet", 150.75, 190.0, 5));
        couponRecords.add(new CouponRecord(2, "Pile", 10.3, 20.0, 10));
        return couponRecords;
    }

    public synchronized static List<Coupon> getCoupons() {
        List<Coupon> coupons = new ArrayList<>();
        for (CouponRecord couponRecord : COUPON_RECORDS) {
            Coupon coupon = new Coupon(couponRecord.getId());
            coupon.setProduct(couponRecord.getProduct());
            coupon.setDiscountedPrice(couponRecord.getDiscountedPrice());
            coupon.setOriginalPrice(couponRecord.getOriginalPrice());

            Shop shop = ShopRepository.getShopById(couponRecord.getShopId());
            coupon.setShop(shop);

            coupons.add(coupon);
        }

        return coupons;
    }

}
