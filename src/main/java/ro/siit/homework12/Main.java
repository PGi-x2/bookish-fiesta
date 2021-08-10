package ro.siit.homework12;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        StudentRepository repository = new StudentRepository();

        Student student = new Student("1", "2",  LocalDate.of(2021,6,30), "M", 700008);
    }
}