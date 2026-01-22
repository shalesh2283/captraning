import java.util.ArrayList;

class Course {
    private String courseName;
    private ArrayList<Student> students = new ArrayList<>();

    Course(String courseName) {
        this.courseName = courseName;
    }

    void addStudent(Student student) {
        students.add(student);
    }

    void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println(" " + s.getName());
        }
    }

    String getCourseName() {
        return courseName;
    }
}

class Student {
    private String name;
    private ArrayList<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    void showCourses() {
        System.out.println(name + " enrolled courses:");
        for (Course c : courses) {
            System.out.println(" " + c.getCourseName());
        }
    }

    String getName() {
        return name;
    }
}

class School {
    private String schoolName;
    private ArrayList<Student> students = new ArrayList<>();

    School(String schoolName) {
        this.schoolName = schoolName;
    }

    void addStudent(Student student) {
        students.add(student);
    }
}

public class SchoolStudentCourseDemo {
    public static void main(String[] args) {
        School school = new School("ABC School");

        Student s1 = new Student("Rahul");
        Student s2 = new Student("Anita");

        Course math = new Course("Math");
        Course science = new Course("Science");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(math);
        s1.enrollCourse(science);
        s2.enrollCourse(math);

        s1.showCourses();
        math.showStudents();
    }
}
