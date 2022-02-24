public class Application {

    public static void main(String[] args){

        String cryptoKey = "dhbw2022";

        Card card = new Card("Denis Danilov", "a7HxP37b", new EncryptionAES(), cryptoKey);
        card.addPoints(74);

    }

}
