package src.ExceptionAndHandlingLab.PersonPackage;

import src.ExceptionAndHandlingLab.CustomException.PersonCreationException;

public class Main {
    public static void main(String[] args) {

        try {
            Peron peron=new Peron("", "Baneva", 7);
        }catch (PersonCreationException ex){
            System.out.println(ex.getMessage());
        }
    }
}
