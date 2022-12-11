/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakout;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author ashwi
 */

public class BreakOut extends JFrame {

    /*public BreakOut(){
        
        initUI();
    }
    
    public void initUI(){
        
        add(new Board());
        setTitle("Breakout");
        
        
        setSize(Commons.WIDTH, Commons.HEIGTH);
        //setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        //setFocusable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    */
    public static void main(String[] args) {
        // TODO code application logic here
        /* 
        EventQueue.invokeLater(() -> {
            BreakOut game = new BreakOut();
            game.setVisible(true);
        });*/
        
        JFrame obj = new JFrame();
        Board board = new Board();
        obj.setSize(Commons.WIDTH, Commons.HEIGTH);
        obj.setTitle("Breakout");
        obj.setResizable(false);
        obj.setVisible(true);
        obj.add(board);
    }
    
}
