import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Input {
    public static String start() throws Exception{
        return getInputLine();
    }

    private static String getInputLine() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Что вы хотите записать?");
        String inputLine;

        inputLine = keyboard.nextLine();

        String filepath = Main.directory + "\\" + inputLine + ".txt";
        File f = new File(filepath);
        if(f.exists()) {
            System.out.println("Такой файл есть! Введите, что хотите записать в него.");
        }
        else{
            f.createNewFile();
            System.out.println("Создан новый файл! Введите, что хотите записать в него.");
        }

        Main.file = filepath;

        String inputText = keyboard.nextLine();
        keyboard.close();
        return inputText;
    }

}
