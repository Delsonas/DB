import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.File;

public class InputTest {
    @Test
    public void whenFileDoesNotExist() throws Exception{
        String name = "Машина";

        String filepath = Main.directory + "\\" + name + ".txt";
        File f = new File(filepath);

        Boolean fileForCheking = f.exists();

        Input.createIfNotExist(f);

        Boolean fileAftercheckingForExisting = f.exists();

        Assertions.assertNotEquals(fileForCheking, fileAftercheckingForExisting);
    }
}