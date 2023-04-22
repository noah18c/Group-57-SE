import menu.Menu;

public class Restaurant {
    private boolean hasInRestaurantDining, hasTakeAway, hasDelivery;
    private String type;
    private int deliverers;
    private Menu menu;

    public Restaurant(boolean hasInRestaurantDining, boolean hasTakeAway, boolean hasDelivery, String type, int deliverers){
        this.hasInRestaurantDining = hasInRestaurantDining;
        this.hasTakeAway = hasTakeAway;
        this.hasDelivery = hasDelivery;
        this.type = type;
        this.deliverers = deliverers;
    }

    public void dispatchDeliverer(){

    }

    public void retrieveDeliverer(){

    }

    public void initMenu(){

    }



}
