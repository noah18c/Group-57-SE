package assignment2.stakeholders;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

public class SoftwareDev extends Stakeholder {


    public SoftwareDev(String name) {
        super(name);
    }

    public void createPricingModule(){
        pricingModule = new PricingModule();
    }


}