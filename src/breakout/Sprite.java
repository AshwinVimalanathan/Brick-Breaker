/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;


import java.awt.Image;
import java.awt.Rectangle;

/**
 *
 * @author ashwi
 */

public class Sprite {
    protected int x;
    protected int y;
    protected int imageWidth;
    protected int imageHeight;
    protected Image image;
    
    protected void setX(int x) {
        this.x = x;
    }

    protected int getX() {
        return x;
    }

    protected void setY(int y) {
        this.y = y;
    }

    protected int getY() {
        return y;
    }

    protected int getImageWidth() {
        return imageWidth;
    }

    protected int getImageHeight() {
        return imageHeight;
    }

    protected Image getImage() {
        return image;
    }

    protected Rectangle getRect() {
        return new Rectangle(x, y,
                image.getWidth(null), image.getHeight(null));
    }

    protected void getImageDimensions() {

        imageWidth = image.getWidth(null);
        imageHeight = image.getHeight(null);
    }
}
