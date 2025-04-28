
public class Jacket extends Product {

    @Override
    public void placeOrder() {
        System.out.println("Jacket order has been placed");
    }

    @Override
    public void returnOrder() {
        System.out.println("Jacket order has been returned");
    }

}
