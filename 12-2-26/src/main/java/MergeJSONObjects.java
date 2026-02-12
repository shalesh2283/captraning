import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJSONObjects {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        ObjectNode obj1 = mapper.createObjectNode();
        obj1.put("name", "Amit");
        obj1.put("age", 30);

        ObjectNode obj2 = mapper.createObjectNode();
        obj2.put("city", "Delhi");
        obj2.put("email", "amit@example.com");

        obj1.setAll(obj2);

        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj1));
    }
}
