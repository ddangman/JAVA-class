/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Dang
 */
public class Service {

    Map<String, Person> namePerson = new HashMap<String, Person>();
    Map<String, Person> numberPerson = new HashMap<String, Person>();
    Map<String, Person> addressPerson = new HashMap<String, Person>();

    public void checkExistingPersonAndAdd(String name) {
        if (!namePerson.containsKey(name)) {
            namePerson.put(name, new Person(name));
        }
    }

    public boolean checkPerson(String name) {
        if (namePerson.containsKey(name)) {
            return true;
        }
        return false;
    }

    public boolean checkNumber(String name) {
        if (namePerson.containsKey(name)) {
            return true;
        }
        return false;
    }

    public Person returnPerson(String name) {
        if (checkPerson(name)) {
            return namePerson.get(name);
        }
        return new Person(name);
    }

    public void addNumber(String name, String number) {
        checkExistingPersonAndAdd(name);
        namePerson.get(name).addNumber(number);
        numberPerson.put(number, namePerson.get(name));
    }

    public Set<String> searchNumberByName(String name) {
        if (checkPerson(name)) {
            return namePerson.get(name).getNumbers();
        }
        return null;
    }

    public String findNameByNumber(String number) {
        if (!numberPerson.containsKey(number)) {
            return "not found";
        }
        return numberPerson.get(number).getName();
    }

    public void addAdress(String name, String address, String city) {
        checkExistingPersonAndAdd(name);
        namePerson.get(name).addAddress(address, city);
        String addressToLower = address.toLowerCase() + city.toLowerCase();
        addressPerson.put(addressToLower, namePerson.get(name));
    }

    public String findAddress(String name) {
        if (!checkPerson(name)) {
            return null;
        }
        String returnAddress = namePerson.get(name).getAddress();
        return returnAddress;
    }

    public void deletePerson(String name) {
        if (checkPerson(name)) {
            Set<String> allNumbers = searchNumberByName(name);
            for (String each : allNumbers) {
                numberPerson.remove(each);
            }
            namePerson.get(name).addAddress("", "");
            numberPerson.remove(name);
            namePerson.remove(name);
        }
    }

    public void keywordListBuilder(String keyword) {
        if (keyword.isEmpty()) {
            System.out.println(" keyword not found");
        }
        Set<Person> matchesKeyword = new TreeSet<Person>();
        String cleanKeyword = keyword.toLowerCase().trim();
        for (String each : namePerson.keySet()) {
            if (each.toLowerCase().trim().contains(cleanKeyword)) {
                matchesKeyword.add(returnPerson(each));
            }
        }
        for (String each : addressPerson.keySet()) {
            
            if (each.contains(cleanKeyword)) {
                matchesKeyword.add(addressPerson.get(each));
            }
        }
        if (matchesKeyword.isEmpty()) {
            System.out.println(" keyword not found");
        }
        printKeywords(matchesKeyword);
    }

    public void printKeywords(Set<Person> toPrint) {
        for (Person each : toPrint) {
            System.out.println(" " + each.getName());
            printAddress(each);
            printNumber(each);
        }
    }

    public void printAddress(Person person) {

        if (!person.addressCheck()) {
            System.out.println("address unknown");
        } else {
            System.out.print("  address: ");
            System.out.println(person.getAddress());
        }

    }

    public void printNumber(Person person) {
        if (person.getNumbers().isEmpty()) {
            System.out.println("  phone number not found");
        } else {
            System.out.println("  phone numbers:");
            for (String number : person.getNumbers()) {
                System.out.println("   " + number);
            }
        }
        System.out.println("");

    }

}
