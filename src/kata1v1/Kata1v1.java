package kata1v1;

import java.util.Date;

public class Kata1v1 {

    public static void main(String[] args) {
        Person person = new Person("Aitor","García", new Date(93,8,26));
        System.out.println(person.getName() + " " + person.getSurname() + " tiene " + person.getAge() + " años.");
    }
}
