package StageOne._3选择结构与分支结构;

/**
 * Writer:LiuXueKe
 * Time:2022/3/28、11:59
 * JavaStudyCode
 * 概念:根据已知条件进行逻辑判断 满足条件后执行相应操作
 * 语法:
 *      if(布尔表达式){
 *             //代码块
 *      }
 * 执行流程:
 *      对布尔表达式进行判断
 *      结果为true 则先执行代码块 再执行后续代码
 *      结果为false 则跳过代码块 直接进行后续代码
 */
public class 选择结构基本if选择结构 {
    public static void main(String[] args) {

        //定义一个变量
        double a = 100.0;

        //选择  判断变量是否为100  正确将进行下一步运行   错误则跳过
        if (a == 100.0){

            System.out.println("恭喜");

        }

        System.out.println("程序结束............");

    }
}
