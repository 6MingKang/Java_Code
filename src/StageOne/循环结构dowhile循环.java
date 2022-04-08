package StageOne;

import java.util.Scanner;

/**
 * Writer:LiuXueKe
 * Time:2022/3/29、2:12
 * JavaStudyCode
 * 语法:
 *      do{
 *          逻辑代码(循环操作)
 *      }while(布尔表达式);
 *
 * 执行流程:
 *      先执行一次循环操作之后 再进行布尔表达式的判断
 *      如果结果为true 则再次执行循环操作
 *      如果结果为false 才会退出循环操作 执行后续代码
 *
 * 应用场景:适用于循环次数不明确的情况
 * 例如:检查学生作业完成情况 输入教师评语 决定学生是否需要抄写代码
 *
 * 流程说明:
 *      第一步:执行循环体语句(也就是执行 大括号中的实际代码)
 *      第二步:执行条件表达式(也就是执行循环终止的判断条件语句 看其结果是true还是false 如果是false 循环结束 如果是true 继续执行)
 *      第三步:回到第一步再次执行 第一步到第三步 知道某次第一步表达式结果为false
 *
 * 特点和注意事项:
 *      do while循环为先执行后判断 也就是先执行一次循环体中的代码 然后再检查条件表达式 所以do while循环至少会执行一次
 *      其他特点和while循环一样
 */
public class 循环结构dowhile循环 {
    public static void main(String[] args) {
         /*
        适用于循环次数不明确的情况
          */

        int a =1;//初始部分

        do {
            //直接执行循环操作 首次没有入口条件
            System.out.println("Pandect.HelloWorld"+a);
            a++;

        }while(a<=100);//判断满足 则循环 不满足则至少执行一次（执行次数：1~n次）

        System.out.println("程序结束.....");
        Scanner scanner = new Scanner(System.in);


        //在外部声明变量和变量名   局部变量在外部访问不到
        int bianhao;
        //使用do while  让用户输入一次   判断是否输入有误
        do{
            System.out.println("====================欢迎使用ATM自动银行服务====================");
            System.out.println(" 1.开户  2.存款  3.取款  4.转账  5.查询余额  6.修改密码  0.退出");
            System.out.println("=============================================================");
            System.out.println("请输入操作编号：");
            bianhao = scanner.nextInt();
            switch (bianhao) {
                case 1:
                    System.out.println("执行开户功能");
                    break;

                case 2:
                    System.out.println("执行存款功能");
                    break;

                case 3:
                    System.out.println("执行取款功能");
                    break;

                case 4:
                    System.out.println("执行转账功能");
                    break;

                case 5:
                    System.out.println("执行查询余额功能");
                    break;

                case 6:
                    System.out.println("执行修改密码功能");
                    break;

                case 0:
                    System.out.println("退出");
                    break;

                default:
                    System.out.println("输入错误 请重新输入：");
            }

        }while (bianhao<0||bianhao>6);
    }
}
