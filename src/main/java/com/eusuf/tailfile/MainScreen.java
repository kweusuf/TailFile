/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eusuf.tailfile;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author eusuf.kanchwala
 */
public class MainScreen extends javax.swing.JFrame {

    Thread t;

    String status;

    DetailBean details;
    
    boolean follow = false;

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        HostIPTF = new javax.swing.JTextField();
        UserNameTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        LocationTF = new javax.swing.JTextField();
        FileNameTF = new javax.swing.JTextField();
        StartTailBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        noOfLinesTF = new javax.swing.JTextField();
        StopTailBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        PasswordTF = new javax.swing.JPasswordField();
        ClearBtn = new javax.swing.JButton();
        FollowCB = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OutputTA = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Host IP");

        jLabel2.setText("User Name");

        HostIPTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HostIPTFActionPerformed(evt);
            }
        });

        jLabel3.setText("Location");

        jLabel4.setText("File Name");

        LocationTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LocationTFActionPerformed(evt);
            }
        });

        StartTailBtn.setText("Start Tail!");
        StartTailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartStartTailBtnActionPerformed(evt);
            }
        });

        jLabel5.setText("Number of Lines");

        noOfLinesTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noOfLinesTFActionPerformed(evt);
            }
        });

        StopTailBtn.setText("Stop Tail!");
        StopTailBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StopTailBtnActionPerformed(evt);
            }
        });

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        jLabel6.setText("Password");

        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        FollowCB.setText("Follow");
        FollowCB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FollowCBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(UserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)
                        .addGap(32, 32, 32)
                        .addComponent(PasswordTF, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE))
                    .addComponent(FileNameTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(HostIPTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LocationTF, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(noOfLinesTF))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(StartTailBtn)
                .addGap(80, 80, 80)
                .addComponent(FollowCB)
                .addGap(80, 80, 80)
                .addComponent(StopTailBtn)
                .addGap(80, 80, 80)
                .addComponent(ClearBtn)
                .addGap(80, 80, 80)
                .addComponent(ExitBtn)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(HostIPTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(UserNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(PasswordTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LocationTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(FileNameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(noOfLinesTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(StartTailBtn)
                    .addComponent(StopTailBtn)
                    .addComponent(ExitBtn)
                    .addComponent(ClearBtn)
                    .addComponent(FollowCB))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        OutputTA.setEditable(false);
        OutputTA.setColumns(20);
        OutputTA.setRows(5);
        jScrollPane1.setViewportView(OutputTA);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HostIPTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HostIPTFActionPerformed

    }//GEN-LAST:event_HostIPTFActionPerformed

    private void LocationTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LocationTFActionPerformed

    }//GEN-LAST:event_LocationTFActionPerformed

    private void StartStartTailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartStartTailBtnActionPerformed
        status = "start";
        
        if (t == null || !t.isAlive()) {
            DetailBean details = populateDetailsBean();
            System.out.println(details.toString());
            t = new Thread(() -> {
                if ((details.hostName.equalsIgnoreCase("localhost") && details.password.isEmpty())) {
                    startTail(details);
                } else if(details.password.isEmpty()){
                    startTail(details);
                } else {
                    startJschTail(details);
                }
            });
            t.start();
        }
    }//GEN-LAST:event_StartStartTailBtnActionPerformed

    @Deprecated
    private static String checkOSType() {
        String OSType = System.getProperty("os.name");
        if (OSType.startsWith("Win")) {
            OSType = "Windows";
        } else {
            OSType = "Linux";
        }
        return OSType;
    }

    @Deprecated
    public void startTail(DetailBean details) {
        String OSType = checkOSType();

        String sshCmd = "ssh " + details.userName + "@" + details.hostName;
        String tailfCmd = " tail -" + details.noOfLines + "f" + " " + details.location;

        if (!details.fileName.isEmpty()) {
            tailfCmd = tailfCmd + "/" + details.fileName;
        }

        if (!details.userName.isEmpty() && !details.hostName.isEmpty()) {
            tailfCmd = sshCmd + tailfCmd;
        }

        ProcessBuilder processBuilder = new ProcessBuilder();
        if ("Windows".equalsIgnoreCase(OSType)) {
            processBuilder.command("cmd.exe", "/c", tailfCmd);
        } else if ("Linux".equalsIgnoreCase(OSType)) {
            processBuilder.command("bash", "-c", tailfCmd);
        } else {

        }
        //TODO: Handle file not found exception with a PopUp
        try {
            Process process = processBuilder.start();

            BufferedReader reader
                    = new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
                OutputTA.append(line + "\n");
                setCaretPosition();
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

            if (exitCode == 1) {
                OutputTA.append("File not Found!\n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void setCaretPosition() {
        if(follow == true){
            OutputTA.setCaretPosition(OutputTA.getDocument().getLength());
        }
    }

    private DetailBean populateDetailsBean() {

        details = new DetailBean();

        details.hostName = HostIPTF.getText().equalsIgnoreCase("") ? "localhost" : HostIPTF.getText();
        details.userName = UserNameTF.getText();
        details.location = LocationTF.getText();
        details.fileName = FileNameTF.getText();
        details.noOfLines = Integer.parseInt(noOfLinesTF.getText().equalsIgnoreCase("") ? "0" : noOfLinesTF.getText());
        details.password = new String(PasswordTF.getPassword());

        return details;
    }

    private void noOfLinesTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noOfLinesTFActionPerformed

    }//GEN-LAST:event_noOfLinesTFActionPerformed

    private void StopTailBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StopTailBtnActionPerformed
        status = "stop";
        if (details.hostName.equalsIgnoreCase("localhost") && details.password.isEmpty()) {
            t.stop();
        }
    }//GEN-LAST:event_StopTailBtnActionPerformed

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        OutputTA.setText("");
    }//GEN-LAST:event_ClearBtnActionPerformed

    private void FollowCBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FollowCBActionPerformed
        follow = FollowCB.isSelected();
    }//GEN-LAST:event_FollowCBActionPerformed

    private void startJschTail(DetailBean details) {
        try {

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session = jsch.getSession(details.userName, details.hostName, 22);
            session.setPassword(details.password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");
            Channel channel = session.openChannel("exec");

            String inputCmd = "tail -" + details.noOfLines + "f " + details.location;

            if (!details.fileName.isEmpty()) {
                inputCmd = inputCmd + "/" + details.fileName;
            }

            final String cmd = inputCmd;
            processCommandExecution(session, channel, cmd);
        } catch (JSchException e) {
            e.printStackTrace();
        }
    }

    private void processCommandExecution(Session session, Channel channel, String command1) {

        try {
            System.out.println(command1);
            ((ChannelExec) channel).setCommand(command1);
            channel.setInputStream(null);
            ((ChannelExec) channel).setErrStream(System.err);

            InputStream in = channel.getInputStream();
            channel.connect();
            byte[] tmp = new byte[1024];
            while (true) {
                while (in.available() > 0 && !"stop".equalsIgnoreCase(status)) {
                    int i = in.read(tmp, 0, 1024);
                    if (i < 0) {
                        break;
                    }
                    OutputTA.append(new String(tmp, 0, i));
                    setCaretPosition();
                }
                if (channel.isClosed()) {
                    System.out.println("exit-status: " + channel.getExitStatus());
                    break;
                }
                if ("stop".equalsIgnoreCase(status)) {
                    System.out.println("exit-status: 0");
                    break;
                }
            }
            channel.disconnect();
            session.disconnect();
            System.out.println("DONE");
            t.stop();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JTextField FileNameTF;
    private javax.swing.JCheckBox FollowCB;
    private javax.swing.JTextField HostIPTF;
    private javax.swing.JTextField LocationTF;
    private javax.swing.JTextArea OutputTA;
    private javax.swing.JPasswordField PasswordTF;
    private javax.swing.JButton StartTailBtn;
    private javax.swing.JButton StopTailBtn;
    private javax.swing.JTextField UserNameTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField noOfLinesTF;
    // End of variables declaration//GEN-END:variables

}
