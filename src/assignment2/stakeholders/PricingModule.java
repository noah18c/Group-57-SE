package assignment2.stakeholders;

import java.util.ArrayList;
import java.util.List;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

public class PricingModule {
    private List<PricingStrategy> pricingStrategies;

    public PricingModule(){
        this.pricingStrategies = new ArrayList<PricingStrategy>();
    }

    public void addPricingStrategy(PricingStrategy pricingStrategy){
        pricingStrategies.add(pricingStrategy);
    }

    public List<PricingStrategy> getPricingStrategies() {
        return pricingStrategies;
    }

    public PricingStrategy removePricingStrategy(PricingStrategy pricingStrategy){
        pricingStrategies.remove(pricingStrategy);
        return pricingStrategy;
    }
}
