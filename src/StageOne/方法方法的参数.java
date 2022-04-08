package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/31、14:43
 * JavaStudyCode
 * 方法的参数:
 *      多数情况下 方法与调用者之间需要数据的交互 才能使方法完成相应的功能
 *      调用方法时 所传入的数据被称为"参数"
 * 形参与实参:
 * 定义语法:
 *      public static void 方法名称(形式参数){
 *          //方法主体
 *      }
 *
 * "形参"等价于"局部变量的声明"
 * "实参"等价于"局部变量的赋值"
 * 调用语法
 *      方法名称(实际参数)
 *
 * 方法的参数可以让代码功能更灵活 普适性更高 易于修改及维护
 */
public class 方法方法的参数 {
    public static void main(String[] args) {

        //单个参数
        //需求:在多次调用方法时 可以打印不同次数的减号
        System.out.println("床前明月光");
        ff(1);
        System.out.println("疑是地上霜");
        ff(2);
        System.out.println("举头望明月");
        ff(3);
        System.out.println("低头思故乡");
        ff(4);



        //多个参数
        ff2(5,"+++");






    }
    //创建一个名叫ff 类型为int的方法
    public static void ff(int sl){
        //循环  使用上面int类型的sl 来接收要输出多内容 用来比较
        for (int i = 0; i < sl; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void ff2(int a ,String b){
        for (int i = 0; i < a; i++) {

            System.out.println(b);

        }

    }

}
