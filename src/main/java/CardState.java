public abstract class CardState {

    protected final Card card;

    public CardState(Card card){
        this.card = card;
    }

    public abstract void addPoints(Integer liters);

    protected abstract void checkForCardStatusUpgrade();

}
