package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/25、20:55
 * JavaStudyCode
 * 变量的定义流程：
 * 声明：数据类型 变量名；int money；（开辟整数变量空间）
 * 赋值：变量名 = 值； money = 100；（将整数值赋给变量）
 * 应用：System.out.println（money）；
 *
 * Java是强类型语言 变量的类型必须与数据的类型一致
 */
public class 变量的定义流程 {
    public static void main(String[] args) {
        //声明变量，语法：数据类型 变量名;
        int money; //在内存中开辟了一块整数空间

        //赋值，语法：变量名 = 值;
        money = 100; //将100赋值给money变量空间

        System.out.println(money); //打印变量中的值

        System.out.println("money"); //打印文本

        System.out.println("综上所述");
    }
}
