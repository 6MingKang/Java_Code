package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/8、17:38
 * Java_Code
 * 概念：可接收多个同类型实参 个数不限 使用方式与数组相同
 * 语法：数据类型... 形参名 //必须定义在形参列表的最后 且只能有一个
 * 使用方式与数组没有差别
 */
public class 数组可变长参数 {
    public static void main(String[] args) {

        int[] numbers = {11,22,33,44,55};
        //1.支持传递数组类型的实参
        ff(numbers);
        //2.支持传递零散数据的参数
        ff(1,2,3,4,5,6,7,8,97,9,44,84,84,84,84,84,84,84,651,51,1,581,881);
    }

    //函数的参数是"可变长参数"     更为灵活    但是必须类型相同
    public static void ff(int...arr){//int[]arr
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

    //前面是长度  后面是值
    public static int[] ff2(int length, int...arr){
        int[] newNums = new int[length];
        System.arraycopy(arr,0,newNums,0,arr.length);
        return newNums;
    }
}
