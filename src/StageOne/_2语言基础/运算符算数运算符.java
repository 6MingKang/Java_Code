package StageOne._2语言基础;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、20:32
 * JavaStudyCode
 * 算数运算符:两个操作数进行计算
 * 算术运算符:一元运算符(只有一个操作数)
 */
public class 运算符算数运算符 {
    public static void main(String[] args) {

        int a = 123;
        int b = 77;
        System.out.println(a+b);
        System.out.println(123+177);

		/*
		算数运算符 两个操作数进行计算
		-------------------
		+  加 求和
		-  减 求差
		*  乘 求积
		/  除 求商
	    %  模 求余
		-------------------

		算术运算符 一元运算符（只有一个操作数）
		-------------------
		++ 递增 变量值+1
		-- 递减 变量值-1
		-------------------
		//前++ ：先++，再打印自增后的值
        //后++ ： 先打印当前值，再++
		*/

        int c = 10;
        System.out.println(++c);//先加 再打印

        int d = 10;
        System.out.println(d++);//先打印 再加
        System.out.println(d);
    }
}
