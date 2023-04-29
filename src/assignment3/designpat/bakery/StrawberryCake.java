package assignment3.designpat.bakery;
/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */
public class StrawberryCake extends Cake {
    private final int CAKE_COST = 20;
    @Override
    public int getCost() {
        return CAKE_COST;
    }
    @Override
    public String getDescription() {
        return "Strawberry cake";
    }
}
