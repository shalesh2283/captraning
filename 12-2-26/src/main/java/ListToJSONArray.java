import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Person {
    public String name;
    public int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJSONArray {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        List<Person> list = new ArrayList<>();
        list.add(new Person("A", 22));
        list.add(new Person("B", 28));
        list.add(new Person("C", 35));

        String json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list);
        System.out.println(json);
    }
}
