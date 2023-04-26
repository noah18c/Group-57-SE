package assignment2.stakeholders;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

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
