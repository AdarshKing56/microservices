package com.Spring.User.Service.UserService.exception;

public class ResourseNotFoundException extends RuntimeException{

    public ResourseNotFoundException(){
        super("Resource not found on server!!");
    }
    public ResourseNotFoundException(String message){
        super(message);
    }
}
