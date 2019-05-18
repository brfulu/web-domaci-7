package fulu.app.shop;

import fulu.app.coupon.Coupon;
import fulu.app.coupon.CouponDto;
import fulu.app.coupon.CouponRepository;

import java.util.ArrayList;
import java.util.List;

public class ShopService {

    public List<ShopDto> getShops() {
        List<ShopDto> shopDtos = new ArrayList<>();
        List<Shop> shops = ShopRepository.getShops();
        for (Shop shop : shops) {
            ShopDto shopDto = new ShopDto();
            shopDto.setId(shop.getId());
            shopDto.setName(shop.getName());

            shopDtos.add(shopDto);
        }
        return shopDtos;
    }
}
