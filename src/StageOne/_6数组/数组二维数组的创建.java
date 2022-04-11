package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/11、1:14
 * Java_Code
 * 创建语法:
 *      先声明 再分配空间:
 *          数组类型[][]数组名;
 *          数组名 = new 数据类型[高维长度][低维长度];
 *      声明并分配空间:
 *          数据类型[][] 数组名 = new 数据类型[高维长度][低维长度];
 *      声明并赋值(繁):
 *          数据类型[][]数组名 = new 数据类型[][];(不规则数组 自行new低维数组)
 *      声明并赋值(简):
 *          数据类型[][] 数组名 = {{v1,v2,v3},{v4,v5},{v6,v7,v8,v9}};(显示初始化)
 */
public class 数组二维数组的创建 {
    public static void main(String[] args) {

        int[][] array = new int[3][];//只有高维空间 没有低维空间
        array[0] = new int[5];
        array[1] = new int[3];
        array[2] = new int[7];

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[0].length);
        System.out.println(array[1].length);
        System.out.println(array[2].length);

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }

        //显示初始化
        int[][] numbers = {{1,2,3},{4,5,6,7},{8,9}};
        System.out.println(numbers.length);
        System.out.println("----------------------");
        System.out.println(numbers[0].length);
        System.out.println(numbers[1].length);
        System.out.println(numbers[2].length);
        System.out.println(numbers[0][2]);
    }
}
