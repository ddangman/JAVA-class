package clicker.ui;

import clicker.applicationlogic.Calculator;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private JFrame frame;
    private Calculator calculator;

    public UserInterface(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(200, 100));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        BorderLayout layout = new BorderLayout(2, 1);
        frame.setLayout(layout);
        JLabel value = new JLabel("0");
        JButton click = new JButton("Click!");
        ClickListener actionListener = new ClickListener(calculator, value);
        click.addActionListener(actionListener);
        
        container.add(value, BorderLayout.NORTH);
        container.add(click);
    }

    public JFrame getFrame() {
        return frame;
    }
}
