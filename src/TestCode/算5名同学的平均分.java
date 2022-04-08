package TestCode;

import java.util.Scanner;

/**
 * Writer:LiuXueKe
 * Time:2022/3/30、21:51
 * JavaStudyCode
 */
public class 算5名同学的平均分 {
    public static void main(String[] args) {
        //导包使用Scanner 用来输入每个同学的分数
        Scanner scanner = new Scanner(System.in);
        //分数有可能是有0.5这样的带小数的分数  所以用double来存总分数
        double zongfen = 0;
        //循环 用来分别输入每一个同学的分数
        //一共有5名同学
        for (int i = 1; i <= 5; i++) {
            //提示输入第X位同学的分数
            System.out.println("请输入第"+i+"位同学的分数");
            //此处也是使用double类型 因为可能存在小数
            double fenshu = scanner.nextDouble();
            //总分数等于 每位同学的分数相加
            zongfen = zongfen+fenshu;
        }
        //平均分 总分数除以人数
        double PJF = zongfen/5;
        System.out.println("平均分是"+PJF);
    }
}
