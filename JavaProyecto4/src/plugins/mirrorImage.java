/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plugins;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author PB650
 */
public class mirrorImage extends javax.swing.JFrame implements Plugin {
   public static String pathImage;

     @Override
    public void loadFile(String path) {
        pathImage = path;
         //To change body of generated methods, choose Tools | Templates.
             /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(mirrorImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mirrorImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mirrorImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mirrorImage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mirrorImage().setVisible(true);
            }
        });
        
        try {
            File imageenEditado = new File(path);
            Image  image1=  ImageIO.read(imageenEditado);
            ImageIcon imagen1= new ImageIcon(image1);
            jLabel1.setIcon(imagen1); 
         } catch (IOException e) {
             JOptionPane.showMessageDialog(this, e);
         }
         
    }
    /**
     * Creates new form mirrorImage
     */
    public mirrorImage() {
        initComponents();
        imagenPath();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
    }
    private void imagenPath(){ 
         if (pathImage != null) {
            File f = new File(pathImage);
            Image image = null;
            try {
                image = ImageIO.read(f);
            } catch (IOException ex) {
               JOptionPane.showMessageDialog(this, ex);
            }
            ImageIcon icon = new ImageIcon(image);
            Image imageTest = icon.getImage();
            Image newimg = imageTest.getScaledInstance(800, 480,  java.awt.Image.SCALE_SMOOTH);

            jLabel1.setIcon(new ImageIcon(newimg));
        }
    }
    
     public void leerImagen(String path){
       // BufferedImage for source image 
         
         
       BufferedImage simg = null; 
  
        
        // File object 
        File f = null; 
  
        // Read source image file 
        try
        { 
            f = new File(path); 
            simg = ImageIO.read(f); 
        } 
  
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
  
        // Get source image dimension 
        int width = simg.getWidth(); 
        int height = simg.getHeight(); 
  
        // BufferedImage for mirror image 
        BufferedImage mimg = new BufferedImage(width, height, 
                                        BufferedImage.TYPE_INT_ARGB); 
  
        // Create mirror image pixel by pixel 
        for (int y = 0; y < height; y++) 
        { 
            for (int lx = 0, rx = width - 1; lx < width; lx++, rx--) 
            { 
                // lx starts from the left side of the image 
                // rx starts from the right side of the image 
                // lx is used since we are getting pixel from left side 
                // rx is used to set from right side 
                // get source pixel value 
                int p = simg.getRGB(lx, y); 
  
                // set mirror image pixel value 
                mimg.setRGB(rx, y, p); 
            } 
        } 
  
        // save mirror image 
        try
        { 
            f = new File(path); 
            String[] archivo = (f.getName()).split("\\.");
            ImageIO.write(mimg, "jpg", f); 
        } 
        catch(IOException e) 
        { 
            System.out.println("Error: " + e); 
        } 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Hacer Mirror");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
            .addGroup(layout.createSequentialGroup()
                .addGap(947, 947, 947)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addContainerGap(579, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            leerImagen(pathImage);
            File imageenEditado = new File(pathImage);
            Image  image1=  ImageIO.read(imageenEditado);
            ImageIcon imagen1= new ImageIcon(image1);
            jLabel2.setIcon(imagen1); 
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, e);
        }
 
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
