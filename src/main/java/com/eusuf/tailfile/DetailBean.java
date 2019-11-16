/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eusuf.tailfile;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author eusuf.kanchwala
 */
@Getter
@Setter
@ToString
public class DetailBean {
    String hostName;
    String userName;
    String location;
    String fileName;
    int noOfLines;
    String password;
}
