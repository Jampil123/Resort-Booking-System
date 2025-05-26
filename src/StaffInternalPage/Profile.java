
package StaffInternalPage;

import FloatedPage.change_pass;
import config.Session;
import config.dbConnector;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicInternalFrameUI;

public class Profile extends javax.swing.JInternalFrame {

    public Profile() {
        initComponents();
        
        //remove border
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI bi = (BasicInternalFrameUI)this.getUI();
        bi.setNorthPane(null);  
    }
    
    public String destination = "";
    File selectedFile;
    public String oldpath;
    public String path;
    
    public int FileExistenceChecker(String path){
        File file = new File(path);
        String fileName = file.getName();
        
        Path filePath = Paths.get("src/images", fileName);
        boolean fileExists = Files.exists(filePath);
        
        if (fileExists) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
    public static int getHeightFromWidth(String imagePath, int desiredWidth) {
        try {
            // Read the image file
            File imageFile = new File(imagePath);
            BufferedImage image = ImageIO.read(imageFile);
            
            // Get the original width and height of the image
            int originalWidth = image.getWidth();
            int originalHeight = image.getHeight();
            
            // Calculate the new height based on the desired width and the aspect ratio
            int newHeight = (int) ((double) desiredWidth / originalWidth * originalHeight);
            
            return newHeight;
        } catch (IOException ex) {
            System.out.println("No image found!");
        }
        
        return -1;
    }
    
    public ImageIcon ResizeImage(String ImagePath, byte[] pic, JLabel label) {
        ImageIcon MyImage;

        if (ImagePath != null) {
            MyImage = new ImageIcon(ImagePath);
        } else {
            MyImage = new ImageIcon(pic);
        }

        Image img = MyImage.getImage();

        int width = label.getWidth() > 0 ? label.getWidth() : 100; // fallback width
        int originalWidth = MyImage.getIconWidth();
        int originalHeight = MyImage.getIconHeight();

        int newHeight = (int) ((double) width / originalWidth * originalHeight);

        Image newImg = img.getScaledInstance(width, newHeight, Image.SCALE_SMOOTH);
        return new ImageIcon(newImg);
    }


        private void loadProfilePicture(String userId) {
            try (Connection con = new dbConnector().getConnection();
                 PreparedStatement pst = con.prepareStatement("SELECT profile_pic FROM user WHERE user_id = ?")) {

                pst.setString(1, userId);
                try (ResultSet rs = pst.executeQuery()) {
                    if (rs.next()) {
                        String fileName = rs.getString("profile_pic");
                        if (fileName != null && !fileName.isEmpty()) {
                            // Construct full image path
                            String imagePath = "src/userImages/" + fileName;

                            // Resize and set the image using your method
                            ImageIcon resizedIcon = ResizeImage(imagePath, null, image);
                            image.setIcon(resizedIcon);
                        } else {
                            image.setIcon(null); // or default
                        }
                    }
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error loading profile picture: " + e.getMessage());
            }
        }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        label_username = new javax.swing.JLabel();
        label_name = new javax.swing.JLabel();
        label_role1 = new javax.swing.JLabel();
        addButton = new javax.swing.JLabel();
        roundedPanel1 = new Swing.RoundedPanel();
        image = new javax.swing.JLabel();
        uploadButton = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        firstname_input = new javax.swing.JTextField();
        lastname_input = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        username_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email_input = new javax.swing.JTextField();
        update_button = new javax.swing.JLabel();
        change_pass = new javax.swing.JLabel();

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(910, 610));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        label_username.setText("@username");
        jPanel2.add(label_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, -1, -1));

        label_name.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label_name.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        label_name.setText("Name");
        jPanel2.add(label_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 400, -1));

        label_role1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        label_role1.setText("Staff");
        jPanel2.add(label_role1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        addButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addButtonMouseClicked(evt);
            }
        });
        jPanel2.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 240, 40, 40));

        roundedPanel1.setBackground(new java.awt.Color(153, 153, 153));
        roundedPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        image.setBackground(new java.awt.Color(204, 204, 204));
        image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/profile.png"))); // NOI18N
        roundedPanel1.add(image, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 170));

        jPanel2.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 220, 190));

        uploadButton.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        uploadButton.setText("Upload");
        uploadButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadButtonMouseClicked(evt);
            }
        });
        jPanel2.add(uploadButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 400, 550));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("First Name");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        firstname_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel4.add(firstname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 360, 50));

        lastname_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel4.add(lastname_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 360, 50));

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Last Name");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Username");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        username_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel4.add(username_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 360, 50));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Email");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        email_input.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jPanel4.add(email_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 360, 50));

        update_button.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        update_button.setText("Update");
        update_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_buttonMouseClicked(evt);
            }
        });
        jPanel4.add(update_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, -1));

        change_pass.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        change_pass.setText("Change Password");
        change_pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                change_passMouseClicked(evt);
            }
        });
        jPanel4.add(change_pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 420, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
        Session sess = Session.getInstance();
        String fullName = sess.getF_name() + " " + sess.getL_name(); // Add space between first and last name
        label_name.setHorizontalAlignment(SwingConstants.CENTER); // Center align text
        label_name.setText(fullName);
        
        label_username.setText("@"+sess.getUsername());
        
        loadProfilePicture(sess.getUser_id()); 
        firstname_input.setText(""+sess.getF_name());
        lastname_input.setText(""+sess.getL_name());
        username_input.setText(""+sess.getUsername());
        email_input.setText(""+sess.getEmail());  
    }//GEN-LAST:event_formInternalFrameActivated

    private void addButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addButtonMouseClicked
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            try {
                selectedFile = fileChooser.getSelectedFile();
                destination = "src/userImages/" + selectedFile.getName();
                path  = selectedFile.getAbsolutePath();

                if(FileExistenceChecker(path) == 1){
                    JOptionPane.showMessageDialog(null, "File Already Exist, Rename or Choose another!");
                    destination = "";
                    path="";
                }else{
                    image.setIcon(ResizeImage(path, null, image));
                }
            } catch (Exception ex) {
                System.out.println("File Error!");
            }
        }
    }//GEN-LAST:event_addButtonMouseClicked

    private void uploadButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadButtonMouseClicked

        if (selectedFile == null) {
            JOptionPane.showMessageDialog(null, "No file selected. Please choose a file first.");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(
            null,
            "Do you want to change your profile picture?",
            "Change Profile Picture",
            JOptionPane.YES_NO_OPTION
        );

        if (confirm != JOptionPane.YES_OPTION) {
            return;
        }

        try {
            String fileName = selectedFile.getName();
            File destFile = new File("src/userImages/" + fileName);

            // Get old profile picture filename from database
            dbConnector cn = new dbConnector();
            Connection con = cn.getConnection();
            Session UserSession = Session.getInstance();

            String selectSql = "SELECT profile_pic FROM user WHERE user_id = ?";
            PreparedStatement selectPst = con.prepareStatement(selectSql);
            selectPst.setString(1, UserSession.getUser_id());

            String oldFileName = null;
            try (ResultSet rs = selectPst.executeQuery()) {
                if (rs.next()) {
                    oldFileName = rs.getString("profile_pic");
                }
            }
            selectPst.close();

            // Delete old file if it exists and is different from new file
            if (oldFileName != null && !oldFileName.isEmpty() && !oldFileName.equals(fileName)) {
                File oldFile = new File("src/userImages/" + oldFileName);
                if (oldFile.exists()) {
                    boolean deleted = oldFile.delete();
                    if (!deleted) {
                        System.out.println("Warning: Could not delete old profile picture: " + oldFileName);
                    }
                }
            }

            // Copy new file, overwriting if it exists
            Files.copy(selectedFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);

            // Update database with new filename
            String updateSql = "UPDATE user SET profile_pic = ? WHERE user_id = ?";
            PreparedStatement updatePst = con.prepareStatement(updateSql);
            updatePst.setString(1, fileName);
            updatePst.setString(2, UserSession.getUser_id());

            int rows = updatePst.executeUpdate();
            if (rows > 0) {
                JOptionPane.showMessageDialog(null, "Profile picture updated successfully.");
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update profile picture.");
            }

            updatePst.close();
            con.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error uploading image: " + e.getMessage());
        }

    }//GEN-LAST:event_uploadButtonMouseClicked

    private void update_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_buttonMouseClicked

        // Get updated values from input fields
        String newFirstName = firstname_input.getText();
        String newLastName = lastname_input.getText();
        String newUsername = username_input.getText();
        String newEmail = email_input.getText();

        // Get session instance
        Session sess = Session.getInstance();
        String userId = sess.getUser_id(); // Retrieve user_id

        // Debugging check
        System.out.println("User ID: " + userId); 
        if (userId == null || userId.trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Error: User ID is missing!");
            return;
        }

        // Update session data
        sess.setF_name(newFirstName);
        sess.setL_name(newLastName);
        sess.setUsername(newUsername);
        sess.setEmail(newEmail);

        // Update UI labels
        label_name.setText(newFirstName + " " + newLastName);
        label_username.setText("@" + newUsername);

        // Update database
        try {
            dbConnector con = new dbConnector();
            Connection conn = con.getConnection();

            if (conn == null) {
                JOptionPane.showMessageDialog(this, "Database connection failed.");
                return;
            }

            // Removed profile_pic from the query
            String sql = "UPDATE user SET f_name = ?, l_name = ?, username = ?, email = ? WHERE user_id = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, newFirstName);
            pst.setString(2, newLastName);
            pst.setString(3, newUsername);
            pst.setString(4, newEmail);

            // Check if user_id is an integer or string
            try {
                int userIdInt = Integer.parseInt(userId);
                pst.setInt(5, userIdInt);
            } catch (NumberFormatException e) {
                pst.setString(5, userId); // Use string if user_id is stored as varchar
            }

            int updated = pst.executeUpdate();
            if (updated > 0) {
                JOptionPane.showMessageDialog(this, "Profile updated successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to update profile.");
            }

            pst.close();
            conn.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_update_buttonMouseClicked

    private void change_passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_change_passMouseClicked
        JDialog dialog = new JDialog(); // Create a floating window
        change_pass newPanel = new change_pass();

        dialog.add(newPanel); // Add add_user to the dialog
        dialog.setSize(500, 380); // Set the size of the window
        dialog.setLocationRelativeTo(null); // Center the window
        dialog.setModal(true); // Prevent interactions with the main window until closed
        dialog.setVisible(true); // Show the floating add_user
    }//GEN-LAST:event_change_passMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addButton;
    private javax.swing.JLabel change_pass;
    private javax.swing.JTextField email_input;
    private javax.swing.JTextField firstname_input;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel label_name;
    private javax.swing.JLabel label_role1;
    private javax.swing.JLabel label_username;
    private javax.swing.JTextField lastname_input;
    private Swing.RoundedPanel roundedPanel1;
    private javax.swing.JLabel update_button;
    private javax.swing.JLabel uploadButton;
    private javax.swing.JTextField username_input;
    // End of variables declaration//GEN-END:variables
}
