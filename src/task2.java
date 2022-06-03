import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n >= 2: ");
        int n = sc.nextInt();
        int del = 2;
        while (n % del != 0){
            del += 1;
        }
        System.out.println(del);
    }
}
