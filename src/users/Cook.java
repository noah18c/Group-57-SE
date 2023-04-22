package users;

import modules.OrderEntryModule;

public class Cook extends Staff{

    public Cook(String name, OrderEntryModule orderEntryModule, int staffId) {
        super(name, orderEntryModule, staffId);
    }

    public void prepare(){

    }

    public void giveToDelivery(){
    }

}
