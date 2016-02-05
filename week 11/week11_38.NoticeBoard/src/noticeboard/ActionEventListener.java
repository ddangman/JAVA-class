/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noticeboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Dang
 */
public class ActionEventListener implements ActionListener{
    private JTextField original;
    private JLabel copy;
    
    public ActionEventListener(JTextField original, JLabel copy) {
        this.original = original;
        this.copy = copy;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.copy.setText(this.original.getText());
        this.original.setText("");
    }
    
}
