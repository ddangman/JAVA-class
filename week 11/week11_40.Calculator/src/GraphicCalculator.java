
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;

    @Override
    public void run() {
        this.frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(400, 300));
        
        createComponents(frame.getContentPane());
        
        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);
        
        JTextField output = new JTextField("0");
        output.setEnabled(false);
        JTextField input = new JTextField();
        
        JPanel bottomPanel = new JPanel( new GridLayout(1, 3) );
        JButton plus = new JButton("+");
        JButton minus = new JButton("-");
        JButton reset = new JButton("Z");
        bottomPanel.add(plus);
        bottomPanel.add(minus);
        bottomPanel.add(reset);
        
        EventListener handler = new EventListener(output, input, plus, minus, reset);
        plus.addActionListener(handler);
        minus.addActionListener(handler);
        reset.addActionListener(handler);
        reset.setEnabled(false);
        
        container.add(output);
        container.add(input);
        container.add(bottomPanel);
    }

    public JFrame getFrame() {
        return frame;
    }
}