package src.EncapsulationExercises.FootballTeamGenerator;

public class Validate {

    public static void validateName(String name){
        if (name==null || name.trim().isEmpty()){
            throw new IllegalArgumentException("A name should not be empty.");
        }
    }

   public static void validateStats(String name,int number){
       if (number<0 || number>100){
           throw new IllegalArgumentException(name+" should be between 0 and 100.");
       }
   }




}
