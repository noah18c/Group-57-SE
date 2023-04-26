package assignment2.stakeholders;

import assignment2.restaurant.Item;
import assignment2.ordering.OrderEntryModule;

/**
 * group name: 57
 * student names: Noah Croes, Achilleas Leivadiotis
 * student id's: i6220934, i6327367
 */

public interface PricingStrategy {
    public void priceModification(OrderEntryModule orderEntryModule, double amount);
    public void priceModification(Item item, double amount);

}
