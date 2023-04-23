package ordering;

public class Waiter extends Staff{

    private OrderEntryModule orderEntryModule;
    public Waiter(String name) {
        super(name);
    }

    public void orderEntryModule(String link){
        orderEntryModule = new OrderEntryModule(link);

    }

    public void serveFood(){

    }

    public OrderEntryModule getOrderEntryModule() {
        return orderEntryModule;
    }

    public void setOrderEntryModule(OrderEntryModule orderEntryModule) {
        this.orderEntryModule = orderEntryModule;
    }
}
