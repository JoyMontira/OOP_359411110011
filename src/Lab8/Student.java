package Lab8;

public class Student extends Person {
    private String sid;
    private String program;

    public Student(String pid, String name, String dateOfBirth, String sid, String program) {
        super(pid, name, dateOfBirth);
        this.sid = sid;
        this.program = program;
    }
    public void addSubject (){
        System.out.println("I'm adding subject.");
    }

    //toString

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", program='" + program + '\'' +
                "} " + super.toString();
    }
}
