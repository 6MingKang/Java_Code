package StageOne._2语言基础;

/**
 * Writer:LiuXueKe
 * Time:2022/3/25、20:57
 * JavaStudyCode
 * 变量的定义方式：
 * 声明变量的3种方式：
 * （1）先声明 再赋值
 *      数据类型 变量名；
 *      变量名 = 值；
 *
 * （2）声明并赋值
 *      数据类型 变量名 = 值；
 *
 * （3）多个同类型变量的声明与赋值
 *      数据类型 变量1，变量2，变量3 = 值3，变量4，变量5 = 值5；
 */
public class 变量的定义方式 {
    public static void main(String[] args) {

        //先声明再赋值
        int a;
        a = 10;
        System.out.println(a);

        //声明并赋值
        int a2 = 10;
        System.out.println(a2);

        //同时声明多个同类型的变量
        int a3,a4,a5 = 10,a6 = 20;
        a3 = 10;
        a4 = 10;
        System.out.println(a3);
        System.out.println(a4);
        System.out.println(a5);
        System.out.println(a6);
    }
}
