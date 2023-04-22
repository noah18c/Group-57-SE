package stakeholders;

public class SoftwareDev extends Stakeholder {
    protected int devId;

    public SoftwareDev(String name, int devId) {
        super(name);
        this.devId = devId;
    }


}