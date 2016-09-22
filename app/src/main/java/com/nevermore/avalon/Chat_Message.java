package com.nevermore.avalon;

public class Chat_Message
{
    public Chat_Message(String sender,String message)
    {
        this.message=message;
        this.sender=sender;
    }

    private String sender;
    private String message;

    public String Print()
    {
        return sender+": "+message;
    }

}
