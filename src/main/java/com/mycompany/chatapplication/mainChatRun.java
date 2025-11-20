/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.chatapplication;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */

public class mainChatRun {
    public static void main(String[] args) {
        
          ChatController  chatController= new ChatController();
    
        
           chatController.addChatMessage(new ChatMessage(chatController,"Rashad"));
    
        
         }
}
