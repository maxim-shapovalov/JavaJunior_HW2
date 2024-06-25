import java.lang.reflect.InvocationTargetException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Animal animal = ObjectCreator.createObj(Animal.class);
        Person person = ObjectCreator.createObj(Person.class);
        Dog dog = ObjectCreator.createObj(Dog.class);

        if (animal != null) {
            System.out.println("�� ���������: " + animal);
            RandomDateProcessor.processRandomDate(animal);
            System.out.println("����� ��������: " + animal);
        } else {
            System.err.println("�� ������� ������� ������ Animal.");
        }

        if (person != null) {
            System.out.println("�� ��������: " + person);
            RandomDateProcessor.processRandomDate(person);
            System.out.println("����� ��������: " + person);
        } else {
            System.err.println("�� ������� ������� ������ Person.");
        }

        if (dog != null) {
            System.out.println("�� ��������: " + dog);
            RandomDateProcessor.processRandomDate(dog);
            System.out.println("����� ��������: " + dog);
        } else {
            System.err.println("�� ������� ������� ������ Dog.");
        }
    }
}
