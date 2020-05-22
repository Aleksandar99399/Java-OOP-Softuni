package src.InheritanceExercises.Animals;

public abstract class Animal implements ProduceSound {
    private String name;
    private int age;
    private  String gender;

    public Animal(String name, int age, String gender){
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        validateString(name);
        this.name=name;
    }

    private void validateString(String name) {
        validateParam(name.trim());
    }

    private void validateParam(String name) {
        if (name==null || name.trim().isEmpty()) {
            throw new IllegalStateException("Invalid input!");
        }
    }

    public void setAge(int age) {
        if (age<0) {
            throw new IllegalStateException("Invalid input!");
        }
        this.age = age;
    }

    public void setGender(String gender) {
        validateParam(gender);
        this.gender =gender;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",this.getClass().getSimpleName()
                ,this.name,this.age,this.gender,this.produceSound());
    }


    public abstract String produceSound();
}
