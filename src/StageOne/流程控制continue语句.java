package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/30、21:33
 * JavaStudyCode
 * 作用:
 *      跳过本次循环 执行下一次循环(如果有多重循环 默认继续执行离自己最近的循环) 提前终止本次循环
 * 使用:
 *      只能在循环结构中使用
 * 其他说明:
 *      使用label标签改变继续执行的循环
 */
public class 流程控制continue语句 {
    public static void main(String[] args) {

        //当i==2时 跳过本次循环 不进行打印输出
        for (int i = 0; i < 4; i++) {
            if (i==2){
                continue;
            }
            System.out.println("i="+i);
        }
    }
}
