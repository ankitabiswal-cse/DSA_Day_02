public class CountOccurrence {
    public static void main(String[] args){
        int[] arr = {29,23,34,29,34,29,45,29,34,29};

        int count = 0;
        int target = 29;

        for(int i = 0; i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        }
        System.out.println(target+" occurs "+count+" times.");


    }
}
