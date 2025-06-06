
package Effect;

import javax.swing.*;
import java.awt.event.*;

public class ShakeButton {
    public static void shake(JPanel panel) { 
        final int originalX = panel.getX();
        final int originalY = panel.getY();
        final int shakeDistance = 5; // Smaller for smooth effect
        final int duration = 300; // Total time in milliseconds

        Timer timer = new Timer(20, new ActionListener() {
            int count = 0;
            final int cycles = duration / 20; // Total number of movements

            @Override
            public void actionPerformed(ActionEvent e) {
                if (count < cycles) { 
                    int offsetX = (int) (shakeDistance * Math.sin(count * 2 * Math.PI / cycles));
                    panel.setLocation(originalX + offsetX, originalY);
                    count++;
                } else {
                    ((Timer) e.getSource()).stop();
                    panel.setLocation(originalX, originalY); // Reset position
                }
            }
        });

        timer.setRepeats(true);
        timer.start();
    }
}
