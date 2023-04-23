package Restaurant;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Dish> dishes;
    private ArrayList<Drink> drinks;
    private ArrayList<Dessert> desserts;


    public Menu(){
        this.dishes = new ArrayList<Dish>();
        this.drinks = new ArrayList<Drink>();
        this.desserts = new ArrayList<Dessert>();
    }
    public void addDish(Dish d){
        dishes.add(d);
    }

    public Dish removeDish(Dish d){
        dishes.remove(d);
        return d;
    }

    public void addDrink(Drink d){
        drinks.add(d);
    }

    public Drink removeDrink(Drink d){
        drinks.remove(d);
        return d;
    }

    public void addDessert(Dessert d){
        desserts.add(d);
    }

    public void removeDessert(Dessert d){
        desserts.remove(d);
    }

    public ArrayList<Dish> getDishes() {
        return dishes;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public ArrayList<Dessert> getDesserts() {
        return desserts;
    }
}
