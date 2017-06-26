package twelve;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by forgot on 2017/6/26.
 */
public class SimpleGui1 {
    JButton button;
    static boolean flag;
    static Graphics graphics;
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("click me");
        button.setSize(100,100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(button);
        frame.setSize(800, 500);
        frame.setVisible(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (flag){
                    button.setText("has change");
                    flag=!flag;
                    graphics.setColor(Color.blue);
                }else{
                    button.setText("recover");
                    flag=!flag;
                    graphics.setColor(Color.orange);
                }

            }
        });
    }

    public void changeIt(String text){
        button.setText(text);
    }
}
