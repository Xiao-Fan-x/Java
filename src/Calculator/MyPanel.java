package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @auther WuYiFan
 * @create 2020-10-18-15:50
 */
public class MyPanel extends JPanel implements MouseMotionListener , MouseListener {

    GraphicsButton gButtons[][] = new GraphicsButton[4][4];
    String names[][] = {
            {"7","8","9","+"},
            {"4","5","6","+"},
            {"1","2","3","+"},
            {".","0","-","/"}
    };

   public MyPanel(){

        for (int row = 0;row < 4; row++){
            for (int col = 0; col < 4; col++){
                gButtons[row][col] = new GraphicsButton(50+row*100,100+row*80,80,60,names[row][col]);
            }
        }
        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }

    @Override
    public void paint(Graphics g) {
        for (int row = 0;row <  4;row ++){
            for (int col = 0;col < 4;col++){
                gButtons[row][col].paint(g);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        for (int row = 0;row <  4;row ++){
            for (int col = 0;col < 4;col++){
                gButtons[row][col].mousePressed(e);
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        for (int row = 0;row <  4;row ++){
            for (int col = 0;col < 4;col++){
                gButtons[row][col].mouseMoved(e);
            }
        }
        //
        repaint();


    }
}
