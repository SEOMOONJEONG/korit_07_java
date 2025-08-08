package ch12_arrays;

import java.util.Arrays;

public class Array14 {
    public static void main(String[] args) {
        int[][] nums = new int[20][5];
        // 1부터 100까지의 숫자를 2차 배열에 순서대로 값을 넣으시오
        // 즉 nums[0][0] = 1, nums[0][1] = 2, nums[1],[0] = 6
        int n = 1;
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums[i].length; j++){
                // 값을 대입할 때 주소지를 두 개 다 설정하신 다음에 데이터를 넣어야 합니다.
                nums[i][j] = n++;
//                System.out.println(nums[i][j]+ n++ + " "); // 결과만 나오고 값 지정 x
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");
        for(int[] firstArray : nums){
            for(int number : firstArray ) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
        System.out.println("---------------");

        for(int[] firstArray : nums) {
            System.out.println(Arrays.toString(firstArray));
        }
        System.out.println("---------------");

        // 2차 배열의 출럭 : Arrays.deepToString(배열명);
        System.out.println(Arrays.deepToString(nums));

        //ch13_inheritance / Animal / Human / Tiger / Main


    }
}
