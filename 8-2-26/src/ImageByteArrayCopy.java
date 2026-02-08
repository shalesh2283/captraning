import java.io.*;

public class ImageByteArrayCopy {
    public static void main(String[] args) {
        String source = "image.jpg";
        String dest = "copy.jpg";

        try (FileInputStream fis = new FileInputStream(source);
             ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

            int data;
            while ((data = fis.read()) != -1) {
                baos.write(data);
            }

            byte[] imageBytes = baos.toByteArray();

            try (ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
                 FileOutputStream fos = new FileOutputStream(dest)) {

                while ((data = bais.read()) != -1) {
                    fos.write(data);
                }
            }

            System.out.println("Image copied");

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
