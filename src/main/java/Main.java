import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Main {
    public static final String directory = "D:\\Program Files (x86)";
    public static String file;

    public static void main(String[] args) throws Exception {
        String input = Input.start() + "\n";
        Path path = Paths.get(file);
        try{
            Files.write(path, input.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
