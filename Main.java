/*编写一个程序，要求用户输入24小时制的时间，然后显示12小时制的时间。

输入格式：
输入在一行中给出带有中间的:符号（半角的冒号）的24小时制的时间，如12:34表示12点34分。当小时或分钟数小于10时，均没有前导的零，如5:6表示5点零6分。

提示：在scanf的格式字符串中加入:，让scanf来处理这个冒号。

输出格式：
在一行中输出这个时间对应的12小时制的时间，数字部分格式与输入的相同，然后跟上空格，再跟上表示上午的字符串AM或表示下午的字符串PM。如5:6 PM表示下午5点零6分。注意，在英文的习惯中，中午12点被认为是下午，所以24小时制的12:00就是12小时制的12:0 PM；而0点被认为是第二天的时间，所以是0:0 AM。

输入样例：
21:11     结尾无空行

输出样例：
9:11 PM   结尾无空行
*/

//PTA可通过代码
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String input="";
		int hour=0, minute=0, am=1;  // am=1 上午 
        
		Scanner sc = new Scanner(System.in);
		input = sc.nextLine();
		
		String[] temp = input.split(":"); //split()： 分割某个字符串并以字符串数组形式返回
		hour = Integer.parseInt(temp[0]); 
		minute = Integer.parseInt(temp[1]);         
		if( (hour<12) ) {
			am = 1;
		} else {
			am = 0;
		}
		if ( hour > 12 ) {
			hour = hour - 12;
		}
		
		System.out.print(hour + ":" + minute + " ");
		if ( am==1 ) {
			System.out.print("AM");
		}
		else if (am==0) {
			System.out.print("PM");
		}
		
	}

}

/*知识点：1.split的使用 
   		 2.Integer.parseInt 的使用
*/

//还可以依据功能精简，不需要定义am，不简洁，可以加入新变量 ohour ohour = hour - 12 输出大于12的小时值，并通过if-else 判断hour是否大于12输出AM,PM
// 该代码缺点为 即使输入 8：70，分钟依然不变，从实用性角度开发，应满足当 分钟 > 12 ,小时 + 1；当小时 > 24,小时重置。

import java.util.Scanner;

public class Main{
    public static void main(String [] args){

        String input = "";
        int hour = 0,minute = 0,ohour = 0 ;

        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();

        String [] temp =  input.split(":");
        hour = Integer.parseInt(temp[0]);
        minute = Integer.parseInt(temp[1]);

        if (minute > 60) {
            minute = minute - 60;
            hour = hour +1;
            ohour = hour;
            if (hour > 12) {
                ohour = hour - 12;
                if (hour > 24)
                    ohour = hour - 24;

            }
        }
        if (hour > 24){
            System.out.print("welcome a new day:");
        }
        System.out.print(ohour + ":"+minute);
        if (hour<12){
            System.out.print(" AM");
        }
        else if (hour>=12){
            System.out.print(" PM");
        }

    }
}

//仍有问腿：当输入 11：600时 输出12：540，暂时先这样吧，也不会有有人闲的蛋疼去输三位数吧^-^.
