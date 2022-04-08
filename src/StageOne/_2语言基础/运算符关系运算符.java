package StageOne._2语言基础;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、20:49
 * JavaStudyCode
 * 关系运算符：两个操作数进行比较
 */
public class 运算符关系运算符 {
    public static void main(String[] args) {

        /*
		关系运算符 两个操作数进行比较
		-------------------------------------
		>  	大于
		<  	小于
		>=	大于等于
		<=	小于等于
		==	等于
		!=		不等于
		-------------------------------------
		*/
        int h = 10;
        int i = 20;
        System.out.println(h<i);


        int a = 10;
        int b = 6;

        System.out.println( a > b );
        System.out.println( a < b );


        System.out.println( a >= b );
        System.out.println( a <= b );


        System.out.println( a == b );
        System.out.println( a != b );
    }
}
