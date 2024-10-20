package SET2;

public class LargestSumSubArray_Optimal {
    public static void main(String[] args) {
        int[] arr1 = {2,-3,4,-1,-2,1,5,-3};
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(longest(arr));
    }
    static int longest(int[] arr){
        int sum = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            max = Math.max(sum, max);
            if(sum<0){
                sum = 0;
            }
        }
        return max;
    }
}
