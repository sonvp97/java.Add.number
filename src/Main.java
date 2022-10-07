import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the index you want to add: ");
        int index = scanner.nextInt();
        System.out.println("Enter the element you want to add: ");
        int number = scanner.nextInt();
        int[] arr = {5, 4, 8, 9, 6, 0, 0, 0, 0};
        Add(index,number,arr);
        for (int i = 0;i < arr.length;i++){
            System.out.print(arr[i] + "\t");
        }
    }
    public static void Add (int x, int num,int[] array){
        for (int i = array.length-1;i>x;i--){
            array[i]=array[i-1];
        }
        array[x] = num;
    }
}