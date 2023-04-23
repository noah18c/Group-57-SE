package stakeholders;

import java.util.ArrayList;
import java.util.List;

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
