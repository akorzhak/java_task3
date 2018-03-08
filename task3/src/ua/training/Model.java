/*
 * Model
 *
 * Description: This source file is a part of Java game program,
 * that generates a random integer. Then prompts a user to guess
 * the value by giving certain hints and guides.
 * 
 * By: Alyona Korzhakova 
 *
 * Created: 2018/03/01
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
