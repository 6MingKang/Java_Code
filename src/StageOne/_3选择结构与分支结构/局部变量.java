package StageOne._3选择结构与分支结构;

/**
 * Writer:LiuXueKe
 * Time:2022/3/29、1:52
 * JavaStudyCode
 * 概念:
 *      生命在方法内中的变量 必须先赋值再使用
 *
 * 作用范围:
 *      定义开始到所在的代码块结束
 */
public class 局部变量 {
    public static void main(String[] args) {
        int a =10;

        System.out.println(a);

        if (a==10){
            int b = 20;
            System.out.println(a);
            System.out.println(b);
        }
        //   System.out.println(b);
        //局部变量只能在定义开始到结束之间使用
        //例如：主函数变量里的  int  a  可以在if代码块中使用   但if代码块里的 int b 不可超出当前if代码块
    }
}
