package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Copy and wipe");
        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout grid = new GridLayout(3, 1);
        container.setLayout(grid);
        JTextField top = new JTextField("I was copied here from the JTextArea.");
        JButton button = new JButton("Copy!");
        JLabel bottom = new JLabel();
        
        ActionEventListener ael = new ActionEventListener(top, bottom);
        button.addActionListener(ael);
        
        container.add(top);
        container.add(button);
        container.add(bottom);
    }
}
