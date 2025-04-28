
public class SalesOrderClient {

    private static Jacket jacket = new Jacket();

    public static void main(String[] args) {

        Product jacket = new Jacket();
        OrderHandler placeOrderHandler = new OrderHandler();
        OrderHandler returnOrderHandler = new OrderHandler();

        placeOrderHandler.invoke(new PlaceOrderCommand(jacket));
        returnOrderHandler.invoke(new ReturnOrderCommand(jacket));

    }

}
