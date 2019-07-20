package coin;

public class Coin {

    private  String coinName;
   private int value;


    public Coin(String coinName, int value) {
        this.coinName = coinName;
        this.value = value;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


}
