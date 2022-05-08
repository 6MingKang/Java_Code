package StageOne._面向对象;

/**
 * Writer:LiuXueKe
 * Time:2022/4/16、17:38
 * Java_Code
 * 属性:通过变量表示 又称实例变量
 * 语法:数据类型 属性名;
 * 位置:类的内部 方法的外部
 *
 * 方法:
 *      通过方法表示 又称实例方法
 *      语法:
 *              public 返回值类型 方法名(形参){
 *                  //方法主体
 *              }
 */
public class 面向对象类的定义 {
    //例如:狗
    String breed;//品种
    int age;//年龄
    String sex;//性别
    String furColor;//毛色

    public void eat(){
        System.out.println("eating......");
    }

    public void sleep(){
        System.out.println("sleeping......");
    }

}
