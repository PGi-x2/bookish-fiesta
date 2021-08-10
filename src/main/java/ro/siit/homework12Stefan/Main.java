package ro.siit.homework12Stefan;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        StudentRepository repository = new StudentRepository();

        Student student = new Student("Porgras", "Andrei",  LocalDate.of(2015,06,30), "M", 700008);
    }
}