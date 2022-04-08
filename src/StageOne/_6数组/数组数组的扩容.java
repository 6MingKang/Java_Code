package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/3、10:34
 * JavaCode
 * 创建数组时 必须显示指定长度 并在创建之后不可更改长度
 * 扩容的思路:
 *      创建大于原数组长度的新数组
 *      将原数组中的元素依次复制到新数组中
 *      old 11 22 33 44 55
 *          ↓   ↓  ↓  ↓  ↓
 *      new 11 22 33 44 55 0 0 0 0 0
 *
 * 复制的方式
 *      循环将原数组中所有元素逐一赋值给新数组
 *      System.arraycopy(原数组,原数组起始,新数组,新数组起始,长度)
 *      Java.util.Arrays.copyOf(原数组,新长度)//返回带有原值的新数组
 *
 */
public class 数组数组的扩容 {
    public static void main(String[] args) {

        //第一种扩容方式
        //循环将原数组中所有元素逐一复制给新数组
        int[] nums = new int[5];//数组创建之后 长度不可变
        nums[0]=11;
        nums[1]=22;
        nums[2]=33;
        nums[3]=44;
        nums[4]=55;
        //创建一个比原数组大的新数组
        int[] newNums = new int[nums.length*2];
        //复制原数组中所有的数据到新数组
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = nums[i];
        }
        //遍历原数组
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"\t");
        }
        System.out.println();
        //遍历新数组
        for (int i = 0; i < newNums.length; i++) {
            System.out.print(newNums[i]+"\t");
        }
        System.out.println();


        //第二种扩容方式
        //System.arraycopy(原数组,原数组起始,新数组,新数组起始,长度)
        int[] nums2 = new int[5];//创建一个长度为5的数组 长度不可变
        nums2[0]=11;
        nums2[1]=22;
        nums2[2]=33;
        nums2[3]=44;
        nums2[4]=555;
        //复制的赋值
        //创建新的数组
        int[] newNums2 = new int[nums2.length*2];
        //使用System.arraycopy(原数组,原数组起始下标,新数组,新数组的起始存储下标.需要赋值的个数或长度)
        System.arraycopy(nums2,0,newNums2,0,nums2.length);
        //遍历新数组
        for (int i = 0; i < newNums2.length; i++) {
            System.out.print(newNums2[i]+"\t");
        }
        System.out.println();


        //第三种扩容方式
        int[]nums3 = new int[5];//创建数组之后 长度不可变
        nums3[0]=11;
        nums3[1]=22;
        nums3[2]=33;
        nums3[3]=44;
        nums3[4]=555;
        //创建新数组 复制元素
        int[] newNums3 = java.util.Arrays.copyOf(nums3,nums3.length*5);//将带有原值的新数组返回
        //遍历
        for (int i = 0; i < newNums3.length; i++) {
            System.out.print(newNums3[i]+"\t");
        }

    }
}
