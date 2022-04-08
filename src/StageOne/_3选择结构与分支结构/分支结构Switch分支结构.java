package StageOne._3选择结构与分支结构;

/**
 * Writer:LiuXueKe
 * Time:2022/3/28、19:55
 * JavaStudyCode
 * 语法:
 *      switch(变量|表达式){
 *          case值1:
 *              逻辑代码1;
 *          case值2:
 *              逻辑代码2;
 *          case值n:
 *              逻辑代码n;
 *               default:
 *               为满足时的逻辑代码;
 *      }
 *
 * 可判断的类型:
 *      byte、short、int、char、String（JDK7+）以后
 *
 * 执行流程:
 *      如果变量中的值等于1 则执行逻辑代码1
 *      如果变量中的值等于2 则执行逻辑代码2
 *      如果变量中的值等于n 则执行逻辑代码n
 *      如果变量中的值没有匹配的case值时 则执行default中的逻辑代码
 * 注意:当匹配的case执行后 不会退出整个结构 而是继续向下执行
 *
 * break关键字可在匹配的case执行后 跳出整个结构
 * 适用于等值判断
 */
public class 分支结构Switch分支结构 {
    public static void main(String[] args) {

        /*
        判断一周食谱
        每天吃什么
         */
        /*
        周一：水煮鱼
        周二：麻辣烫
        周三：火锅
        周四：煲仔饭
        周五：火锅
        周六：火锅
        周日：热干面
         */
        int weekDay =1;

        switch(weekDay){
            case 1:
                System.out.println("水煮鱼");            //可判断的类型：byte、short、int、char、String
                break;//跳出整个switch                   //如果变量中的值没有匹配的case值时，执行default中的逻辑代码
            //注意:所有case的取值不可相同
            case 2:
                System.out.println("麻辣烫");           //注意：switch的case被选中后，不会主动跳出这个结构
                break;                                  //需手动追加break，跳出整个switch结构

            case 3:
                System.out.println("火锅");
                break;

            case 4:
                System.out.println("煲仔饭");
                break;

            case 5:
                System.out.println("水饺");
                break;

            case 6:
                System.out.println("蛋炒饭");
                break;

            case 7:
                System.out.println("热干面");
                break;

            default:       //如果没有匹配的case值   则执行default代码
                System.out.println("输入错误，请输入1-7之间的整数");
        }

        System.out.println("程序结束");

    }
}
