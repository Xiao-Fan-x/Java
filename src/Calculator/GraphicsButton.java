package Calculator;

import java.awt.*;
import java.awt.event.MouseEvent;

/**
 * @auther Wuyifan
 * @create 2020-10-18-15:59
 */
public class GraphicsButton {
    int x;
    int y;
    int height;
    int width;
    int state = 0; //state  0:normal; 1:hover
    String name;

    public GraphicsButton(int x, int y, int height, int width, String name) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
        this.name = name;
    }


    public void paint(Graphics g){

        if (state == 0){
            g.setColor(Color.GREEN);
        }else {
            g.setColor(Color.MAGENTA);
        }

        g.fillRect(x,y,width,height);

        g.setColor(Color.RED);
        g.fillRect(x,y,width,height);

        g.setColor(Color.BLACK);

        Font f = new Font("Arial",Font.PLAIN,30);
        g.setFont(f);

        FontMetrics fm = g.getFontMetrics();
        int w = fm.stringWidth("8");
        int h = fm.getHeight();

        g.drawString("8",x+((width)-w)/2,y+(height-h)/2+h*4/5);
    }

    public void mouseMoved(MouseEvent e){

        if (e.getX()<=x||e.getX()>x+width||e.getY()<=y||e.getY()>y){
            state = 0;
        }else {
            state = 1;
        }
    }

    public void mousePressed(MouseEvent e){
        if (state == 1){
            System.out.println(name);
        }
    }


}
