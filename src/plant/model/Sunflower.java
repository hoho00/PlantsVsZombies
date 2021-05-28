package plant.model;

import plant.strategy.ProduceSunBySunFlower;
import sun.producer.SunFlowerSunProducer;
import sun.producer.SunProducer;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * Created by Armin on 6/28/2016.
 */
public class Sunflower extends Plant {
    public static final int DELAY = 15000;
    private SunProducer sunProducer;
    private Timer sunProducerTimer;

    public Sunflower(int x, int y) {
        super(x, y);
        sunProducer = new SunFlowerSunProducer(x,y);
        sunProducerTimer = new Timer(DELAY,(ActionEvent e)->{sunProducer.createSunView();});
        sunProducerTimer.start();
    }
}
