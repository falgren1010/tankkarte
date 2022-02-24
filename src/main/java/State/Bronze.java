package State;

public class Bronze extends CardState {

    public Bronze(Card card){
        super(card);
    }

    @Override
    public void addPoints(Integer liters) {
        this.card.setPoints(this.card.getPoints() + ((liters % 25) * 3) );
        this.checkForCardStatusUpgrade();
    }

    @Override
    protected void checkForCardStatusUpgrade() {
        if(this.card.getPoints() >= 1250){
            this.card.setState(new Silver(this.card));
        }
        else if(this.card.getPoints() >= 5000){
            this.card.setState(new Gold(this.card));
        }
    }
}
