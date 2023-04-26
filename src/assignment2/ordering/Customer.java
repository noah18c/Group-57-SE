package assignment2.ordering;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

public class Customer extends User {

    private String adress;
    private OrderEntryModule orderEntryModule;

    public Customer(String name, String adress){
        super(name);
        this.adress = adress;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public OrderEntryModule getOrderEntryModule() {
        return orderEntryModule;
    }

    public void setOrderEntryModule(OrderEntryModule orderEntryModule) {
        this.orderEntryModule = orderEntryModule;
    }

    public void orderEntryModule(String qrcode){
        orderEntryModule = new OrderEntryModule(qrcode);
    }

    public void callForOrder(){

    }

    public void tellToWaiter(){

    }

    public double requestPayment(){


        return orderEntryModule.getTotalPrice();
    }

    public void pay(int amount){

    }


}
