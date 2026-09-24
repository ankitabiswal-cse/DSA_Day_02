public class CountPositiveNegative {
    public static void main(String[] args){

        int[] arr = {2,-8,-9,0,7,5,-7,-3,-6,9,56,-45,-33,89,78,-88};

        int positivecount = 0;
        int negativecount = 0;

        System.out.println("Positive Number =");

        for(int i = 0;i<arr.length;i++){
            if(arr[i] >= 0){
                System.out.println(arr[i]+" ");
                positivecount++;
            }
        }
        System.out.println("Negative Number =");

        for(int i = 0;i<arr.length;i++){
            if(arr[i] < 0){
                System.out.println(arr[i]+" ");

                negativecount++;
            }
        }
        System.out.println("\nPositive Number ="+positivecount);
        System.out.println("\nNegative Number ="+negativecount);
    }
}
