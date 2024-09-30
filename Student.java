package Person;

public class Student {
    private String name;
    private String dateOfBirth;
    private String studentID;

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

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public Student(String name, String dateOfBirth, String studentID) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.studentID = studentID;
    }
    public Student() {}

}
