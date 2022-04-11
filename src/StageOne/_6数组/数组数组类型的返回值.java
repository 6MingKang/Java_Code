package StageOne._6数组;

/**
 * Writer:LiuXueKe
 * Time:2022/4/8、16:56
 * Java_Code
 * 调用数组类型的返回值的方法时 方法执行后 返回的是数组的地址
 */
public class 数组数组类型的返回值 {
    public static void main(String[] args) {
        int[] a = new int[]{11,22,33,44,55};
        int[] a2 = ff(a);

        for (int i = 0; i < a2.length; i++) {
            System.out.println(a2[i]);
        }
    }

    //方法
    //用来扩容   从外部接收数组  然后扩容 替换值(赋值)
    public static int[] ff(int[]a){
        int[] a2 = new int[a.length*2];
        for (int i = 0; i < a.length; i++) {
            a2[i]=a[i];
        }
        return a2;
    }

}
