import java.util.*;

abstract class CourseType {
    String courseName;
    CourseType(String courseName) {
        this.courseName = courseName;
    }
    abstract void evaluate();
}

class ExamCourse extends CourseType {
    ExamCourse(String name) {
        super(name);
    }
    void evaluate() {
        System.out.println(courseName + " Exam");
    }
}

class AssignmentCourse extends CourseType {
    AssignmentCourse(String name) {
        super(name);
    }
    void evaluate() {
        System.out.println(courseName + " Assignment");
    }
}

class ResearchCourse extends CourseType {
    ResearchCourse(String name) {
        super(name);
    }
    void evaluate() {
        System.out.println(courseName + " Research");
    }
}

class Course<T extends CourseType> {
    List<T> list = new ArrayList<>();
    void addCourse(T c) {
        list.add(c);
    }
    List<T> getCourses() {
        return list;
    }
}

public class UniversityCourseManagement {
    public static void evaluateAll(List<? extends CourseType> list) {
        for (CourseType c : list) {
            c.evaluate();
        }
    }
    public static void main(String[] args) {
        Course<ExamCourse> e = new Course<>();
        e.addCourse(new ExamCourse("Math"));
        e.addCourse(new ExamCourse("Physics"));

        Course<ResearchCourse> r = new Course<>();
        r.addCourse(new ResearchCourse("AI"));

        evaluateAll(e.getCourses());
        evaluateAll(r.getCourses());
    }
}
