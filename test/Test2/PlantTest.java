package Test2;

import Game.view.GamePanel;
import static org.junit.Assert.*;
import org.junit.*;
import plant.model.Plant;
import plant.model.Sunflower;
import sun.producer.SunFlowerSunProducer;
import sun.producer.SunProducer;

public class PlantTest {
    private static Plant plantTestComponent;
    private static GamePanel gamePanelTestComponent;

    @BeforeClass
    public static void setUpBeforeClass() {
        gamePanelTestComponent = GamePanel.getInstance();
    }

    @Before
    public void setUpBefore() {

    }

    @After
    public void tearDown() {
        gamePanelTestComponent = null;
        plantTestComponent = null;
    }

    @AfterClass
    public static void tearDownAfterClass() {

    }

    /**
     * Purpose: test sunflower constructor
     * Input: execute sun(int x, int y):
     *        X = 100 , Y = 10
     * Expected:
     *      return SUCCESS
     *      (plantTestComponent.getX() == X && plantTestComponent.getY() == Y) == True
     */

    @Test
    public void createSunflowerTest() {
        int X = 100;
        int Y = 10;
        plantTestComponent = new Sunflower(X, Y);
        assertEquals(plantTestComponent.getX(),X);
        assertEquals(plantTestComponent.getY(),Y);
    }

    /**
     * Purpose: test whether sun constructor create sun at given position or not
     * Input: execute sun(int x, int y):
     *        X = 100 , Y = 10
     * Expected:
     *      return SUCCESS
     *      (sunProducer.getX() == X && sunProducer.getY() == Y) == True
     */
    @Test
    public void createSunFromSunflowerTest() {
        int X = 100;
        int Y = 10;
        plantTestComponent = new Sunflower(X, Y);
        SunFlowerSunProducer p = (SunFlowerSunProducer) new Sunflower(X, Y).getSunProducer();
        assertEquals(plantTestComponent.getX(),p.getXPosition());
        assertEquals(plantTestComponent.getY(),p.getYPosition());
    }

}
