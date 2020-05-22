package src.ExceptionAndHandlingLab.CustomException;

import java.util.Date;

public class PersonCreationException extends Exception{

    private Date dateOfAttempt;
    public PersonCreationException(String message){
        super(message);
        this.dateOfAttempt=new Date();
    }

    @Override
    public String getMessage() {
        return super.getMessage()+ " "+ this.dateOfAttempt.toString();
    }
}
