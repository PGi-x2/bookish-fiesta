package ro.siit.homework12;
<<<<<<< HEAD
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

=======

public class Student implements ID {
    public String firstName = "Knight";
    public String lastName = "Phil";
    public String dateOfBirth = "24.02.1938";
    public String gender = "M";
    public String ID = "1380224389723";
}
>>>>>>> github/main
