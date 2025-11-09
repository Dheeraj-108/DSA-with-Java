import java.util.Scanner;

public class LinearSearch {

    public static int searchElement(String[] elmArr, String key){
        for(int i=0; i < elmArr.length; i++){
            if(elmArr[i].equals(key)) {
                System.out.println("inside if: " + i);
                return i;
            }
        }

        return -1;
    }
    public static void main(String[] args) {
        String menuArr[] = new String[5]; 
            
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<menuArr.length; i++){
            System.out.print("Enter recipe: ");
            menuArr[i] = sc.nextLine();
        }

        System.out.print("Enter the element to search: ");
        String target = sc.nextLine();

        int result = searchElement(menuArr, target);
        if(result == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + result);
        }

        sc.close();
    }
}
