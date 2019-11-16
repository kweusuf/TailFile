/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eusuf.tailfile;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author eusuf.kanchwala
 */
public class RunTail {
    public static void startTail(DetailBean details){
        String OSType = checkOSType();
        
        String tailfCmd = "ssh " + details.userName + "@" + details.hostName + " tailf -" + details.noOfLines + " " + details.location + "/" + details.fileName;

        ProcessBuilder processBuilder = new ProcessBuilder();
        
        if("Windows".equalsIgnoreCase(OSType)){
            processBuilder.command("cmd.exe", "/c", tailfCmd);
        }else if("Linux".equalsIgnoreCase(OSType)){
            
        }else{
            
        }
        
        try{
            Process process = processBuilder.start();

            BufferedReader reader =
                    new BufferedReader(new InputStreamReader(process.getInputStream()));

            String line;
            while ((line = reader.readLine()) != null) {
//                MainScreen.O
//                OutputTA.append(line);
                System.out.println(line);
            }

            int exitCode = process.waitFor();
            System.out.println("\nExited with error code : " + exitCode);

        }catch (IOException e) {
                e.printStackTrace();
        } catch (InterruptedException e) {
                e.printStackTrace();
        }
    }
    
    private static String checkOSType() {
        String OSType = System.getProperty("os.name");
        if(OSType.startsWith("Win")){
            OSType = "Windows";
        }else{
            OSType = "Linux";
        }
        return OSType;
    }
}
