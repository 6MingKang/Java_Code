package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/11、1:33
 * Java_Code
 * 二维数组的概念:
 *      一维数组中的一维数组;数组中的元素还是数组
 */
public class 数组二维数组的赋值及访问 {
    public static void main(String[] args) {
        int[][] array = new int[3][5];
        array[0][0] = 10;//第一行第一列                //使用双下表访问二维数组中的元素
        array[0][3] = 20;//第一行第四列                //第一个下标代表:行号(高维下标)
        array[1][0] = 30;//第二行第一列                //第二个下标代表:列号(低维下标)
        array[1][1] = 40;//第二行第二列
        array[2][2] = 50;
        array[2][4] = 60;
        //遍历二维数组
        //外层控制行数
        for (int i = 0; i < array.length; i++) {
            //内层控制列数
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println(array.length);//array变量中 所持有的地址对应的数组长度是多少 = 3
        System.out.println(array[0].length);//array[0] 高维数组中的第一个元素所指向的低维数组的长度
        System.out.println(array[0]);//长度5 先创建了长度为5的低维数组 将地址赋值给了高维数组
        System.out.println(array[1]);
        System.out.println(array[2]);



    }
}
