public class CountEvenOdd {
    public static void main(String[] args){

        int[] arr = {12,67,80,99,85,54,33,25,55,65,45,333,23,48,90,89,77,88};

        int evencount = 0;
        int oddcount = 0;
        System.out.println("Even Numbers =");

        for(int i = 0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]+" ");
                evencount++;
            }
        }
                System.out.println("\nOdd numbers:");

        for(int i = 0; i<arr.length;i++){
            if(arr[i] % 2 != 0){
                System.out.println(arr[i]+" ");
                oddcount++;
            }
        }
        System.out.println("\nEven Numbers = "+evencount);
        System.out.println("\nOdd Number = "+oddcount);
            }
        }

