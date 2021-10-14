/*
一、题目要求
股票价格涨跌趋势，常用蜡烛图技术中的K线图来表示，分为按日的日K线、按周的周K线、按月的月K线等。以日K线为例，每天股票价格从开盘到收盘走完一天，对应一根蜡烛小图，要表示四个价格：开盘价格Open（早上刚刚开始开盘买卖成交的第1笔价格）、收盘价格Close（下午收盘时最后一笔成交的价格）、中间的最高价High和最低价Low。

如果Close<Open，表示为“BW-Solid”（即“实心蓝白蜡烛”）；如果Close>Open，表示为“R-Hollow”（即“空心红蜡烛”）；如果Open等于Close，则为“R-Cross”（即“十字红蜡烛”）。如果Low比Open和Close低，称为“Lower Shadow”（即“有下影线”），如果High比Open和Close高，称为“Upper Shadow”（即“有上影线”）。请编程序，根据给定的四个价格组合，判断当日的蜡烛是一根什么样的蜡烛。

输入格式：
输入在一行中给出4个正实数，分别对应Open、High、Low、Close，其间以空格分隔。

输出格式：
在一行中输出日K蜡烛的类型。如果有上、下影线，则在类型后加上with 影线类型。如果两种影线都有，则输出with Lower Shadow and Upper Shadow。

输入样例1：
5.110 5.250 5.100 5.105

输出样例1：
BW-Solid with Lower Shadow and Upper Shadow

输入样例2：
5.110 5.110 5.110 5.110

输出样例2：
R-Cross

输入样例3：
5.110 5.125 5.112 5.126

输出样例3：
R-Hollow
*/


//*************************************************************************************




//方法一：
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        double Open = 0,Close = 0, High = 0,Low = 0;
        char result;

        Scanner sc = new Scanner(System.in);
        Open = sc.nextDouble();
        High = sc.nextDouble();
        Low = sc.nextDouble();
        Close = sc.nextDouble();

        if(Close < Open){
            System.out.print("BW-Solid");
        }
        else if(Close > Open){
            System.out.print("R-Hollow");
        }
        else if(Open == Close){
            System.out.print("R-Cross");
        }

        if( (Low < Close) && (Low < Open) && (High > Close) && (High > Open) ){
            System.out.print(" with Lower Shadow and Upper Shadow");
        }
         else if((Low < Close) && (Low < Open)){
            System.out.print(" with Lower Shadow");
        }
         else if((High > Close) && (High > Open)){
            System.out.print(" with Upper Shadow");
        }


    }
}

//方法二：
import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    double Open = in.nextDouble();
    double High = in.nextDouble();
    double Low  = in.nextDouble();
    double Close = in.nextDouble();
    if(Close<Open)//每种情况分为四种 根据Close和Open的大小关系来判断
    {
      if(Low<Close&&High>Close)
        System.out.print("BW-Solid with Lower Shadow and Upper Shadow");
      else if(Low>=Close&&High>Open)
        System.out.print("BW-Solid with Upper Shadow");
      else if(Low<Close&&High<=Open)
        System.out.print("BW-Solid with Lower Shadow ");
      else
        System.out.print("BW-Solid");
    }
    else if(Close==Open)
    {
      if(Low<Open&&High>Open)
        System.out.print("R-Cross with Lower Shadow and Upper Shadow");
      else if(Low>=Open&&High>Open)
        System.out.print("R-Cross with Upper Shadow");
      else if(Low<Open&&High<=Open)
        System.out.print("R-Cross withLower Shadow");
      else
        System.out.print("R-Cross");
    }
    else
    {
      if(Low<Open&&High>Close)
        System.out.print("R-Hollow with Lower Shadow and Upper Shadow");
      else if(Low>=Open&&High>Close)
        System.out.print("R-Hollow with Upper Shadow");
      else if(Low<Open&&High<=Close)
        System.out.print("R-Hollow with Lower Shadow");
      else
        System.out.print("R-Hollow");
    }
  }
}