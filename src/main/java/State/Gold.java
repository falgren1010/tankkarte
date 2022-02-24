package State;


public class Gold extends CardState {

    public Gold(Card card){
        super(card);
    }

    public void addPoints(Integer liters) {
        this.card.setPoints(this.card.getPoints() + ((liters % 25) * 8) );
        this.checkForCardStatusUpgrade();
    }

    @Override
    protected void checkForCardStatusUpgrade() {
    }
}
