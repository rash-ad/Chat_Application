/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.chatapplication;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */

 class ChatController   {
     
    private ArrayList<ChatMessage>chatArrayList=new ArrayList<>();
    private ChatMessage sender;
    
    
    public void addChatMessage(ChatMessage chatMessage){
        chatArrayList.add(chatMessage);
    }
    public void removeMessage(ChatMessage chatMessage){
        chatArrayList.remove(chatMessage);
    }

    
    public void sendMessage(String message,ChatMessage sender ){
        
        }
          
  
             
    }

        
   
    

