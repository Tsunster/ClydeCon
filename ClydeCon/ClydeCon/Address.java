package ClydeCon;

public class Address {
    private String house;
    private String street;
    private String city;
    private String postcode;

    public Address() {
    }

    public Address(String house, String street, String city, String postcode) throws InputVal {
        setHouse(house);
        setStreet(street);
        setCity(city);
        setPostcode(postcode);
    }

    public String getHouse() {
        return house;
    }


public void setHouse(String house) throws InputVal{
        if (house.matches("(\\p{Digit}){1,2}")) {
        this.house = house;
        }
        else {
        throw new InputVal("Invalid house number");
        }
        }

public String getStreet() {
        return street;
        }

public void setStreet(String street) throws InputVal {
        if (street.matches("\\{Upper}(\\p{Lower}){2,10}(\\{Upper}(\\p{Lower}){2,10}){0,1}")) {
        this.street = street;
        }
        else {
        throw new InputVal("Invalid street");
        }
        }

public String getCity() {
        return city;
        }

public void setCity(String city) throws InputVal {
        if (city.matches("\\{Upper}(\\p{Lower}){2,10}")) {
        this.city = city;
        }
        else {
        throw new InputVal("Invalid city");
        }
        }

public String getPostcode() {
        return postcode;
        }

public void setPostcode(String postcode) throws InputVal {
        if (postcode.matches("(\\p{Upper}){1,2}(\\p{Digit}){1,2}\\p{Space}(\\p{Digit}){1,2}(\\p{Upper}){1,2}")) {
        this.postcode = postcode;
        }
        else {
        throw new InputVal("Invalid postcode");
        }
        }
        }

