package Pea.model;

import javax.swing.*;

import zombie.model.Zombie;

import java.awt.*;

public abstract class Pea implements PeaStrategy {
    private int xPosition;
    private int myLane;
    protected static Image peaImage;

    public Pea(int lane, int startX) {
        this.myLane = lane;
        xPosition = startX;
        setImage();
    }

    public abstract int getPower();

    protected abstract void setImage();

    public static Image getImage() {
        return peaImage;
    }

    public abstract void advance();

    public int getXPosition() {
        return xPosition;
    }

    public void setXPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    public int getMyLane() {
        return myLane;
    }

    public void setMyLane(int myLane) {
        this.myLane = myLane;
    }
}
