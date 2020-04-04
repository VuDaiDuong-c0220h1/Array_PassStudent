import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập số lượng sinh viên");
            size = sc.nextInt();
            if (size > 30) {
                System.out.println("Số lượng sinh viên nhỏ hơn 30");
            }
        } while (size > 30);
        int [] array = new int[size];
        for ( int i = 0; i < size; i++){
            System.out.println("Nhập điểm của sinh viên thứ " + (i+1));
            array[i] = sc.nextInt();
        }
        int count = 0;
        for ( int i = 0; i < size; i++){
            System.out.print(array[i] + "\t");
            if (array[i] > 5) {
                count++;
            }
        }
        System.out.println("Số sinh viên đỗ là " + count);

    }
}
