package TestCode;

/**
 * Writer:LiuXueKe
 * Time:2022/4/7、22:23
 * JavaCode
 */
public class 数组扩容和地址替换测试 {
    public static void main(String[] args) {

        //创建一个长度为5数组
        int[] nums = new int[5];
        nums[0]=1;
        nums[1]=2;
        nums[2]=3;
        nums[3]=4;
        nums[4]=5;
        //创建一个新数组用来"扩容"
        int[] newNums = new int[nums.length*5];

        //复制数组
        for (int i = 0; i < nums.length; i++) {
            //用i代表下标
            newNums[i]=nums[i];
        }
        //遍历原始数组
        for (int i = 0; i <nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
        //遍历新数组
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i]+"\t");
        }
        //地址替换
        nums=newNums;

        System.out.println();
        //给"扩容"后的数组添加元素
        nums[5]=6;
        //输出测试是否添加成功
        System.out.println(nums[5]);
        //遍历扩容后的数组
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
    }
}
