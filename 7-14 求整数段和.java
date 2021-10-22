/*
一、题目要求
给定两个整数A和B，输出从A到B的所有整数以及这些数的和。

输入格式：
输入在一行中给出2个整数A和B，其中−100≤A≤B≤100，其间以空格分隔。

输出格式：
首先顺序输出从A到B的所有整数，每5个数字占一行，每个数字占5个字符宽度，向右对齐。最后在一行中按Sum = X的格式输出全部数字的和X。

输入样例：
-3 8

输出样例：
   -3   -2   -1    0    1
    2    3    4    5    6
    7    8
Sum = 30
*/
//*******************************************************************************************
import java.util.Scanner;

public class Integer {
    public static void main(String [] args){

        int A = 0, B = 0,i = 0,Sum = 0,row = 0;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        for(i = A; i <= B; i++){
            row++;
            row = row%5;
            if(row == 0) {
                System.out.printf("%5d\n", i);
            } else{
                System.out.printf("%5d",i);
            }
            Sum = Sum + 1;
        }
        if(row!= 0){
            System.out.printf("\n");    
        }
        System.out.printf("Sum = %d",Sum);
        sc.close();

    }
}