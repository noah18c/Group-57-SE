package assignment3.designpat.bakery;
/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */
/**
 * Create an order and print it
 */
public class Main {
    public static void main(String[] args) {
        // Create the order
        Order order = new Order();
        order.addCake(new ChocolateCake());
        Cake Vanillia1 = new VanillaCake();
        Vanillia1 = new WithSayingDecorator(Vanillia1, "PLAIN!");
        order.addCake(Vanillia1);
        Cake Vanillia2 = new VanillaCake();
        Vanillia2 = new WithSprinklesDecorator(Vanillia2);
        Vanillia2 = new WithSayingDecorator(Vanillia2, "FANCY");
        order.addCake(Vanillia2);
        Cake Strawberry = new StrawberryCake();
        Strawberry = new Multi_LayeredDecorator(Strawberry);
        Strawberry = new WithSprinklesDecorator(Strawberry);
        Strawberry = new WithSprinklesDecorator(Strawberry);
        Strawberry = new WithSayingDecorator(Strawberry, "One of");
        Strawberry = new WithSayingDecorator(Strawberry, "EVERYTHING");
        order.addCake(Strawberry);
        // Print the order
        order.printOrder();
    }
}
