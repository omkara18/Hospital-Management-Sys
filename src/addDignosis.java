
import Project.ConnectionProvider;
import java.sql.*;

import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author user
 */
public class addDignosis extends javax.swing.JFrame {
    public int flag=0;

   
    

    /**
     * Creates new form addDignosis
     */
    public addDignosis() {
        initComponents();
        idDoesnotExistLabel.setVisible(false);
        typeOfWardLabel.setVisible(false);
        typesOfWardField.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        symptomField = new javax.swing.JTextField();
        dignosisField = new javax.swing.JTextField();
        medicinesField = new javax.swing.JTextField();
        typeOfWardLabel = new javax.swing.JLabel();
        wardReqField = new javax.swing.JCheckBox();
        wardReqLabel = new javax.swing.JLabel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        idDoesnotExistLabel = new javax.swing.JLabel();
        typesOfWardField = new javax.swing.JComboBox<>();
        dignosisBackground = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(350, 200));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Patient ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 35, -1, 34));

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Symptom");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 247, -1, -1));

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 102, 102));
        jLabel3.setText("Dignosis");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 309, -1, -1));

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Medicines");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 362, -1, -1));

        saveButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });
        getContentPane().add(saveButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 437, -1, -1));

        closeButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        closeButton.setText("Close");
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(closeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 437, -1, -1));

        searchField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        getContentPane().add(searchField, new org.netbeans.lib.awtextra.AbsoluteConstraints(271, 39, 261, -1));

        symptomField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        getContentPane().add(symptomField, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 244, 155, -1));

        dignosisField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        getContentPane().add(dignosisField, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 306, 155, -1));

        medicinesField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        getContentPane().add(medicinesField, new org.netbeans.lib.awtextra.AbsoluteConstraints(187, 359, 155, -1));

        typeOfWardLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        typeOfWardLabel.setForeground(new java.awt.Color(102, 102, 102));
        typeOfWardLabel.setText("Types Of Ward");
        getContentPane().add(typeOfWardLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(427, 309, -1, -1));

        wardReqField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        wardReqField.setText("Yes");
        wardReqField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wardReqFieldActionPerformed(evt);
            }
        });
        getContentPane().add(wardReqField, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, -1, -1));

        wardReqLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        wardReqLabel.setForeground(new java.awt.Color(102, 102, 102));
        wardReqLabel.setText("Ward Requried ");
        getContentPane().add(wardReqLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(423, 247, -1, -1));

        searchButton.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        getContentPane().add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 37, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 126, 750, 65));

        idDoesnotExistLabel.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        idDoesnotExistLabel.setForeground(new java.awt.Color(255, 0, 51));
        idDoesnotExistLabel.setText("Patient ID Does Not Exist");
        getContentPane().add(idDoesnotExistLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        typesOfWardField.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        typesOfWardField.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL WARD", "SEMI-SPECIAL ROOM", "SPECIAL WARDS", "DELUXE ROOM", "CAUSALITY", "BURN WARD", "CCU", "ICCU", "SICU", "NICU", "PICU" }));
        getContentPane().add(typesOfWardField, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 305, -1, -1));
        getContentPane().add(dignosisBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 50, 30, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/diagnosis.jpg"))); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 830, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void wardReqFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wardReqFieldActionPerformed
        // TODO add your handling code here:
        if(wardReqField.isSelected())
        {
             typeOfWardLabel.setVisible(true);
            typesOfWardField.setVisible(true);
            
        }
        else
        {
                 typeOfWardLabel.setVisible(false);
                 typesOfWardField.setVisible(false);
                
         }
    }//GEN-LAST:event_wardReqFieldActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        // TODO add your handling code here:
        String patientID = searchField.getText();
         try
         {
             Connection con =ConnectionProvider.getCon();
             Statement st =con.createStatement();
             ResultSet re =st.executeQuery("select *from patient where patientID ='"+patientID+"'");
             jTable1.setModel(DbUtils.resultSetToTableModel(re));
             if(re.next())
                 idDoesnotExistLabel.setVisible(true);
             else
             {
                       idDoesnotExistLabel.setVisible(false);
                       searchField.setEditable(false);
                       flag =1;
         
                       
             }
         }
         catch(Exception e)
         {
               JOptionPane.showMessageDialog(null,"Connection Error") ;     
           }
         
         
                 
    }//GEN-LAST:event_searchButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
          if(flag==1)
         {
                     String patientID =searchField.getText();
                     String Symptom = symptomField.getText();
                     String Dignosis =  dignosisField.getText();
                     String  Medicines = medicinesField.getText();
                     String  wardReq;
                     String  typeward;
                     if(wardReqField.isSelected())
                    {
                               wardReq ="Yes";
                               typeward=(String)typesOfWardField.getSelectedItem();

                     }
                    else
                    {
                        
                              wardReq="No";
                               typeward="";
                     }    
                     try
                    {
                                                  Connection con =ConnectionProvider.getCon();
                                                  Statement st =con.createStatement();   
                                                  st.executeUpdate("insert into patientreport values('"+patientID+"','"+Symptom+"','"+Dignosis+"','"+Medicines+"','"+wardReq+"','"+typeward+"')");
                                                  JOptionPane.showMessageDialog(null,"Successfully Sumbitted");
                                                   setVisible(false);
                                                  new addDignosis().setVisible(true);
                     }
                     catch(Exception e)
                     {
                          JOptionPane.showMessageDialog(this,e);
                      }
         } //if
         else
         {
              
                                 JOptionPane.showMessageDialog(null,"PatientID Field is Empty");
          }
  
    }//GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(addDignosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addDignosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addDignosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addDignosis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addDignosis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel dignosisBackground;
    private javax.swing.JTextField dignosisField;
    private javax.swing.JLabel idDoesnotExistLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField medicinesField;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JTextField symptomField;
    private javax.swing.JLabel typeOfWardLabel;
    private javax.swing.JComboBox<String> typesOfWardField;
    private javax.swing.JCheckBox wardReqField;
    private javax.swing.JLabel wardReqLabel;
    // End of variables declaration//GEN-END:variables
}