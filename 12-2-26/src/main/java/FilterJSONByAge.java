import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterJSONByAge {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode array = mapper.readTree(new File("people.json"));

        for (JsonNode node : array) {
            if (node.get("age").asInt() > 25) {
                System.out.println(node.toPrettyString());
            }
        }
    }
}
