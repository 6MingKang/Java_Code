package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、20:52
 * JavaStudyCode
 * 逻辑运算符：两个boolean类型的操作数或表达式进行逻辑比较
 */
public class 运算符逻辑运算符 {
    public static void main(String[] args) {

		/*
		逻辑运算符 两个boolean类型的操作数或表达式进行逻辑比较
		-------------------------------------
				语义							描述
     	&&		与（并且）		两个操作数 同时为真 结果为真
		||		或（或者）		两个操作数 有一个为真 结果为真
		！		非（取反）		意为“不是” 真即是假 假即是真
		-------------------------------------
		*/
        boolean j = 15<20;

        boolean k =50>10;

        System.out.println( j && k );//两个操作数同时为真

        int javaScorc = 100;

        int webScorc = 95;

        //两个操作数同时为真结果为真(true)
        System.out.println(javaScorc == 100 && webScorc == 95);

        //个操作数有一个为真时 结果为真(true)
        System.out.println(javaScorc == 100 || webScorc == 100);

        //------------------------------------------------------------------------------

        int javaScore = 100;

        int webScore = 99;

        //比较两者是否相等
        System.out.println( javaScore == webScore);


        //别分判断二者是否为满分
        System.out.println( javaScore == 100);
        System.out.println( webScore == 100);


        //一次性判断二者是否均为满分

        //									false
        //					   true			  &&		false     两个表达式同时为真
        System.out.println( javaScore == 100  && webScore == 100 );



        //一次性判断二者是是否有一个满分

        //														true
        //						 true		  ||	   false
        System.out.println( javaScore == 100  ||  webScore == 100 );



        boolean result = javaScore == 100;

        //Java的成绩是满分吗？
        System.out.println(result);//true

        //Java的成绩不是满分吗？
        System.out.println( !result );//false
    }
}
