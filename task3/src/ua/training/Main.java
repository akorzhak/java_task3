/*
 * Main
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

public class Main {
    public static void main(String[] args) {
        // Initialization
        Model model = new Model();
        View view = new View();
        Person person = new Person();
        Address address = new Address();
        Controller controller = new Controller(model, view, person, address);
        //Run
        controller.processUser();
    }
}
