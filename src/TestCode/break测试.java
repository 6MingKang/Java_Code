package TestCode;

import java.util.Scanner;

/**
 * Writer:LiuXueKe
 * Time:2022/3/30、20:25
 * JavaStudyCode
 *
 * 测试break 跳出  (排除闰年的情况下每个月有多少天)
 */
public class break测试 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个月份");
        int yue = scanner.nextInt();
        switch (yue){
            case 1:
                System.out.println("31");
                break;
            case 2:
                System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
            default:
                System.out.println("很抱歉没有这个月份");
                break;
        }


    }
}
