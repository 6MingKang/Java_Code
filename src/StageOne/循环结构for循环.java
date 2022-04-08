package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/30、21:42
 * JavaStudyCode
 * 语法:
 *      for(初始部分;循环条件;迭代部分){
 *          //循环操作
 *      }
 * 执行流程:
 *      首次执行初始部分(仅一次)
 *      对布尔表达式进行判断 结果为true 则执行逻辑代码
 *      本次执行完毕后 执行迭代部分 再次判断 结果仍旧为true 则再次执行逻辑代码
 *      直至布尔表达式结果为false时 才会退出循环结构 执行后续代码
 *
 * 特点:
 *      首次即有入口条件 先判断、再执行 适用于循环次数明确的情况
 *
 * 详见TestCode包里:算5名同学的平均分
 */
public class 循环结构for循环 {
    public static void main(String[] args) {

        //需求:打印100次Hello World
        for (int i = 0; i <= 100; i++) {
            System.out.println("第"+i+"次Hello World");
        }
        System.out.println("循环结束");
    }
}
