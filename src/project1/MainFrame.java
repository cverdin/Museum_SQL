
package project1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

public class MainFrame implements ActionListener{

    private Timer timer;
    private JFrame f;

    // method: MainFrame
    // purpose: Default Constructor
    public MainFrame()
    {
        timer = new Timer(3000, this);
    }

    // method: main
    // purpose: the main that run the program
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainFrame main = new MainFrame();
                main.createAndShowGUI();
            }
        });
    }

    // method: createAndShowGUI
    // purpose: create and show the loading GUI and also start the timer
    public void createAndShowGUI() {
        System.out.println("Created GUI on EDT? "+ SwingUtilities.isEventDispatchThread());
        f = new JFrame("Loading Screen");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new LoadingFrame());
        f.pack();
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        timer.start();
    }

    // method: actionPerformed
    // purpose: this is where is catch the timer when it is done and set the FirstFrame
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() == timer){
            f.dispose();
            f = new JFrame("Home Screen");
            f.add(new FirstFrame(f));
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.pack();
            f.setVisible(true);
            f.setLocationRelativeTo(null);
            timer = null;
        }
    }
}
