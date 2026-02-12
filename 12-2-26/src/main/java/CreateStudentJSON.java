import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Student {
    public String name;
    public int age;
    public List<String> subjects;

    public Student(String name, int age, List<String> subjects) {
        this.name = name;
        this.age = age;
        this.subjects = subjects;
    }
}

public class CreateStudentJSON {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Student s = new Student("Rahul", 20, Arrays.asList("Math", "Science", "English"));
        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(s);
        System.out.println(json);
    }
}
