package test1;

import Game.view.GameWindow;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import plant.creator.PlantFactory;
import plant.model.Plant;
import plant.model.Sunflower;

public class PlantFactoryTest {
    PlantFactory plantFactory;
    @Before
    public void setUp(){
        plantFactory = PlantFactory.getInstance();
    }
    @After
    public void tearDown(){
        plantFactory = null;
    }

    /**
     * Purpose : Test PlantFactory Create right plant By plant Type SunFlower
     * Input : getPlant(plantType) , return Sunflower Instance
     * Expected :
     *  plant instance of Sunflower : true
     */
    @Test
    public void testGetPlantSunflower(){
        Plant plant = plantFactory.getPlant(GameWindow.PlantType.Sunflower,0,0);
        Assert.assertTrue(plant instanceof Sunflower);
    }
}
