package StageOne;

import java.util.Scanner;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、21:02
 * JavaStudyCode
 * 程序运行中，可在控制台（终端）手动录入数据，再让程序继续运行。
 *
 * 导包语法：import 包名.类名;//将外部class文件的功能引入到自身文件中。
 *
 * 使用顺序：
 * 导入 java.util.Scanner。
 * 声明 Scanner 类型的变量。
 * 使用Scanner类中对应的方法（区分类型）：
 * .nextInt(); //获得整数
 * .nextDouble(); //获得小数
 * .next(); //获得字符串
 * .next().charAt(0);//获得单个字符
 *
 * 如果输入了不匹配的数据，则会产生 java.util.InputMismatchException。
 */
public class 控制台录入 {
    public static void main(String[] args) {
        //数据类型 变量名 = 值；
        //声明Scanner
        Scanner input = new Scanner(System.in);//引用数据类型的声明方式

        //作用：可以在控制台接收一个整数的值，并保存在变量中。

        //整数
        System.out.println("请输入一个整数：");
        //使用：基于Scanner类型的变量名 .nextInt();
        int i = input.nextInt();
        System.out.println("您输入的整数为：" + i );

        //小数
        System.out.println("请输入一个小数");
        double n = input.nextDouble();
        System.out.println("您输入的小数为：" + n );

        //字符串
        System.out.println("请输入一句话");
        String o = input.next();
        System.out.println("您输入了：" + o );

        //字符
        System.out.println("请输入一个值");
        char p = input.next().charAt(0);
        System.out.print("值：" + p);
    }
}
