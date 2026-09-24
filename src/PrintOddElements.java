public class PrintOddElements {
    public static void main(String[] args){

        int[] arr = {10,13,45,78,69,89,45,34,90,56,88,73,55,43,33,};


        for(int i = 0;i<arr.length;i++){
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]);
            }
        }
    }
}
