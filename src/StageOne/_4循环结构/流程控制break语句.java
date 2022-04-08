package StageOne._4循环结构;

/**
 * Writer:LiuXueKe
 * Time:2022/3/30、20:17
 * JavaStudyCode
 * 作用:
 *      break语句用于终止某个语句块的执行
 * 用法:
 *      如果是循环中 作为跳出所在的循环 如果是在switch语句中 则为跳出所在的switch语句
 *
 * 其他说明:
 *      使用label标签实现跳出置指定的循环
 *
 * 详见举例说明在TestCode包内:break测试
 */
public class 流程控制break语句 {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (j==2){
                    break;//跳出内层循环 进行下一次外层循环
                }
                System.out.println(i+""+j);
            }

        }
    }
}
