package Calculator;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();
        app.go();
    }

    void go(){
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(500,600);

        MyPanel mp = new MyPanel();
        frame.getContentPane().add(mp);

        frame.setVisible(true);

    }
}
