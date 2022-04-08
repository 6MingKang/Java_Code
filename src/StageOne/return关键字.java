package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/4/1、0:46
 * JavaStudyCode
 * return的两种用法:
 *      应用在具有返回值类型的方法中:
 *          return value;表示结束当前方法 并伴有返回值 返回到方法调用处
 *      应用在没有返回值类型(void)的方法中:
 *      return;表示结束当前方法 直接返回到方法调用处
 *
 * 注意:一个类中可以定义多个方法 方法之间属于并列关系 不可嵌套
 *      一个方法只做一件事
 */
public class return关键字 {
    public static void main(String[] args) {

        //double result = calc(1.5 , 10.2);

        //System.out.println("计算结果：" + result);

        //-------------------------------------------

        //String str = isEven(10);

        //System.out.println(str);

        //-------------------------------------------

        show();


    }


    public static double calc(double a , double b){
        double sum = a + b;
        System.out.println("运算结束");
        return sum;//结束当前方法，并伴有返回值，返回到方法调用处
    }

    public static String isEven(int num){
        if(num % 2 == 0){
            return "偶数";
        }else{
            return "奇数";
        }
    }

    public static void show(){
        for(int i = 1 ; i <= 10 ; i++){
            System.out.println("当前值" + i);
            if(i == 5){
                return;//结束当前方法，返回到方法调用出
            }
        }
        System.out.println("show() .............");

    }
}
