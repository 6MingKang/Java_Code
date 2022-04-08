package StageOne._2语言基础;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、20:59
 * JavaStudyCode
 * 进行算数运算时：
 * 两个操作数有一个为double 计算结果提升为double
 * 如果操作数中没有double 有一个为float 计算结果提升为float
 * 如果操作数中没有float 有一个为long 计算结果提升为long
 * 如果操作数中没有long 有一个为int 计算结果提升为int
 * 如果操作数中没有int 均为short或byte 计算结果仍旧提升为int
 *
 * 注意：任何类型与String相加（+）时 实为拼接 其结果自动提升为String
 */
public class 自动类型提升 {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        double c = a+b;
        System.out.println("c等于"+c);

        int d = 5;
        float e = 6.6F;
        float f = d+e;
        System.out.println("f等于"+f);

        int g =100;
        long h =6666666666L;
        long i = g+h;
        System.out.println("i等于"+i);
        String 判断 = i ==999999?"yes":"no";
        System.out.println(判断);

        byte j = 10;
        int k = 20;
        int l = j+k;
        System.out.println("l等于"+l);

        short m = 5;
        byte n = 6;
        int o =m+n;
        System.out.println("o等于"+o);

        //特殊：+拼接字字符串，两个操作数，有一个为String，即完成两者的拼接，结果提升为String。

        int num1 = 123;
        int num2 = 567;
        String str = "abc";
        String newStr = str + num1 + num2;
        //-------------------从左向右-->>>>>>>>>
        System.out.println(newStr);

        String newStr2 = num1 + num2 + str ;//两个操作数为数值时，相加；两个操作数有一个为String时，拼接。
        System.out.println(newStr2);
    }
}
