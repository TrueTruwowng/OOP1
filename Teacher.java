package Person;

public class Teacher extends Person {
    private String name;
    private String dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Teacher(String name, String dateOfBirth, String studentID) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Teacher() {}

}
