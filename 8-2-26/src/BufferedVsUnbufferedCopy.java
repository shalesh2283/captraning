import java.io.*;

public class BufferedVsUnbufferedCopy {
    public static void main(String[] args) throws IOException {
        String source = "largefile.dat";
        String dest1 = "unbuffered.dat";
        String dest2 = "buffered.dat";

        byte[] buffer = new byte[4096];

        long start1 = System.nanoTime();
        try (FileInputStream fis = new FileInputStream(source);
             FileOutputStream fos = new FileOutputStream(dest1)) {
            int bytes;
            while ((bytes = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytes);
            }
        }
        long end1 = System.nanoTime();

        long start2 = System.nanoTime();
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(source));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest2))) {
            int bytes;
            while ((bytes = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, bytes);
            }
        }
        long end2 = System.nanoTime();

        System.out.println("Unbuffered time: " + (end1 - start1));
        System.out.println("Buffered time: " + (end2 - start2));
    }
}
