package menu;

import java.util.ArrayList;

public class Menu {

    private ArrayList<Dish> dishes;
    private ArrayList<Drink> drinks;
    private ArrayList<Dessert> desserts;

    public Menu(ArrayList<Dish> dishes, ArrayList<Drink> drinks, ArrayList<Dessert> desserts){
        this.dishes = dishes;
        this.drinks = drinks;
        this.desserts = desserts;
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
