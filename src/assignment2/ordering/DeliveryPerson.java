package assignment2.ordering;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

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
