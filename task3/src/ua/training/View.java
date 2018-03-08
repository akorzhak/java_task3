/*
 * View
 *
 * Description: This source file is a part of Java program,
 * that records data input from the command line.
 * 
 * By: Alyona Korzhakova 
 *
 * Created: 2018/03/05
 * 
 * Updated: 2018/03/08
 */
package ua.training;

import java.util.ArrayList;

public class View {

    public static final String LAST_NAME = "Input your LAST name =";
    public static final String FIRST_NAME = "Input your FIRST name =";
    public static final String GROUPS = "Specify the groups you belong to.\n"
            + "Type the corresponding numbers WITHOUT any delimeters:\n"
            + "1 - Group1\n2 - Group2\n3 - Group3\n4 - Group4";
    public static final String NICKNAME = "Input your NICKNAME\nNOTE: must begin"
            + " with a letter and contain 4 - 10 symbols";
    public static final String SECOND_NAME = "Input your SECOND name = ";   
    public static final String SHORT_NAME = "Input your SHORT name\n" +
            + "NOTE: should contain your LAST name and the first letter "
            + "of the FIRST one\nE.G. Lastname F.";
    public static final String WRONG_INPUT_DATA = "WRONG input! Repeat please!\n";
    public static final String COMMENT = "Write a short comment UP to 30 symbols = ";
    public static final String ABSENT = "NOTE: input '-' in case you do NOT have one";
    public static final String HOME_PHONE_NUMBER = "Input your HOME phone number\n"
            + ABSENT;
    public static final String MOBILE_PHONE_NUMBER = "Input your MOBILE "
            + "phone number\nE.G. +380971234567";
    public static final String MOBILE_PHONE_NUMBER2 = "Input your 2nd MOBILE "
            + "phone number\n" + ABSENT;
    public static final String EMAIL = "Input your EMAIL = ";
    public static final String SKYPE = "Input your SKYPE = ";
    public static final String ADDRESS = "Input your ADDRESS\n";
    public static final String INDEX = "Input your INDEX\nNOTE: must be of 5 digits";
    public static final String CITY = "Input your CITY = ";
    public static final String STREET = "Input your STREET = ";
    public static final String NUMBER_HOUSE = "Input your HOUSE number\n" + ABSENT;
    public static final String NUMBER_FLAT = "Input your FLAT number\n" + ABSENT;
    public static final String CREATED = "\nInput TODAY'S date\nE.G. yyyy-mm-dd";
    public static final String UPDATED = "The last UPDATE = ";
    public static final String DATA_BASE = "Your data has been successfully "
            + "recorded.\nThank you.";
    public void printMessage(String message) {
        System.out.println(message);
    }
}
