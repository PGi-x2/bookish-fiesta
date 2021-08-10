package ro.siit.homework12;
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
        //setDateOfBirth(dateOfBirth);
        this.gender = gender;
        this.id = id;

        try{
            setFirstName(firstName);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            setLastName(lastName);
        }
        catch (Exception e){
            System.out.println(e);
        }
        try{
            setDateOfBirth(dateOfBirth);
        }
        catch (Exception e){
            System.out.println(e);
        }

    }

    //Methods
    public String getFirstName() { // metoda
        return firstName;
    }

    public void setFirstName(String firstName) throws Exception{ // (parametru)
        this.firstName = firstName;
    }
    public void setLastName(String lastName) throws Exception { // (parametru)
        if (lastName == null) {
        } else {
            this.lastName = lastName;
        }
    }
    public void setDateOfBirth(LocalDate dateOfBirth) throws Exception {
        if (dateOfBirth == null || dateOfBirth.getYear() < 1900 || dateOfBirth.getYear() > LocalDate.now().getYear() - 18) {
            throw new Exception("Invalid date!");
        } else {
            this.dateOfBirth = dateOfBirth;
        }
    }
}