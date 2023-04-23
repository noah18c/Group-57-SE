import restaurant.Restaurant;
import restaurant.*;
import ordering.*;
import stakeholders.PricingStrategyOne;
import stakeholders.RestaurantOwner;
import stakeholders.SoftwareDev;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

public class Main {
    public static void main(String[] args) {
        Restaurant pizzaPlace = new Restaurant(false, true, true, "Pizza Take-Away");
        Cook cook = new Cook("James");
        DeliveryPerson deliveryPerson = new DeliveryPerson("Gordon");
        Waiter waiter = new Waiter("Wendy");


        //pricingstrategy: softdev creates pricingmodule, restaurant owner adopts it, pricingmodule of restaurant is set
        SoftwareDev softwareDev = new SoftwareDev("Gale");
        softwareDev.createPricingModule();
        RestaurantOwner restaurantOwner = new RestaurantOwner("Bob");
        restaurantOwner.setPricingModule(softwareDev.getPricingModule());
        pizzaPlace.setPricingModule(restaurantOwner.getPricingModule());
        PricingStrategyOne pricingStrategyOne = new PricingStrategyOne();
        restaurantOwner.getPricingModule().addPricingStrategy(pricingStrategyOne);

        Ingredient rice = new Ingredient("rice", 3.00);
        Ingredient chicken = new Ingredient("chicken", 2.50);
        Ingredient flower = new Ingredient("flower", 1.00);
        Ingredient bacon = new Ingredient("bacon", 2.00);
        Ingredient tomatoSauce = new Ingredient("tomato sauce",0.50);
        Ingredient mozzarella = new Ingredient("mozzarella", 1.50);
        Ingredient groundBeef = new Ingredient("ground beef", 2.50);
        Ingredient mushroom = new Ingredient("mushroom", 1.00);

        Dish meatPizza = new Dish("Meat Supreme Pizza", 0, "Main Dish", "Pizza with chicken, mozzarella and cheese baked in the oven", true);
        meatPizza.addIngredient(flower);
        meatPizza.addIngredient(chicken);
        meatPizza.addIngredient(bacon);
        meatPizza.addIngredient(mozzarella);
        meatPizza.addIngredient(groundBeef);
        meatPizza.addIngredient(tomatoSauce);
        meatPizza.addIngredient(mushroom);

        Dish riceDish = new Dish("Rice side dish", 3.50, "Side Dish", "just some rice", false);
        riceDish.addIngredient(rice);

        Drink beer = new Drink("beer", 3.00, "Alcoholic");
        Drink cola = new Drink("coca-cola", 2.50, "Soft drink");
        Drink milkshake = new Drink("Milkshake", 3.00, "Milkshake");

        Dessert icecream = new Dessert("ice cream", 3.00, "Non-Alcoholic");

        pizzaPlace.getMenu().addDish(meatPizza);
        pizzaPlace.getMenu().addDish(riceDish);
        pizzaPlace.getMenu().addDrink(beer);
        pizzaPlace.getMenu().addDrink(cola);
        pizzaPlace.getMenu().addDrink(milkshake);
        pizzaPlace.getMenu().addDessert(icecream);



        //customer orders in-restaurant using qr

        Customer customer = new Customer("tom", "Highway to hell 666");
        customer.orderEntryModule("https://www.pizzapalace.com");
        customer.getOrderEntryModule().setMenu(pizzaPlace.getMenu());
        customer.getOrderEntryModule().offerMenu();
        customer.getOrderEntryModule().getOrderList().add(pizzaPlace.getMenu().getDrinks().get(0));
        customer.getOrderEntryModule().getOrderList().add(pizzaPlace.getMenu().getDrinks().get(1));
        customer.getOrderEntryModule().confirmOrder();
        customer.getOrderEntryModule().loadOrder(customer.getOrderEntryModule().getOrderList());

        cook.readOrders(customer.getOrderEntryModule());
        cook.cookFood();
        cook.sendFood();
        waiter.serveFood();

        customer.requestPayment();
        pizzaPlace.applyPricingModule();
        customer.getOrderEntryModule().getTotalPrice();
        customer.pay(50);

        //customer order in-restaurant using waiter
        customer.callForOrder();
        waiter.orderEntryModule("https://www.pizzapalace.com");
        waiter.getOrderEntryModule().setMenu(pizzaPlace.getMenu());
        waiter.getOrderEntryModule().offerMenu();
        customer.tellToWaiter();
        waiter.getOrderEntryModule().getOrderList().add(pizzaPlace.getMenu().getDishes().get(0));
        waiter.getOrderEntryModule().confirmOrder();
        waiter.getOrderEntryModule().loadOrder(waiter.getOrderEntryModule().getOrderList());

        cook.readOrders(waiter.getOrderEntryModule());
        cook.cookFood();
        cook.sendFood();
        waiter.serveFood();

        customer.requestPayment();
        pizzaPlace.applyPricingModule();
        waiter.getOrderEntryModule().getTotalPrice();
        customer.pay(100);


        //customer orders online using webinterface
        customer.orderEntryModule("https://www.pizzapalace.com");
        customer.getOrderEntryModule().setMenu(pizzaPlace.getMenu());
        customer.getOrderEntryModule().offerMenu();
        customer.getOrderEntryModule().getOrderList().add(pizzaPlace.getMenu().getDesserts().get(0));
        customer.getOrderEntryModule().setAdress(customer.getAdress());
        customer.getOrderEntryModule().confirmOrder();
        pizzaPlace.applyPricingModule();
        customer.getOrderEntryModule().getTotalPrice();
        customer.pay(100);
        customer.getOrderEntryModule().loadOrder(customer.getOrderEntryModule().getOrderList());
        customer.getOrderEntryModule().createDeliveryModule(customer.getOrderEntryModule().getAdress());


        cook.readOrders(customer.getOrderEntryModule());
        cook.cookFood();
        cook.sendFood();
        customer.getOrderEntryModule().getDeliveryModule().dispatchDeliveryPerson();
        deliveryPerson.deliverOrder();

        /*customer orders online using thuisbezorgd/ubereats/etc
        orderEntryModule is actually created by the third party application,
        but as we dont need to model it within the classes, we just create it here as a standalone here.
        So we assume the third party application calls for an api request to the system of the pizzapalace and from there
        the system creates the OrderEntryModule object
         */
        OrderEntryModule orderEntryModule = new OrderEntryModule("https://www.pizzapalace.com");
        orderEntryModule.setMenu(pizzaPlace.getMenu());
        orderEntryModule.sendAPIRequest("key", "/menu/","", "https://www.pizzapalace.com", "get");
        orderEntryModule.offerMenu();
        orderEntryModule.sendAPIRequest("key", "/orderList/","Meat Supreme Pizza, beer ", "https://www.pizzapalace.com", "post");
        orderEntryModule.getOrderList().add(pizzaPlace.getMenu().getDishes().get(0));
        orderEntryModule.getOrderList().add(pizzaPlace.getMenu().getDrinks().get(0));
        orderEntryModule.sendAPIRequest("key", "/adress/", "whatever adress", "https://www.pizzapalace.com", "post");
        orderEntryModule.setAdress(orderEntryModule.getApiRequest().getParam());
        orderEntryModule.sendAPIRequest("key", "", "confirm order", "https://www.pizzapalace.com", "post");
        orderEntryModule.confirmOrder();
        pizzaPlace.applyPricingModule();
        orderEntryModule.getTotalPrice();
        //customer pays
        orderEntryModule.sendAPIRequest("key", "/totalPrice/", "not paid", "https://www.pizzapalace.com", "get");
        orderEntryModule.sendAPIRequest("key", "/totalPrice/", "paid", "https://www.pizzapalace.com", "post");

        orderEntryModule.loadOrder(orderEntryModule.getOrderList());
        orderEntryModule.createDeliveryModule(orderEntryModule.getAdress());

        cook.readOrders(orderEntryModule);
        cook.cookFood();
        cook.sendFood();
        orderEntryModule.getDeliveryModule().dispatchDeliveryPerson();
        deliveryPerson.deliverOrder();
    }

    private static void createDishes() {

    }
}