package Array;


/**
 * Array operations
 */

public class ArrayDemo {
    public static void main(String[] args){
        int[] nums =  new int[5];
        for (int i = 0; i< nums.length; i++) {
            nums[i] = i;
        }
        for (int i = 0; i<nums.length; i++){
            if(nums[i] == 3){
                System.out.println("index is " + i);
            }
        }
    }
}
