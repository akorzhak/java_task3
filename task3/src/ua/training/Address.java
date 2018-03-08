/*
 * Address
 *
 * Description: This source file is a part of Java game program,
 * that generates a random integer. Then prompts a user to guess
 * the value by giving certain hints and guides.
 * 
 * By: Alyona Korzhakova 
 *
 * Created: 2018/03/07
 * 
 * Updated: 2018/03/07
 */
package ua.training;

public class Address {
    
    private String index;
    private String city;
    private String street;
    private String numberHouse;
    private String numberFlat;

    public void setIndex(String index) {
        this.index = index;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setNumberHouse(String numberHouse) {
        this.numberHouse = numberHouse;
    }

    public void setNumberFlat(String numberFlat) {
        this.numberFlat = numberFlat;
    }

    public String getIndex() {
        return index;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getNumberHouse() {
        return numberHouse;
    }

    public String getNumberFlat() {
        return numberFlat;
    }
}
