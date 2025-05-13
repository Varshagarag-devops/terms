class Course {
    private String coursename;
    private int marks;

    public Course(String coursename, int marks) {
        this.coursename = coursename;
        this.marks = marks;
    }

    public String getCoursename() {
        return coursename;
    }

    public int getMarks() {
        return marks;
    }
}

class Student {
    private String name;
    private String program;
    private int sem;
    private Course[] courses;

    public Student(String name, String program, int sem, Course[] courses) {
        this.name = name;
        this.program = program;
        this.sem = sem;
        this.courses = courses;
    }

    public void display() {
        System.out.println("Student: " + name + ", Program: " + program + ", Semester: " + sem);
        for (Course c : courses) {
            System.out.println("Course: " + c.getCoursename() + ", Marks: " + c.getMarks());
        }
    }

    public void displayLowMarks(int threshold) {
        for (Course c : courses) {
            if (c.getMarks() < threshold) {
                System.out.println("Course with low marks: " + c.getCoursename() + " - " + c.getMarks());
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Course[] courses = {
            new Course("Math", 45),
            new Course("Physics", 70),
            new Course("Chemistry", 38)
        };

        Student s1 = new Student("Alice", "BSc", 3, courses);
        s1.display();

        System.out.println("Subjects with marks less than 50:");
        s1.displayLowMarks(50);
    }
}
