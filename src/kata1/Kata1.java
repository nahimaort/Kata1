package kata1;
import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person person = new Person("Juan", new Date(99, 1, 1));
        System.out.println(person.getName() +  " tiene " + person.getAge());
    }
    
}
