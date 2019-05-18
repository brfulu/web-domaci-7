package fulu.app.coupon;

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
            couponDto.setShop(coupon.getShop());

            couponDtos.add(couponDto);
        }

        return couponDtos;
    }
}
