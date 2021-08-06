import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arrayNumber = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Mảng cũ : ");
        displayArray(arrayNumber);

        System.out.println("Nhập vào vị trí muốn thêm : ");
        int indexAdd = scanner.nextInt();
        System.out.println("Nhập số muốn thêm vào mảng : ");
        int numberAdd = scanner.nextInt();

        System.out.println("Mảng mới :");
        displayArray(addElementToArray(indexAdd, numberAdd, arrayNumber));

    }

    public static void displayArray(int[] array){
        for (int element : array) {
            System.out.print(element + ", ");
        }
        System.out.println("\n");
    }

    public static int[] addElementToArray(int indexAdd, int numberAdd, int[] array) {
        int[] newArray = new int[array.length+1];
        for (int i = 0; i < newArray.length; i++) {
            if (indexAdd > i){
                newArray[i] = array[i];
            }else if (indexAdd == i){
                newArray[i] = numberAdd;
            }else {
                newArray[i] = array[i - 1];

            }
        }
        return newArray;
    }
}
