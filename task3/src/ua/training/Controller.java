/*
 * Controller
 *
 * Description: This source file is a part of Java game progroupsam,
 * that generates a random integer. Then prompts a user to guess
 * the value by giving certain hints and guides.
 * 
 * By: Alyona Korzhakova 
 *
 * Created: 2018/03/01
 * 
 * Updated: 2018/03/06
 */
package ua.training;

import java.util.Scanner;
import java.time.LocalDate;

public class Controller {
    private Model model;
    private View view;
    private Person person;
    private Address address;
    private int retry;

    //Constructor
    public Controller(Model model, View view, Person person, Address address) {
        this.model = model;
        this.view = view;
        this.person = person;
        this.address = address;
    }

    //Work method
    public void processUser() {

        Scanner sc = new Scanner(System.in);

        inputLastName(sc);
        inputFirstName(sc);
        inputSecondName(sc);
        inputShortName(sc);
        inputNickname(sc);
        inputComment(sc);
        inputGroups(sc);
        inputHomePhoneNumber(sc);
        inputMobilePhoneNumber(sc);
        inputMobilePhoneNumber2(sc);
        inputEmail(sc);
        inputSkype(sc);
        view.printMessage(View.ADDRESS);
        inputIndex(sc);
        inputCity(sc);
        inputStreet(sc);
        inputNumberHouse(sc);
        inputNumberFlat(sc);
        composeAddress();
        composeFullAddress();
        inputCreationDate(sc);
        setChangeDate();
        addPersonToDataBase();
    }

    private void inputLastName(Scanner sc) {

        view.printMessage(View.LAST_NAME);
        person.setLastName(sc.nextLine());
        while (!person.getLastName().matches("^[A-Z]{1}[a-z]+")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.LAST_NAME);
            person.setLastName(sc.nextLine());
        }
    }

    private void inputFirstName(Scanner sc) {

        view.printMessage(View.FIRST_NAME);
        person.setFirstName(sc.nextLine());
        while (!person.getFirstName().matches("^[A-Z]{1}[a-z]+")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.FIRST_NAME);
            person.setFirstName(sc.nextLine());
        }
    }

    private void inputSecondName(Scanner sc) {

        view.printMessage(View.SECOND_NAME);
        person.setSecondName(sc.nextLine());
        while (!person.getSecondName().matches("^[A-Z]{1}[a-z]+")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.SECOND_NAME);
            person.setSecondName(sc.nextLine());
        }
    }

    private void inputShortName(Scanner sc) {

        view.printMessage(View.SHORT_NAME);
        person.setShortName(sc.nextLine());
        while (!person.getShortName().matches("^[A-Z]{1}[a-z]+\\s[A-Z]{1}\\.")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.SHORT_NAME);
            person.setShortName(sc.nextLine());
        }
    }

    private void inputNickname(Scanner sc) {

        view.printMessage(View.NICKNAME);
        person.setNickname(sc.nextLine());
        while (!person.getNickname().matches("^[^\\d_][a-z\\d_]{4,10}")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.NICKNAME);
            person.setNickname(sc.nextLine());
        }
    }

    private void inputComment(Scanner sc) {

        view.printMessage(View.COMMENT);
        person.setComment(sc.nextLine());
        while (!person.getComment().matches(".*")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.COMMENT);
            person.setComment(sc.nextLine());
        }
    }

    private void inputGroups(Scanner sc) {

        view.printMessage(View.GROUPS);
        String groups = sc.nextLine();
        while (! groups.matches("[1-4]+")) {

            view.printMessage(View.WRONG_INPUT_DATA + View.GROUPS);
            groups = sc.nextLine();
        }
        if (groups.matches(".*1.*")) {
            person.setGroups(Groups.GROUP1);
        }
        if (groups.matches(".*2.*")) {
            person.setGroups(Groups.GROUP2);
        }
        if (groups.matches(".*3.*")) {
            person.setGroups(Groups.GROUP3);
        }
        if (groups.matches(".*4.*")) {
            person.setGroups(Groups.GROUP4);
        }
    }

    private void inputHomePhoneNumber(Scanner sc) {

        view.printMessage(View.HOME_PHONE_NUMBER);
        person.setHomePhoneNumber(sc.nextLine());
        while (!person.getHomePhoneNumber().matches("\\d{8}|-")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.HOME_PHONE_NUMBER);
            person.setHomePhoneNumber(sc.nextLine());
        }
    }

    private void inputMobilePhoneNumber(Scanner sc) {

        view.printMessage(View.MOBILE_PHONE_NUMBER);
        person.setMobilePhoneNumber(sc.nextLine());
        while (!person.getMobilePhoneNumber().matches("^[+]{1}[\\d]{12}")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.MOBILE_PHONE_NUMBER);
            person.setMobilePhoneNumber(sc.nextLine());
        }
    }

    private void inputMobilePhoneNumber2(Scanner sc) {

        view.printMessage(View.MOBILE_PHONE_NUMBER2);
        person.setMobilePhoneNumber2(sc.nextLine());
        while (!person.getMobilePhoneNumber2().matches("(^[+]{1}[\\d]{12})|-")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.MOBILE_PHONE_NUMBER2);
            person.setMobilePhoneNumber2(sc.nextLine());
        }
    }

    private void inputEmail(Scanner sc) {

        view.printMessage(View.EMAIL);
        person.setEmail(sc.nextLine());
        while (!person.getEmail().matches("^[\\w-_.+]*[\\w-_.]" +
                "@([\\w]+.)+[\\w]+[\\w]$")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.EMAIL);
            person.setEmail(sc.nextLine());
        }
    }

    private void inputSkype(Scanner sc) {

        view.printMessage(View.SKYPE);
        person.setSkype(sc.nextLine());
        while (!person.getSkype().matches( "^[a-zA-Z][a-zA-Z0-9.,-_]{5,31}")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.SKYPE);
            person.setSkype(sc.nextLine());
        }
    }

    private void inputIndex(Scanner sc) {

        view.printMessage(View.INDEX);
        address.setIndex(sc.nextLine());
        while (!address.getIndex().matches( "[0-9]{5}")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.INDEX);
            address.setIndex(sc.nextLine());
        }
    }

    private void inputCity(Scanner sc) {

        view.printMessage(View.CITY);
        address.setCity(sc.nextLine());
        while (!address.getCity().matches( "^[A-Z]{1}[a-z]+")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.CITY);
            address.setCity(sc.nextLine());
        }
    }

    private void inputStreet(Scanner sc) {

        view.printMessage(View.STREET);
        address.setStreet(sc.nextLine());
        while (!address.getStreet().matches( "^[A-Z]{1}[a-z]+")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.STREET);
            address.setStreet(sc.nextLine());
        }
    }

    private void inputNumberHouse(Scanner sc) {

        view.printMessage(View.NUMBER_HOUSE);
        address.setNumberHouse(sc.nextLine());
        while (!address.getNumberHouse().matches( "[0-9]+|-")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.NUMBER_HOUSE);
            address.setNumberHouse(sc.nextLine());
        }
    }

    private void inputNumberFlat(Scanner sc) {

        view.printMessage(View.NUMBER_FLAT);
        address.setNumberFlat(sc.nextLine());
        while (!address.getNumberFlat().matches( "[0-9]+|-")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.NUMBER_FLAT);
            address.setNumberFlat(sc.nextLine());
        }
    }

    private void composeAddress() {
        person.setAddress(address);
    }

    private void composeFullAddress() {
        person.setFullAddress("index: " + address.getIndex() + "\ncity: " 
                + address.getCity() + "\nstreet: " + address.getStreet()
                + "\nhouse number: " + address.getNumberHouse()
                + "\nflat number: " + address.getNumberFlat());
        view.printMessage("Your address:\n" + person.getFullAddress());
    }

    private void inputCreationDate(Scanner sc) {

        view.printMessage(View.CREATED);
        person.setCreated(sc.nextLine());
        while (!person.getCreated().matches( "20[0-9]{2}-[01]{1}[0-9]"
                                           + "{1}-[0-3]{1}[0-9]{1}")) {
            view.printMessage(View.WRONG_INPUT_DATA);
            view.printMessage(View.CREATED);
            person.setCreated(sc.nextLine());
        }
    }

    private void setChangeDate() {

        person.setUpdated(LocalDate.now());
        view.printMessage(View.UPDATED + person.getUpdated());
    }

    private void addPersonToDataBase() {

        model.setDataBase(person);
        view.printMessage(View.DATA_BASE);
    }
}
