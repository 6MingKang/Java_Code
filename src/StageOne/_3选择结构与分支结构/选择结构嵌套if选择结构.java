package StageOne._3选择结构与分支结构;

/**
 * Writer:LiuXueKe
 * Time:2022/3/28、19:10
 * JavaStudyCode
 * 语法:
 *      if(外层表达式){
 *          if(内层表达式){
 *              //内层代码块1
 *          }else{
 *              //内层代码块2
 *          }
 *      }else{
 *          //外层代码块
 *      }
 *
 * 执行流程:
 *      当外层条件满足时 再判断内层条件
 *
 * 注意:
 *      一个选择结构中 可以嵌套另一个选择结构
 *      嵌套格式正确的情况下 支持任意组合
 */
public class 选择结构嵌套if选择结构 {
    public static void main(String[] args) {

        //百米赛跑，用时低于10秒，则进入总决赛
        double timer = 10.0;

        char sex = '男';                            //执行流程：
        //当满足外层条件时，再判断内层条件
        if (timer<=10.0){                           //注意：
            //可以进入总决赛                         //一个选择结构中，可嵌套另一个选择结构
            if(sex == '男'){                        //嵌套格式正确的情况下，支持任意组合(if、if else、多重if)
                System.out.println("男子组");       //嵌套结构可能存在因没有缩进而导致的书写串行，进而执行时报错
            }else{
                System.out.println("女子组");
            }

        }else{
            System.out.println("抱歉 淘汰");
        }

    }
}
