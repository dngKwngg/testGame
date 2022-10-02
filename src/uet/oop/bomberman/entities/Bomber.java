package uet.oop.bomberman.entities;

import javafx.scene.SnapshotParameters;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import uet.oop.bomberman.graphics.Sprite;

public class Bomber extends Entity {

    private int isLife=1;

    private int swap=1;

    public Bomber(int x, int y, Image img) {
        super( x, y, img);
    }

    public int isLife(){
        return isLife;
    }
    @Override
    public void update() {

    }

    public void moveup(){
        this.setY(this.getY()-32);
        upStep();
    }

    public void movedown(){
        this.setY(this.getY()+32);
        downStep();
    }

    public void moveleft(){
        this.setX(this.getX()-32);
        leftStep();
    }

    public void moveright(){
        this.setX(this.getX()+32);
        rightStep();
    }

    public int getSwap(){
        return swap;
    }

    public void setSwap(int swap){
        this.swap=swap;
    }

    public void upStep(){
        if (getSwap() == 1) {
            setImg(Sprite.player_up.getFxImage());
            setSwap(2);
        } else if (getSwap() == 2) {
            setImg(Sprite.player_up_1.getFxImage());
            setSwap(3);
        } else if (getSwap() == 3) {
            setImg(Sprite.player_up_2.getFxImage());
            setSwap(4);
        } else {
            setImg(Sprite.player_up_2.getFxImage());
            setSwap(1);
        }
    }

    public void downStep(){
        if (getSwap() == 1) {
            setImg(Sprite.player_down.getFxImage());
            setSwap(2);
        } else if (getSwap() == 2) {
            setImg(Sprite.player_down_1.getFxImage());
            setSwap(3);
        } else if (getSwap() == 3) {
            setImg(Sprite.player_down_2.getFxImage());
            setSwap(4);
        } else {
            setImg(Sprite.player_down_2.getFxImage());
            setSwap(1);
        }
    }

    public void leftStep(){
        if (getSwap() == 1) {
            setImg(Sprite.player_left.getFxImage());
            setSwap(2);
        } else if (getSwap() == 2) {
            setImg(Sprite.player_left_1.getFxImage());
            setSwap(3);
        } else if (getSwap() == 3) {
            setImg(Sprite.player_left_2.getFxImage());
            setSwap(4);
        } else {
            setImg(Sprite.player_left_2.getFxImage());
            setSwap(1);
        }
    }

    public void rightStep(){
        if (getSwap() == 1) {
            setImg(Sprite.player_right.getFxImage());
            setSwap(2);
        } else if (getSwap() == 2) {
            setImg(Sprite.player_right_1.getFxImage());
            setSwap(3);
        } else if (getSwap() == 3) {
            setImg(Sprite.player_right_2.getFxImage());
            setSwap(4);
        } else {
            setImg(Sprite.player_right_2.getFxImage());
            setSwap(1);
        }
    }
}
