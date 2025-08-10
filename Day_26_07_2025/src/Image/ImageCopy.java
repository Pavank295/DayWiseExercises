package Image;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class ImageCopy {
    public static void main(String[] args) {
        String sourcePath = "D:\\Spring.jpg";      
        String destinationPath = "copy.jpg"; 
        try (
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(destinationPath);
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            System.out.println("Image copied successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while copying: " + e.getMessage());
        }
    }
}
