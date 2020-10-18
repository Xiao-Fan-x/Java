package Calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * @auther Wuyifan
 * @create 2020-10-18-15:50
 */
public class MyPanel extends JPanel implements MouseMotionListener , MouseListener {

    GraphicsButten gButton;

    public MyPanel(){
        gButton = new GraphicsButten(100,100,80,60);


    }

    @Override
    public void paint(Graphics g) {


    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

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

    }
}
