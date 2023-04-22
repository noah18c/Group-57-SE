package stakeholders;

public class RestaurantOwner extends Stakeholder {
    protected int ownerId;

    public RestaurantOwner(String name, int ownerId) {
        super(name);
        this.ownerId = ownerId;
    }


}
