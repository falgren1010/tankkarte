package State;
import Strategy.*;


public class Card {

    private final String cardOwner;
    private final String pin;
    private CardState state;
    private final ICryptionStrategy crypter;
    private Integer points;

    public Card(String cardOwner, String pin, ICryptionStrategy cryptionStrategy, String crypKey) {
        this.cardOwner = cardOwner;
        this.state = new Blue(this);
        this.crypter = cryptionStrategy;
        this.pin = this.crypter.encrypt(pin, crypKey);
        this.points = 0;
    }

    public Integer getPoints() {
        return this.points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public void addPoints(Integer refueledLiters) {
        this.state.addPoints(refueledLiters);
    }

    public void setState(CardState state) {
        this.state = state;
    }

    public CardState getState() {
        return this.state;
    }

    //Funktion wird nur für UnitTests benötigt
    public String getPin(){
        return this.pin;
    }

}
