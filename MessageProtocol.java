/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ChatAssignment;

/**
 *
 * @author YaronK
 */
public class MessageProtocol {
    final static int textMessage = 0, whoIsInMessage=1, disconnectMessage=2; 
    String message;
    int typeOfMessage;

    public MessageProtocol(String message, int typeOfMessage) {
        this.message = message;
        this.typeOfMessage = typeOfMessage;
    }

    public static int getTextMessage() {
        return textMessage;
    }

    public int getTypeOfMessage() {
        return typeOfMessage;
    }
    
    
    
    
    
    
}
