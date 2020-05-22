package src.DesignPatternsLab.BulderPattern;

public class Address {

    // BUILDER желателно да използваме за клас с
    //  над 5 полета от един и същи тип
    private final String country;
    private final String city ;

    private Address(String country, String city) {
        this.country = country;
        this.city = city;
    }

    public static Address.Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private String country;
        private String city ;

        public Builder withCountry(String country){
            this.country=country;
            return this;
        }
       public Builder withCity(String city){
            this.city=city;
            return this;
        }
        public Address build(){
            return new Address(this.country,this.city);
        }
    }
}
