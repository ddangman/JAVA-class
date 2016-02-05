
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Dang
 */
public class Phonebook {

    private ArrayList<Person> pbook = new ArrayList<Person>();

    public Phonebook() {
    
    }

    public void add(String name, String number) {
        pbook.add(new Person(name, number));
    }
    
    public void printAll(){
        for (Person each : pbook) {
            System.out.println(each);
        }
    }
    
    public String searchNumber(String name){
        for (Person each : pbook) {
            if (each.getName()==name) {
            return each.getNumber();
            }
        }   
        return "number not known";
    }

}
