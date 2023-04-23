package stakeholders;

import Restaurant.Item;
import Restaurant.Menu;
import ordering.OrderEntryModule;

public interface PricingStrategy {
    public void priceModification(OrderEntryModule orderEntryModule, double amount);
    public void priceModification(Item item, double amount);

}
