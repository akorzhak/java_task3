/*
 * Model
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

public class Model {

    ArrayList<Person> dataBase = new ArrayList<Person>();

    public void setDataBase(Person person) {
        dataBase.add(person);
    }

    public ArrayList<Person> getDataBase() {
        return dataBase;
    }
}
