package assignment3.designpat.bakery;
/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */
public class Multi_LayeredDecorator extends Cake {
    private final Cake cake;

    public Multi_LayeredDecorator(Cake cake) {
        this.cake = cake;

    }

    @Override
    public int getCost() {
        return cake.getCost() + 5;

    }

    @Override
    public String getDescription() {
        return "Multi-layered "+ cake.getDescription();

    }

}
