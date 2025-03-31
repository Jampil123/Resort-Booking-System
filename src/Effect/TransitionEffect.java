
package Effect;

import javax.swing.*;
import java.awt.event.*;

public class TransitionEffect {
    public static void fadeOutAndOpen(JInternalFrame currentFrame, JInternalFrame newFrame) {
        JDesktopPane desktopPane = currentFrame.getDesktopPane(); // Get the parent desktop pane

        if (desktopPane != null) {
            Timer fadeOut = new Timer(50, new ActionListener() {
                float opacity = 1.0f; // Simulated opacity effect

                @Override
                public void actionPerformed(ActionEvent e) {
                    opacity -= 0.1f; // Reduce "visibility"
                    if (opacity <= 0) {
                        ((Timer) e.getSource()).stop(); // Stop timer
                        currentFrame.setVisible(false); // Hide the frame
                        currentFrame.dispose(); // Close the frame

                        // Open the new frame
                        desktopPane.add(newFrame);
                        newFrame.setVisible(true);
                    } else {
                        currentFrame.setOpaque(false); // Simulate fading effect
                        currentFrame.repaint(); // Refresh UI
                    }
                }
            });

            fadeOut.start(); // Start animation
        }
    }
}
