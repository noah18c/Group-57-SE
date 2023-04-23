package stakeholders;
import Restaurant.Restaurant;

abstract class Stakeholder {

    protected String name;
    protected PricingModule pricingModule;
    public Stakeholder(String name){
        this.name = name;
    }

    public PricingModule getPricingModule() {
        return pricingModule;
    }

    public void setPricingModule(PricingModule pricingModule) {
        this.pricingModule = pricingModule;
    }
}
