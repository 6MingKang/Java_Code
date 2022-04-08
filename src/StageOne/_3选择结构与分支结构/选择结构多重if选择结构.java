package StageOne._3选择结构与分支结构;

/**
 * Writer:LiuXueKe
 * Time:2022/3/28、19:01
 * JavaStudyCode
 * 语法:
 *      if(布尔表达式1){
 *          //代码块1
 *      }else if(布尔表达式2){
 *          //代码块2
 *      }else if(布尔表达式3){
 *          //代码块3
 *      }else{
 *          代码块4
 *      }
 *
 * 执行流程:
 *      表达式1为true 则执行代码块1 再退出整个结构
 *      表达式2为true 则执行代码块2 再退出整个结构
 *      表达式3为true 则执行代码块3 再退出整个结构
 *      表达式4为true 则执行代码块4 再退出整个结构
 *
 * 注意:相互排斥 有一个为true 其他均不执行
 *      适用于区间判断 但要保证条件顺序(从大到小或从小到大)
 */
public class 选择结构多重if选择结构 {
    public static void main(String[] args) {

        /*
        例：购车
		根据自己的钱去购车

		如果有五百万，买劳斯莱斯
		否则 如果有一百万 买GTR
		否则 如果有五十万 买奔驰E
		否则 如果有二十万 大众帕萨特
		否则 如果有十万   哈弗H6
		否则 如果有五万   奇瑞QQ
		否则 如果有一万   电动车
		否则 捷安特自行车
         */
        int money = 10;//万元

        if(money >= 500){
            System.out.println("劳斯莱斯");
        }else if(money>=100){
            System.out.println("GTR");
        }else if(money>=50){
            System.out.println("奔驰E");
        }else if(money>=20){
            System.out.println("大众帕萨特");
        }else if(money>=10){
            System.out.println("哈弗H6");
        }else if(money>=5){
            System.out.println("奇瑞QQ");
        }else if(money>=1){
            System.out.println("电动车");
        }else{
            System.out.println("捷安特自行车");
        }
        //相互排斥，当有一个条件满足为true时，其他均不再执行，使用于区间判断（区间条件：遵循从大到小或从小到大）
        System.out.println("程序结束....");
    }
}
