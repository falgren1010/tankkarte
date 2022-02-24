import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PointSystemTest {

    private Card card;

    @BeforeEach
    public void createCard(){

        String cryptoKey = "dhbw2022";
        this.card = new Card("Denis Danilov", "a7HxP37b", new EncryptionAES(), cryptoKey);

    }

    @Test
    @Order(1)
    public void testBlueStatus(){
        this.card.addPoints(74);
        Assertions.assertEquals(this.card.getPoints(), 74);
        Assertions.assertTrue(this.card.getState() instanceof Blue);
    }

    @Test
    @Order(2)
    public void testBronzeStatus(){
        this.card.addPoints(508);
        Assertions.assertEquals(this.card.getPoints(), 508);
        Assertions.assertTrue(this.card.getState() instanceof Bronze);
    }

    @Test
    @Order(3)
    public void testSilverStatus(){
        this.card.addPoints(1307);
        Assertions.assertEquals(this.card.getPoints(), 1307);
        System.out.println(card.getPoints());
        System.out.println(card.getPoints());
        Assertions.assertTrue(this.card.getState() instanceof Silver);
    }

    @Test
    @Order(4)
    public void testGoldStatus(){
        this.card.addPoints(5100);
        Assertions.assertEquals(this.card.getPoints(), 5100);
        Assertions.assertTrue(this.card.getState() instanceof Gold);
    }

}
