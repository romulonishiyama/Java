import java.awt.Component;

import javax.swing.JFrame;

public class Joption

{

    public static void main(String[] args) {
        DrawPanel panel = new DrawPanel();

        JFrame application = new JFrame();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // application2.add(panel);
        application.setSize(250, 250);
        application.setVisible(true);
    }

}
