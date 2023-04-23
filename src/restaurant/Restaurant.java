package restaurant;

import stakeholders.PricingModule;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

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

    public boolean isHasInRestaurantDining() {
        return hasInRestaurantDining;
    }

    public void setHasInRestaurantDining(boolean hasInRestaurantDining) {
        this.hasInRestaurantDining = hasInRestaurantDining;
    }

    public double applyPricingModule(){

        pricingModule.getPricingStrategies();
        //do something and return the new price
        return 0;
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
