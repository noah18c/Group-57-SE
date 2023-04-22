package users;

import modules.OrderEntryModule;

abstract class Staff extends User{
    protected int staffId;
    public Staff(String name, OrderEntryModule orderEntryModule, int staffId){
        super(name, orderEntryModule);
        this.staffId = staffId;
    }

    public int getStaffId() {
        return staffId;
    }

    public void setStaffId(int staffId) {
        this.staffId = staffId;
    }
}
