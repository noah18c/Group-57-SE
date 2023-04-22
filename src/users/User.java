package users;

import modules.OrderEntryModule;

abstract class User {

    private String name;
    private OrderEntryModule orderEntryModule;
    public User(String name, OrderEntryModule orderEntryModule){
        this.name = name;
        this.orderEntryModule = orderEntryModule;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderEntryModule getOrderEntryModule() {
        return orderEntryModule;
    }
}
