import com.sun.tools.javac.Main;

import javax.swing.*;
import javax.swing.JFrame;

public class MainForm extends JFrame{
    private JButton button1;
    private JPanel mainPanel;

    public static void main(String[] args) {
        MainForm mainForm = new MainForm();
        mainForm.setSize(200,150);
        mainForm.setVisible(true);
        mainForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public MainForm(){
        setTitle("Hello GUI");
        setContentPane(mainPanel);
        button1.addActionListener(e->Hello());
    }

    void Hello(){
        JOptionPane.showMessageDialog(this, "Hello GUI!");
    }
}
