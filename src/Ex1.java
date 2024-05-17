import java.io.File;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn file: ");
        String filePath = scanner.nextLine();

        File file = new File(filePath);
        if (file.exists() && file.isFile()) {
            System.out.println("Kích thước của file là: " + file.length() + " bytes");
        } else {
            System.out.println("File không tồn tại hoặc không phải là một file.");
        }

        scanner.close();
    }
}