package ro.siit.homework12;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

    //parametrii
public class Student {
    private String firstName; //proprietate
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private int id;

    //Constructor

        public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.dateOfBirth = dateOfBirth;
            this.gender = gender;
            this.id = id;
        }

        public String getFirstName() { // () metoda
        return firstName;
    }

    public void setFirstName(String firstName) { //parametru
        this.firstName = firstName;
    }
}

