import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Animal animal = ObjectCreator.createObj(Animal.class);
        Person person = ObjectCreator.createObj(Person.class);
        Dog dog = ObjectCreator.createObj(Dog.class);

        if (animal != null) {
            System.out.println("До аннотации: " + animal);
            RandomDateProcessor.processRandomDate(animal);
            System.out.println("После анотации: " + animal);
        } else {
            System.err.println("Не удалось создать обьект Animal.");
        }

        if (person != null) {
            System.out.println("До анотации: " + person);
            RandomDateProcessor.processRandomDate(person);
            System.out.println("После анотации: " + person);
        } else {
            System.err.println("Не удалось создать обьект Person.");
        }

        if (dog != null) {
            System.out.println("До анотации: " + dog);
            RandomDateProcessor.processRandomDate(dog);
            System.out.println("После анотации: " + dog);
        } else {
            System.err.println("Не удалось создать обьект Dog.");
        }
    }
}
