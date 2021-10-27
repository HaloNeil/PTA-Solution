/*一、题目要求
根据下面关系式，求圆周率的值，直到最后一项的值小于给定阈值。

md 数学方程式敲不出来 自己看去
*/

二、代码


import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        double pi = 1,denominator = 1,molecular = 1,i,threshold;

        Scanner sc = new Scanner(System.in);
        threshold = sc.nextFloat();

        for(i = 1;molecular/denominator>= threshold;i++) {
            molecular = molecular*i;
            denominator = denominator * (2 * i +1);
            pi = pi + molecular/denominator;
        }
        pi = pi  * 2;

        System.out.printf("%6f",pi);
    }
}
