package StageOne._3选择结构与分支结构;

/**
 * Writer:LiuXueKe
 * Time:2022/3/28、12:08
 * JavaStudyCode
 * 语法:
 *      if(布尔表达式){
 *          //代码块1
 *      }else{
 *          //代码块2
 *      }
 *
 * 执行流程
 *      对布尔表达式进行判断
 *      结果为true 则先执行代码块1 再退出整个结构 执行后续代码
 *      结果为false 则先执行代码块2 再退出整个结构 执行后续代码
 */
public class 选择结构ifelse选择结构 {
    public static void main(String[] args) {

        //定义变量
        double a = 98.0;
        //进行布尔判断
        if(a==98.0){

            System.out.println("OH YES");//代码块1

        }else{

            System.out.println("OH NO");//代码块2
        }

        System.out.println("程序结束");

    }
}
