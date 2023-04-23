package stakeholders;

public class SoftwareDev extends Stakeholder {

    private PricingModule pricingModule;

    public SoftwareDev(String name) {
        super(name);
    }

    public void createPricingModule(){
        pricingModule = new PricingModule();
    }


}