package day47_constructors;

public class Address {
    private String street;
    private String city;
    private String state;
    private String zipCode;
    private String country = "USA";

//    public Address() {
////        System.out.println("Address constructor");
////        street = "UNKNOWN";
////        city = "UNKNOWN";
////        state = "UNKNOWN";
////        zipCode = "UNKNOWN";
//    }
    public Address(String street, String city, String state, String zipCode){
        setStreet(street);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
        //using the setters allows the conditions in the setter methods to be initialized - if using this.street = street, you cant set any conditions
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(street.isEmpty()){
            System.out.println("Invalid entry");
        }else{
            this.street = street;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Address{" +
                street + ", "
                + city + ", "
                + state + " "
                + zipCode +
                '}';
    }
}
