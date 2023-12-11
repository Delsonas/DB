import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static final String directory = "D:\\Program Files (x86)";
    public static String file;

    public static void main(String[] args) throws Exception {
        String input = Input.start() + "\n";
        Path path = Paths.get(file);
        Writer.writing(path, input);
    }
}
