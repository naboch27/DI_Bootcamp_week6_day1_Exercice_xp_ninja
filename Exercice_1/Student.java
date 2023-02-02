package Exercice_1;

/**
 * index
 */
public class Student {

    private int age = 30 ;
    private double poids = 56.5 ;
    private boolean isStudent = true ;
    private char gender = 'M' ;
    private String name = "Mouhamed";


    public String displayInfo() {
        return "{" +
            " age='" + age + "'" +
            ", poids='" + poids + "'" +
            ", isStudent='" + isStudent+ "'" +
            ", gender='" + gender + "'" +
            ", name='" + name + "'" +
            "}";
    }

    public static void main(String[] args) {
        
        Student student = new Student();

        System.out.println("The information Student is"+student.displayInfo());

    }
    
}