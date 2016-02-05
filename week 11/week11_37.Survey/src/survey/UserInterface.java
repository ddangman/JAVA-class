package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    public void createComponents (Container container) {
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);
        
        container.add(new JLabel("Are you?"));
        container.add(new JCheckBox("Yes!"));
        container.add(new JCheckBox("No!"));
        container.add(new JLabel("Why?"));
        
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton fun = new JRadioButton("Because it is fun!");
        ButtonGroup bg = new ButtonGroup();
        bg.add(noReason);
        bg.add(fun);
        
        container.add(noReason);
        container.add(fun);
        
        container.add(new JButton("Done!"));
    }

    public JFrame getFrame() {
        return frame;
    }
}
