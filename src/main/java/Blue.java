public class Blue extends CardState{

    public Blue(Card card){
        super(card);
    }

    @Override
    public void addPoints(Integer liters) {
        this.card.setPoints(this.card.getPoints() + liters);
        this.checkForCardStatusUpgrade();
    }

    @Override
    protected void checkForCardStatusUpgrade() {
        if(this.card.getPoints() >= 500){
            this.card.setState(new Bronze(this.card));
        }
    }

}
