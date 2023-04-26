package assignment2.ordering;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

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
