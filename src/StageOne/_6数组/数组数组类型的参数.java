package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/8、13:50
 * JavaCode
 * 方法调用时:
 *      将nums中的地址赋值给oneArray 此时二者指向同一个数组
 * 传递参数时:
 *      基本类型传递的是变量中的值 引用类型传递的是变量中的地址
 */
public class 数组数组类型的参数 {
    public static void main(String[] args) {

    int[] nums = new int[]{11,22,33,44,55};
    print(nums);

    int[] array = new int[]{66,77,88,99};
    print(array);
    //引用数据类型 赋值也好 传参也好 操作的都是地址

    }

    //写个方法
    //将一段需要重复使用的逻辑代码放在一个函数中 在需要使用的位置进行调用
    //可以遍历所有的int数组
    public static void print(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }

}
