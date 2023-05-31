package assignment8;

public class Players {
    private String name;
    private int coins;
    private int position;
    private boolean penalty;
    public Players(String name, int coins,int position, boolean penalty){
        this.name=name;
        this.coins=coins;
        this.position=position;
        this.penalty=penalty;
    }
    public void updatePosition(int index){
        this.position=index;
    }
    public boolean getPenatly(){ return penalty;}

    public String getName() {
        return name;
    }
    public void setBoolean(Boolean newState){
        this.penalty= newState;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCoins() {
        return coins;
    }

    public void giveCoins() {
        this.coins = coins+1;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
