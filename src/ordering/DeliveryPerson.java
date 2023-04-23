package ordering;

public class DeliveryPerson extends Staff{

    private DeliveryModule deliveryModule;

    public DeliveryPerson(String name){
        super(name);
    }

    public void deliverOrder(){

    }

    public DeliveryModule getDeliveryModule() {
        return deliveryModule;
    }

    public void setDeliveryModule(DeliveryModule deliveryModule) {
        this.deliveryModule = deliveryModule;
    }
}
