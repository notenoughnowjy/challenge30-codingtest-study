package Lv2;

import java.util.Scanner;

public class outputstar {
    public static void main(String args[]){
        /* 의사 코드
         * 1. 별을 5,4,3,2,1 출력한다.
         * 2. 별을 1,2,3,4,5 출력한다.
         * 3. 이어서 출력한다.
         */
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt(); //값 입력받기
         //별 5/4/3/2/1 출력
         for(int i=0;i<n;i++){
            for(int j=5;j>i;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        //별 1/2/3/4/5 출력
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
