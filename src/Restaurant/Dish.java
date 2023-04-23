package Restaurant;

import java.util.ArrayList;

public class Dish extends Item{


    private ArrayList<Ingredient> ingredients;
    private String description;
    private boolean ingredientPriceSum;


    public Dish(String name, double price, String dishType, String description, boolean ingredientPriceSum){
        super(name, price, dishType);
        this.ingredients = new ArrayList<>();
        this.description = description;
        this.ingredientPriceSum = ingredientPriceSum;
    }

    public void addIngredient(Ingredient ingredient){
        ingredients.add(ingredient);
        if(ingredientPriceSum){
            sumPriceIngredients();
        }
    }

    public Ingredient removeIngredient(Ingredient ingredient){
        ingredients.remove(ingredient);
        return ingredient;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    private void sumPriceIngredients(){

    }
}
