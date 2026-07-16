public class Main {

    public static void main(String[] args) {

        String[] coupons = {
                "SAVE20",
                "AB12",
                "SAVE100",
                "HELLO",
                "SAVE5"
        };

        ShoppingCart cart = new ShoppingCart();

        for (String coupon : coupons) {

            if (cart.validateCoupon(coupon))
                System.out.println(coupon + " : Valid");
            else
                System.out.println(coupon + " : Invalid");
        }
    }
}