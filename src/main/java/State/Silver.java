package State;

public class Silver extends CardState {

    public Silver(Card card){
        super(card);
    }

    public void addPoints(Integer liters) {
        this.card.setPoints(this.card.getPoints() + ((liters % 25) * 5) );
        this.checkForCardStatusUpgrade();
    }

    @Override
    protected void checkForCardStatusUpgrade() {
        if(this.card.getPoints() >= 5000){
            this.card.setState(new Gold(this.card));
        }
    }
}
