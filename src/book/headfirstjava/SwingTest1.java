package book.headfirstjava;

import javax.swing.*;
import java.awt.*;

/**
 * Created by forgot on 2017/6/26.
 */
public class SwingTest1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel panelA = new JPanel();
        JPanel panelB = new JPanel();
        panelB.add(new JButton("button1"));
        panelB.add(new JButton("button2"));
        panelB.add(new JButton("button3"));
        panelA.add(panelB);
        frame.getContentPane().add(BorderLayout.EAST,panelA);
        frame.setSize(600,600);
        frame.setVisible(true);
    }
}
