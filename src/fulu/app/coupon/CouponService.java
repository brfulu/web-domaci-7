package fulu.app.coupon;

import fulu.app.shop.Shop;

import java.util.ArrayList;
import java.util.List;

public class CouponService {

    public List<CouponDto> getCoupons() {
        List<CouponDto> couponDtos = new ArrayList<>();
        List<Coupon> coupons = CouponRepository.getCoupons();

        for (Coupon coupon : coupons) {
            CouponDto couponDto = new CouponDto();
            couponDto.setId(coupon.getId());
            couponDto.setProduct(coupon.getProduct());
            couponDto.setDiscountedPrice(coupon.getDiscountedPrice());
            couponDto.setOriginalPrice(coupon.getOriginalPrice());
            couponDto.setShop(coupon.getShop().getName());

            couponDtos.add(couponDto);
        }

        return couponDtos;
    }

    public CouponDto addCoupon(CouponDto couponDto) {
        Coupon coupon = new Coupon();
        coupon.setProduct(couponDto.getProduct());
        coupon.setDiscountedPrice(couponDto.getDiscountedPrice());
        coupon.setOriginalPrice(couponDto.getOriginalPrice());

        Shop shop = new Shop();
        shop.setName(couponDto.getShop());
        coupon.setShop(shop);


        coupon = CouponRepository.addCoupon(coupon);
        couponDto.setId(coupon.getId());
        couponDto.setShop(coupon.getShop().getName());

        return couponDto;
    }

    public boolean deleteCoupon(long id) {
        return CouponRepository.deleteCoupon(id);
    }
}
