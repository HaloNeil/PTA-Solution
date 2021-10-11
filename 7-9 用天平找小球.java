/*
一、题目要求
三个球A、B、C，大小形状相同且其中有一个球与其他球重量不同。要求找出这个不一样的球。

输入格式：
输入在一行中给出3个正整数，顺序对应球A、B、C的重量。

输出格式：
在一行中输出唯一的那个不一样的球。

输入样例：
1 1 2

输出样例：
C
*/

//版本一：
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, c;
		char result;
        
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if(a != b) {
			if(a != c) {
				result = 'A';
			} else {
				result = 'B';
			} 
		} else {
			result = 'C';
		}
		
		System.out.println(result);
		
	}

}
//******************************************************************代码简单，但未解决当A!=B!=C的情况

// 版本二
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int a, b, c;
		char result='A';
        
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		if( (a!=b) && (a != c) ) {
			result = 'A';
		}
		if ((b!=a) && (b!=c)) {
			result = 'B';
		}
		if ((c!=a) && (c!=b)) {
			result = 'C';
		}
		
		System.out.println(result);
		
	}

}
//******************************************************************可读性更好 简单直接，但仍未解决上述问题

//版本三 我自己依照V1.0进行的解决
import java.util.Scanner;

public class ball {
    public static void main(String[] args){
        int a,b,c;
        char result;
        System.out.println("please enter the ball height frin A - C");
        Scanner ty = new Scanner(System.in);
        a = ty.nextInt();
        b = ty.nextInt();
        c = ty.nextInt();

        if(a != b) {
            if(a != c) {
                result = 'A';
                if(b !=c ){
                    result = 'X';
                }
            } else {
                result = 'B';
            }
        } else {
            result = 'C';
        }


        System.out.println(result);

 //******************************************************************完美解决



/*
知识点 Scanner s = new Scanner(System.in);

可以通过如
		a = ty.nextInt();
        b = ty.nextInt();
        c = ty.nextInt();
        进行多次输入 回车也没有关系 必须有数据进入
 */