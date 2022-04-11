package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/8、21:15
 * Java_Code
 * 冒泡排序:
 *      相邻的两个数值比较大小 互换位置
 * 选择排序
 *
 * JDK排序
 *
 *      未完待续.....
 */
public class 数组数组的排序 {
    public static void main(String[] args) {
        int[] nums={189,1,65,1,84,48,11,891,891,89};
        //冒泡排序 相邻的两个数值比较大小 互换位置

        //两值互换
        int a = 10;
        int b = 20;
        //需要一个中间值   例如:两杯水互换 需要第三个杯子
        int temp =a;//temp=10
        a=b;//a=20
        b=temp;//b =temp
        System.out.println(a+"\t"+b);

    }
}
