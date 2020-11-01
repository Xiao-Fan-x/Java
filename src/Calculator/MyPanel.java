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

    GraphicsButton gButtons[4][4] = new GraphicsButton[][];
    String names[][] = {
            {"7","8","9","+"},
            {"4","5","6","+"},
            {"1","2","3","+"},
            {".","0","-","/"}
    };

    public MyPanel(){

        for (int row = 0;row < 4; row++){
            for (int col = 0; col < 4; col++){
                gButton[row][col] = new GraphicsButton(50+row*100,100+)
            }
        }
        gButton = new GraphicsButton(100,100,80,60,"X");

        this.addMouseListener(this);
        this.addMouseMotionListener(this);

    }

    @Override
    public void paint(Graphics g) {
        gButton.paint(g);

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        gButton.mousePressed(e);
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
        gButton.mouseMoved(e);
        //
        repaint();


    }
}
