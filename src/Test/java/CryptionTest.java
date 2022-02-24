import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class CryptionTest {

    private Card card;


    @Test
    @Order(1)
    public void testAES(){
        ICryptionStrategy crypter = new EncryptionAES();
        String cryptoKey = "dhbw2022";
        this.card = new Card("Denis Danilov", "a7HxP37b", new EncryptionAES(), cryptoKey);
        Assertions.assertEquals(this.card.getPin(), crypter.encrypt("a7HxP37b", cryptoKey ));
    }

    @Test
    @Order(2)
    public void testDES(){
        ICryptionStrategy crypter = new EncryptionDES();
        String cryptoKey = "dhbw2022";
        this.card = new Card("Denis Danilov", "a7HxP37b", new EncryptionDES(), cryptoKey);
        Assertions.assertEquals(this.card.getPin(), crypter.encrypt("a7HxP37b", cryptoKey ));
    }

}
