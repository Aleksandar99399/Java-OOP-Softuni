package src.ExceptionAndHandlingLab;

public class Main {
    public static void main(String[] args) {

        String word="asdf";

        try {
            int i = Integer.parseInt(word);
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
