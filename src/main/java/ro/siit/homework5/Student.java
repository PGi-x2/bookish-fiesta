package ro.siit.homework5;

public class Student implements ID{
    public String firstName = "Knight";
    public String lastName = "Phil";
    public String dateOfBirth = "24.02.1938";
    public String gender = "M";
    public String ID = "1380224389723";

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", ID='" + ID + '\'' +
                '}';
    }
}
