package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/31、21:48
 * JavaStudyCode
 * 返回值
 * 概念:
 *      方法执行后的返回结果
 *      方法执行后 一些情况下无需返回结果;另一些情况下则必须返回结果
 *
 * 例如:
 *      银行:
 *      存款操作 无需返回结果
 *      取款操作 必须返回结果
 *
 * 定义语法:
 *      public static 返回值类型 方法名称(形式参数列表){
 *          //方法主体
 *          return value;//返回值
 *      }
 *      规定返回值的具体类型(基本、引用、void)
 *      根据需求返回一个结果(值)
 *
 * 调用语法:
 *      变量 = 方法名称();
 *      变量类型与返回值一直
 */
public class 方法返回值与返回值类型 {
    public static void main(String[] args) {

        //需求:定义方法 计算两个整数的和 并返回结果 在main中打印
        //声明int变量a1 值等于:调用方法 分别输入两个参数 两个参数的和 等于a1的值
        int a1 = he(1,2);
        //打印输出
        System.out.println(a1);

        //声明int变量a2 值等于:调用方法 第一个参数使用a1(同类型) 第二个参数20 相加等于a2的值
        int a2 = he(a1,20);
        System.out.println(a2);
    }

    //定义方法 用来计算两个变量的总数
    //作用:相加求和
    public static int he(int a , int b ){
        //两个传入的参数相加 保存到int类型的zongshu中
        int zongshu = a+b;
        //返回zongshu
        return zongshu;
    }


}
