package menu;

import java.util.ArrayList;

abstract class Dish extends Item{


    private ArrayList<Ingredient> ingredients;
    private String description;


    public Dish(String name, int price, String description){
        super(name, price);
        this.ingredients = new ArrayList<>();
        this.description = description;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
    }

    public Ingredient removeIngredient(Ingredient ingredient){
        ingredients.remove(ingredient);
        return ingredient;
    }





}
