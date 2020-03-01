package Lab9;

public class Student {
    //attributes
    private int sid;
    private String name;
    private String major;
    private double gpa;
    //constructor


    public Student(int sid, String name, String major, double gpa) {
        this.sid = sid;
        this.name = name;
        this.major = major;
        this.gpa = gpa;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

}
