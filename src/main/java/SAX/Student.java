package SAX;

public class Student {
    private int rollno;
    private String firstName;
    private String lastName;
    private String nickName;
    private int Mark;

    public int getRollno() {
        return rollno;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollno=" + rollno +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", Mark=" + Mark +
                '}';
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public Student() {
    }

    public Student(String firstName, String lastName, String nickName, int mark) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        Mark = mark;
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getMark() {
        return Mark;
    }

    public void setMark(int mark) {
        Mark = mark;
    }
}
