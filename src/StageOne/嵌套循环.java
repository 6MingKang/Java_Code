package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/30、22:07
 * JavaStudyCode
 * 概念:
 *      在一个完整的循环结构中 嵌套另一个循环结构
 */
public class 嵌套循环 {
    public static void main(String[] args) {

        //九九乘法表
        //控制行数
        for (int a = 1; a <= 9; a++) {
            //控制列数
            for (int b = 1; b <= a; b++) {
                int s = a * b;
                System.out.print(b + "*" + a + "=" + s + "\t");

            }
            System.out.println();
        }
    }
}