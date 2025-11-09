public class PracticeQ1 {

    public static Boolean checkRepeatation(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int count = 0;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count > 1) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9};

       boolean res = checkRepeatation(arr);
       System.out.println(res);
    }
}
