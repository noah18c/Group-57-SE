package Restaurant;

import stakeholders.PricingModule;

public class Restaurant {
    private boolean hasInRestaurantDining, hasTakeAway, hasDelivery;
    private String type;
    private Menu menu;

    private PricingModule pricingModule;

    public Restaurant(boolean hasInRestaurantDining, boolean hasTakeAway, boolean hasDelivery, String type){
        this.hasInRestaurantDining = hasInRestaurantDining;
        this.hasTakeAway = hasTakeAway;
        this.hasDelivery = hasDelivery;
        this.type = type;
        menu = new Menu();
    }

    public void dispatchDeliverer(){

    }

    public void retrieveDeliverer(){

    }

    public boolean isHasInRestaurantDining() {
        return hasInRestaurantDining;
    }

    public void setHasInRestaurantDining(boolean hasInRestaurantDining) {
        this.hasInRestaurantDining = hasInRestaurantDining;
    }

    public boolean isHasTakeAway() {
        return hasTakeAway;
    }

    public void setHasTakeAway(boolean hasTakeAway) {
        this.hasTakeAway = hasTakeAway;
    }

    public boolean isHasDelivery() {
        return hasDelivery;
    }

    public void setHasDelivery(boolean hasDelivery) {
        this.hasDelivery = hasDelivery;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public void setPricingModule(PricingModule pricingModule){
        this.pricingModule = pricingModule;
    }
}
