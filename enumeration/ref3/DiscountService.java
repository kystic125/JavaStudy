package enumeration.ref3;

public class DiscountService {
    public int discount(Grade grade, int price) {
        return price * grade.discount(price) / 100;
    }
}