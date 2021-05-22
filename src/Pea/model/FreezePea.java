package Pea.model;

import lane.model.Lane;
import window.GamePanel;
import zombie.model.Zombie;

import java.awt.*;

/**
 * Created by Armin on 6/28/2016.
 */
public class FreezePea extends Pea {
    private Lane lanes;
    public FreezePea(int lane, int startX) {
        super(lane, startX);
    }

    @Override
    public void advance() {
        Rectangle pRect = new Rectangle(getPosX(), 130 + getMyLane() * 120, 28, 28);
        for (int i = 0; i < lanes.getLaneZombies().get(getMyLane()).size(); i++) {
            Zombie z = lanes.getLaneZombies().get(getMyLane()).get(i);
            Rectangle zRect = new Rectangle(z.getPosX(), 109 + getMyLane() * 120, 400, 120);
            if (pRect.intersects(zRect)) {
                z.setHealth(z.getHealth() - 300);
                z.slow();
                boolean exit = false;
                if (z.getHealth() < 0) {
                    System.out.println("ZOMBIE DIE");
                    GamePanel.setProgress(10);
                    lanes.getLaneZombies().get(getMyLane()).remove(i);
                    exit = true;
                }
                lanes.getLaneZombies().get(getMyLane()).remove(this);
                if (exit) break;
            }
        }
        /*if(posX > 2000){
            gp.lanePeas.get(myLane).remove(this);
        }*/
        setPosX(getPosX() - 15);
    }

}
