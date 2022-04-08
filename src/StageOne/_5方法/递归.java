package StageOne._5方法;

/**
 * Writer:LiuXueKe
 * Time:2022/4/1、1:45
 * JavaStudyCode
 * 什么是递归:
 *      解决具有既定规律的问题时 在方法内部再次调用自身方法的一种编程方式
 * 何时使用递归:
 *      当需要解决的问题可以拆分成若干个小问题 大小问题的解决方式相同 方法中自己调用自己
 *      使用循环解决的常规问题 都可以替换为递归解决
 * 如何正确使用递归:
 *      设置有效的出口条件 可以让调用的链上的每个方法都可以正确返回 避免无穷递归
 */
public class 递归 {
    public static void main(String[] args) {

        //需求:使用递归 完成斐波那契数列
        //0 1 1 2 3 5 8 13 21 34 55
        int a = fbnq(6);
        System.out.println(a);
    }

    public static int fbnq(int n ){
        if (n == 0){
            return 0 ;

        }else if (n == 1){
            return 1;
        }
        return fbnq(n-1) + fbnq(n-2);
    }
}
