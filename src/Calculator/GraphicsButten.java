package Calculator;

import java.awt.*;

/**
 * @auther Wuyifan
 * @create 2020-10-18-15:59
 */
public class GraphicsButten {
    int x;
    int y;
    int height;
    int width;

    public GraphicsButten(int x, int y, int height, int width) {
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }


    public void paint(Graphics g){
        g.setColor(Color.ORANGE);
        g.fillRect(x,y,width,height);

        g.setColor(Color.RED);
        g.fillRect(x,y,width,height);

    }


}
