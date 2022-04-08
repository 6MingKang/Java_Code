package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/31、14:34
 * JavaStudyCode
 * 方法的概念:
 *      实现特定功能的一段代码 可反复使用
 *
 * 方法的好处:
 *      减少代码冗余
 *      提高复用性
 *      提高可读性
 *      提高可维护性
 *      方便分工合作
 *
 * 定义语法:
 *      public static void 方法名称(){
 *          //方法体
 *      }
 *
 * 定义位置:
 *      定义在类的内部 与main方法并列
 *
 * 方法的使用:
 *      在需要使用的位置通过方法名称调用
 *
 * 注意:
 *      调用方法时 会优先执行方法内部代码 结束后 返回到方法调用处 继续向下执行
 */
public class 方法方法的定义 {
    public static void main(String[] args) {

        //方法放在需要使用的位置 会按照顺序执行
        System.out.println("Hello World1");
        方法();
        System.out.println("Hello World2");
        方法();
        System.out.println("Hello World3");
        方法();

    }

    //在类的内部 与主方法并列
    public static void 方法(){
        System.out.println("我是个方法");
    }


}
