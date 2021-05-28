package plant.model;

import Game.view.GamePanel;
import Lane.model.Lane;
import plant.strategy.PlantShootingStrategy;


/**
 * Created by Armin on 6/25/2016.
 */
public abstract class Plant {

    private int health = 200;

    private int xPosition;
    private int yPosition;

    private GamePanel gamePanel;
    private Lane lane;

    private PlantShootingStrategy plantShootingStrategy;


    public Plant(int xPosition, int yPosition) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        gamePanel = gamePanel.getInstance();
        lane = lane.getInstance();
    }

    public void shoot() {
        plantShootingStrategy.shoot(xPosition, yPosition, lane);
    }



    public void setPlantShootingStrategy(PlantShootingStrategy plantShootingStrategy) {
        this.plantShootingStrategy = plantShootingStrategy;
    }


    public void stop() {
    }

    public Lane getLane() {
        return lane;
    }

    public void setLane(Lane lane) {
        this.lane = lane;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }

    public GamePanel getGamePanel() {
        return gamePanel;
    }

    public void setGamePanel(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

}
