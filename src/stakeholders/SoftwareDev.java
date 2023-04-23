package stakeholders;

public class SoftwareDev extends Stakeholder {


    public SoftwareDev(String name) {
        super(name);
    }

    public void createPricingModule(){
        pricingModule = new PricingModule();
    }


}