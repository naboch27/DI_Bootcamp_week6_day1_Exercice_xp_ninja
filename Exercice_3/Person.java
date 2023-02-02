/**
 * Person
 */
public class Person {

    private String name;
    private int age;
    private char gender;

    public Person() {

        this.name = "inconnu";
        this.age = 0;
        this.gender = 'U';

    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = 'U';
    }

    public String displayInfo() {
        return "{" +
                " name='" + name + "'" +
                ", age='" + age + "'" +
                ", gender='" + gender + "'" +
                "}";
    }

    public static void main(String[] args) {

        Person person1 = new Person();
        Person person2 = new Person("Mouhamed", 30, 'M');
        Person person3 = new Person("Coulibaly", 29);

        System.out.println("Information de la personne 1 : " + person1.displayInfo());
        System.out.println("Information de la personne 2 : " + person2.displayInfo());
        System.out.println("Information de la personne 3 : " + person3.displayInfo());

    }

}