import java.util.Scanner;

public class TestProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = {1, 2, 3, 4, 5}; // Mảng số
        int sum = 0;

        // Vòng lặp tính tổng các phần tử trong mảng
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        System.out.println("Tong cac so la: " + sum);

        // Kiểm tra nếu tổng lớn hơn 10
        if (sum > 10) {
            System.out.println("Tong lon hon 10");
        } else {
            System.out.println("Tong khong lon hon 10");
        }

        // Nhập số từ người dùng và kiểm tra tính hợp lệ
        System.out.print("Nhap mot so de kiem tra tinh hop le: ");
        int input = scanner.nextInt();

        // Kiểm tra số hợp lệ (trong khoảng từ 0 đến 10)
        if (input >= 0 && input <= 10) {
            System.out.println("So hop le.");
        } else {
            System.out.println("So khong hop le");
        }

        scanner.close();
    }
}
