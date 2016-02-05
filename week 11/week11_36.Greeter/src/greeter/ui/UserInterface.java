package greeter.ui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame ("JFrame title");
        frame.setPreferredSize(new Dimension(400, 200));
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        JLabel text = new JLabel ("Hi!");
        container.add(text);
        JButton button = new JButton("Click!");
        container.add(button);
        
        container.add(new JButton("North"), BorderLayout.NORTH);
        container.add(new JButton("East"), BorderLayout.EAST);
        container.add(new JButton("South"), BorderLayout.SOUTH);
        container.add(new JButton("West"), BorderLayout.WEST);
        container.add(new JButton("Center (Default)"), BorderLayout.CENTER);
    }

    public JFrame getFrame() {
        return frame;
    }
}
