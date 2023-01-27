package day0110;

import java.util.Arrays;
import java.util.Random;

public class Ex09Lotto2 {

    public static void main(String[] args) {
        Random random = new Random();
        int[] lottoNums = new int[6];

        for(int i=0;i<lottoNums.length;){ //특정 조건에서만 i++을 해줄려고 안씀.
            int tmp = random.nextInt(45)+1;
            boolean numSwitch = true;
            for(int j=0;j<i;j++){
                if(tmp == lottoNums[j]){
                    numSwitch = false;
                }
            }

            if(numSwitch) {
                lottoNums[i] = tmp;
                i ++;
            }
        }

//        for(int i = 0; i < lottoNums.length - 1; i++){
//            if(lottoNums[i] > lottoNums[i+1]){
//                int temp = lottoNums[i];
//
//                lottoNums[i] = lottoNums[i+1];
//                lottoNums[i+1] = temp;
//                i = -1;
//            }
//        }


















        System.out.println(Arrays.toString(lottoNums));


    }

}
