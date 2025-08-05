import java.io.File;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int correctFileCount = 0; // Счётчик верно указанных файлов

        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = new Scanner(System.in).nextLine();

            File file = new File(path);
            // Проверки, что файл существует и является файлом
            boolean fileExists = file.exists();
            boolean isFile = file.isFile();
            if (!fileExists) {
                System.out.println("Файл не существует.");
                continue;
            }
            if (!isFile) {
                System.out.println("Указанный путь ведёт к папке, а не к файлу.");
                continue;
            }

            correctFileCount++;
            System.out.println("Путь указан верно");
            System.out.println("Это файл номер " + correctFileCount);
        }
    }
}
