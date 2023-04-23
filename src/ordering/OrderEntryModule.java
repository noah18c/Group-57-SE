package ordering;

import Restaurant.Item;
import Restaurant.Menu;

import java.util.List;

public class OrderEntryModule {

    private List<Item> orderList;
    private String restaurantURL, adress;
    private boolean isDelivery;
    private Menu menu;
    private double totalPrice;

    public OrderEntryModule(String url){
        this.restaurantURL = url;
    }

    public void addToOrder(Item item){
        orderList.add(item);
    }

    public Item removeFromOrder(Item item){
        orderList.remove(item);
        return item;
    }

    public void loadOrder(List<Item> orderList){
    }

    public void confirmOrder(){

    }

    public void createDeliveryModule(String adress){

    }

    public String sendAPIRequest(String header, String endPoint, String param, String restaurantURL, String operation){
        APIRequest apiRequest = new APIRequest(header, endPoint, param, restaurantURL, operation);
        return apiRequest.execute();
    }

    public void sendToKitchen(){

    }

    public Menu offerMenu(){
        return menu;
    }

    public List<Item> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Item> orderList) {
        this.orderList = orderList;
    }

    public String getRestaurantURL() {
        return restaurantURL;
    }

    public void setRestaurantURL(String restaurantURL) {
        this.restaurantURL = restaurantURL;
    }

    public String getAdress() {
        return adress;
    }

    public boolean isDelivery() {
        return isDelivery;
    }

    public void setDelivery(boolean delivery) {
        isDelivery = delivery;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setAdress(String adress){
        this.adress = adress;
    }



}
