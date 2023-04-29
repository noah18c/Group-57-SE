package assignment3.designpat.bakery;
/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */
public class WithSayingDecorator extends Cake {
    private final Cake cake;
    private final String saying;

    public WithSayingDecorator(Cake cake, String saying) {
        this.cake = cake;
        this.saying = saying;
    }
    @Override
    public int getCost() {
        return cake.getCost();
    }
    @Override
    public String getDescription() {
        return cake.getDescription() + " with saying " + '"' + saying + '"';

    }
}
