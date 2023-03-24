package practices;

import java.util.Arrays;

public class Numbers {
    public static void main(String[] args) {
        int[] nums = {2, 1, 7, 10, 4, 18, 6};
        int maxNum = 0;
        for (int i = 0; i<nums.length; i++){
            if(maxNum<nums[i]){
                maxNum = nums[i];
            }
        }
        System.out.println(maxNum);

        Arrays.sort(nums);
        int max = nums[nums.length-1];
        for(int i =nums.length-1; i>=0; i--){
            if(nums[i]<max){
                System.out.println(nums[i]);
                break;
            }
        }

        int[] reverse = new int[nums.length];
        int j=0;
        for(int i = nums.length-1; i>=0 ; i--){
            reverse[j++]= nums[i];

        }
        System.out.println(Arrays.toString(reverse));
    }
}
