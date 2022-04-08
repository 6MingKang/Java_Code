package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/7、21:57
 * JavaCode
 * 地址的替换:
 *      数组作为引用类型之一 其变量中存储的是数组的地址
 *      完成元素复制后 需将新数组地址 复制给原变量进行替换
 *
 * 详见:数组扩容和地址替换测试
 */
public class 数组地址替换 {
    public static void main(String[] args) {

        int[] nums = new int[]{11,22,33,44,55};//[I@1b6d3586
        int[] newNums = new int[]{11,22,33,44,55,0,0,0,0,0};//[I@4554617c

        //地址替换
        nums=newNums;

        //插入新值
        nums[5] = 66;

        //遍历数组
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }



}
