package TestCode;

import java.util.Scanner;

/**
 * Writer:LiuXueKe
 * Time:2022/3/29、1:39
 * JavaStudyCode
 */
public class 一周食谱 {
    public static void main(String[] args) {

        //写个食谱 帮助选择一周吃什么
        Scanner scanner = new Scanner(System.in);

        System.out.println("请按照日期输入");
        int select = scanner.nextInt();

        switch (select){
            case 1:
                System.out.println("老八秘制小汉堡");
                break;
            case 2:
                System.out.println("小鸟伏特加豪华大礼包");
            default:
                System.out.println("输入错误SB");
        }
        System.out.println("程序结束");
    }
}
