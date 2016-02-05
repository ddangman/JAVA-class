
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class EventListener implements ActionListener {
    
    private JTextField output;
    private JTextField input;
    private JButton plus;
    private JButton minus;
    private JButton reset;
    
    public EventListener(JTextField o, JTextField i, JButton p, JButton m, JButton r) {
        this.output = o;
        this.input = i;
        this.plus = p;
        this.minus = m;
        this.reset = r;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.plus) {
            if (checkInteger(input)) {
                add();
            }            
        } else if (e.getSource() == this.minus) {
            if (checkInteger(input)) {
                subtract();
            }
        } else if (e.getSource() == this.reset) {
            resetAll();
        }        
    }
    
    public void setOutput(int i) {
        String text = Integer.toString(i);
        this.output.setText(text);
    }
    
    public void wipeInput() {
        this.input.setText("");
    }
    
    public int getValue(JTextField tf) {
        return Integer.parseInt(tf.getText());        
    }
    
    public boolean checkInteger(JTextField tf) {
        try {
            getValue(tf);
        } catch (Exception e) {
            wipeInput();
            return false;
        }        
        return true;
    }
    
    public void add() {
        reset.setEnabled(true);
        int sum = getValue(output) + getValue(input);
        setOutput(sum);
        wipeInput();
    }
    
    public void subtract() {
        reset.setEnabled(true);
        int difference = getValue(output) - getValue(input);
        setOutput(difference);
        wipeInput();
        reset.setEnabled(false);
    }
    
    public void resetAll() {
        wipeInput();
        setOutput(0);
        reset.setEnabled(false);
    }
}
