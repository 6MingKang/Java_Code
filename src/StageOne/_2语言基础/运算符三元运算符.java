package StageOne._2语言基础;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、20:54
 * JavaStudyCode
 * 三元运算符：将判断后的结果赋值给变量
 */
public class 运算符三元运算符 {
    public static void main(String[] args) {

        /*
		三元运算符 将判断后的结果赋值给变量
		-------------------------------------
						语义											描述
		?:	布尔表达式?结果一:结果二		当表达式结果为真 获得结果一
											当表达式结果为假 获得结果二
		-------------------------------------
		*/

        double scorc = 100.0;
        //三元运算符可以进行逻辑判断
        System.out.println(scorc == 100? "真棒":"加油");

        //三元运算符可以在判断后为变量赋值
        String result = scorc == 100? "真棒":"加油";
        System.out.println(result);

        //-----------------------------------------------------------------

        //1.判断
        //2.赋值
        //布尔表达式 ? 值1 : 值2

        int javaScore = 100;

        String result1 = javaScore == 100 ? "恭喜" : "加油" ;

        System.out.println(result1);


        int webScore = 99;

        int result2 = webScore == 100 ? 666 : 111;

        System.out.println(result2);
    }
}
