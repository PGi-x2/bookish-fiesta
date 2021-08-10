package ro.siit.homework12Stefan;
import java.time.LocalDate;

    //Parameters
    public class Student {
        private String firstName; //proprietate
        private String lastName;
        private LocalDate dateOfBirth;
        private String gender;
        private int id;

        //Constructors

        public Student(String firstName, String lastName, LocalDate dateOfBirth, String gender, int id) {
            this.firstName = firstName;
            this.lastName = lastName;
            setDateOfBirth(dateOfBirth);
            this.gender = gender;
            this.id = id;
        }

        //Methods
        public String getFirstName() { // metoda
            return firstName;
        }

        public void setFirstName(String firstName) { // (parametru)
            this.firstName = firstName;
        }

        public void setDateOfBirth(LocalDate dateOfBirth) {
            if (dateOfBirth == null || dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > LocalDate.now().getYear() - 18) {
                new Exception("Invalid date!");
            } else {
                this.dateOfBirth = dateOfBirth;
            }
        }

    }