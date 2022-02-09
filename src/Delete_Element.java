import java.util.Scanner;

public class Delete_Element {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 9, 8, 0};
        int del;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to delete from the array: ");
        del = sc.nextInt();

        int delpos = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == del) {
                delpos = i;
            }
        }
        if (delpos == -1) {
            System.out.println("The element you entered can not be found from the array!");
        } else {
            for (int i = delpos; i < arr.length -1; i++) {
                arr[i] = arr[i + 1];
            }
        }
        String result = " ";
        for (int i = 0; i < arr.length; i++){
            result += arr[i] + ", ";
        }

        System.out.println("Result: " + result);
    }
}
