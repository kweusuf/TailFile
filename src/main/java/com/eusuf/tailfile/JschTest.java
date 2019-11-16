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
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author eusuf
 */
public class JschTest {
    
    static Thread t;

    public static void main(String[] args) {
        String host = "192.168.43.99";
        String user = "eusuf";
        String password = "unix";
        String inputCmd = "tail -500f /home/eusuf/test";
        try {

            java.util.Properties config = new java.util.Properties();
            config.put("StrictHostKeyChecking", "no");
            JSch jsch = new JSch();
            Session session = jsch.getSession(user, host, 22);
            session.setPassword(password);
            session.setConfig(config);
            session.connect();
            System.out.println("Connected");
            Channel channel = session.openChannel("exec");
            
            String status = "";
            
            t = new Thread(() -> {
                try {
                    processCommandExecution(channel, inputCmd);
                } catch (IOException ex) {
                    Logger.getLogger(JschTest.class.getName()).log(Level.SEVERE, null, ex);
                } catch (JSchException ex) {
                    Logger.getLogger(JschTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            });
            while (!"stop".equalsIgnoreCase(status)){
                
            }
            channel.disconnect();
            session.disconnect();
            t.stop();
            System.out.println("DONE");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processCommandExecution(Channel channel, String command1) throws IOException, JSchException {
        ((ChannelExec) channel).setCommand(command1);
        channel.setInputStream(null);
        ((ChannelExec) channel).setErrStream(System.err);
        
        InputStream in = channel.getInputStream();
        channel.connect();
        byte[] tmp = new byte[1024];
        while (true) {
            while (in.available() > 0) {
                int i = in.read(tmp, 0, 1024);
                if (i < 0) {
                    break;
                }
                System.out.print(new String(tmp, 0, i));
            }
            if (channel.isClosed()) {
                System.out.println("exit-status: " + channel.getExitStatus());
                break;
            }
        }
    }
}
