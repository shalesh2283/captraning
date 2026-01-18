public class Student {
    static String universityName = "XYZ University";
    static int totalStudents = 0;

    String name;
    final int rollNumber;
    char grade;

    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    public static void displayTotalStudents() {
        System.out.println(totalStudents);
    }

    public void display(Object obj) {
        if (obj instanceof Student) {
            System.out.println(name);
            System.out.println(rollNumber);
            System.out.println(grade);
        }
    }

    public static void main(String[] args) {
        Student s = new Student("Anita", 11, 'A');
        s.display(s);
        displayTotalStudents();
    }

}
