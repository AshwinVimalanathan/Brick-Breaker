/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import javax.swing.ImageIcon;

/**
 *
 * @author ashwi
 */

public class Brick extends Sprite{
    
    private boolean destroyed;
    
    public Brick(int x, int y) {
        
        initBrick(x, y);
    }
    
    private void initBrick(int x, int y) {
        
        this.x = x;
        this.y = y;
        
        destroyed = false;

        loadImage();
        getImageDimensions();
    }
    
    private void loadImage() {
        
        ImageIcon ii = new ImageIcon("C:/BreakOut/brick1.png");
        image = ii.getImage();        
    }

    public boolean isDestroyed() {
        
        return destroyed;
    }

    public void setDestroyed(boolean val) {
        
        destroyed = val;
    }
    
}
