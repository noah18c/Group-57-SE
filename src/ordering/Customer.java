package ordering;

public class Customer {

    private String adress;
    private OrderEntryModule orderEntryModule;

    public Customer(String adress){
        this.adress = adress;
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
