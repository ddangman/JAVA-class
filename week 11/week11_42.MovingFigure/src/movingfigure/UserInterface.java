package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {
    private DrawingBoard drawingboard;
    private JFrame frame;
    private Figure figure;
    
    public UserInterface(Figure figure) {
        this.figure = figure;
         this.drawingboard = new DrawingBoard(figure);
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.add(drawingboard);
    }

    private void addListeners() {
        this.frame.addKeyListener(new KeyboardListener(drawingboard, figure));
    }

    public JFrame getFrame() {
        return frame;
    }
}
