package person;

public class Student extends Person{
    private String studentId;
    private String className;
    private String parentName;
    private String parentPhoneNumber;

    public Student(String firstName, String lastName, String ID) {
        super(firstName, lastName, ID);
        this.studentId = "None";
        this.className = "None";
        this.parentName = "None";
        this.parentPhoneNumber = "None";
    }

    public Student(String firstName, String lastName, String ID, String studentId, String className, String parentName, String parentPhoneNumber) {
        super(firstName, lastName, ID);
        this.studentId = studentId;
        this.className = className;
        this.parentName = parentName;
        this.parentPhoneNumber = parentPhoneNumber;


    }


}
