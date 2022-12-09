// This class creates the progress bar and prints to the console

//import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBarLoader {

    JFrame frame = new JFrame();
    JProgressBar bar = new JProgressBar(0, 100);

    ProgressBarLoader() {
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        bar.setValue(0);
        bar.setSize(200, 20);
        bar.setBounds(0, 0, 420, 80);
        bar.setStringPainted(true);
        // bar.setBackground(Color.black);
        // bar.setForeground(Color.green);

        frame.add(bar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 50);
        frame.setLayout(null);
        frame.setResizable(false);
    }

    public void Load() {
        int counter = 0;
        frame.setVisible(true);
        while (counter <= 100) {

            bar.setValue(counter);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block

            }
            counter += Math.random() * 12;
        }
        // bar.setString("Done! :)");
        counter = 0;
        frame.setVisible(false);
    }

}
