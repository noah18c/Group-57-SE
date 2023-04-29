package assignment3.designpat.bakery;
/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */
public class WithSprinklesDecorator extends Cake {
    private final Cake cake;
    public WithSprinklesDecorator(Cake cake) {
        this.cake = cake;

    }

    @Override
    public int getCost() {
        return this.cake.getCost()+2 ;
    }

    @Override
    public String getDescription() {
        return cake.getDescription() + " with sprinkles";

    }

}
