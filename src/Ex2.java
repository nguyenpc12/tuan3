import java.io.File;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập đường dẫn thư mục hoặc file: ");
        String path = scanner.nextLine();

        File fileOrDirectory = new File(path);
        deleteFileOrDirectory(fileOrDirectory);
        scanner.close();
    }

    private static void deleteFileOrDirectory(File fileOrDirectory) {
        if (fileOrDirectory.isDirectory()) {
            File[] entries = fileOrDirectory.listFiles();
            if (entries != null) {
                for (File entry : entries) {
                    deleteFileOrDirectory(entry);
                }
            }
        }
        if (fileOrDirectory.delete()) {
            System.out.println("Đã xoá: " + fileOrDirectory.getPath());
        } else {
            System.out.println("Không thể xoá: " + fileOrDirectory.getPath());
        }
    }

}
