package assignment8;

public class Player {
    private String name;
    private int coins;
    private int place;
    private boolean inPenaltyBox;
    public Player(String name){
        this.name=name;
        this.coins=0;
        this.place=0;
        this.inPenaltyBox=false;
    }

    public String getName() {
        return name;
    }

    public int getCoins() {
        return coins;
    }

    public void giveCoins() {
        this.coins = coins+1;
        System.out.println(this.name+" now has "+this.coins+" Gold Coins.");
    }

    public void addPlace(int roll){
        this.place += roll;
        if(this.place > 11)
            this.place = 0;
        System.out.println(this.name + "'s new location is " + this.place);
    }


    public void setInPenaltyBox(boolean sendToPenalty) {
        this.inPenaltyBox = sendToPenalty;
    }
    public boolean isInPenaltyBox(){
        return this.inPenaltyBox;
    }

    public int getPlace(){
        return this.place;
    }

}
