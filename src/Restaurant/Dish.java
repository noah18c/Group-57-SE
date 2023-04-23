package Restaurant;

import java.util.ArrayList;

public class Dish extends Item{


    private ArrayList<Ingredient> ingredients;
    private String description;


    public Dish(String name, int price, String dishType, String description){
        super(name, price, dishType);
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
