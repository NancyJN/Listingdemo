import java.util.HashSet;
import java.util.Set;

public class Student {
    private String name;
    private int rollNumber;
    private Student (String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    static Set<Student> stuSet = new HashSet<>();

    public String toString(){
        return "Student : " + this.getName() + " " +
                "Roll Number : " + this.getRollNumber() + " " ;
    }

    public static void main(String[] args) {
        Student s1 = new Student("John" , 11);
        stuSet.add(s1);
        Student s2 = new Student("Tyler", 13);
        stuSet.add(s2);

        for (Student s: stuSet) {
            System.out.println(s);
        }
    }
}