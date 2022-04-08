package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/25、19:45
 * JavaStudyCode
 * 作用：类似于文件夹，用于管理字节码（.class）文件。
 * 语法：package 包名。
 * 位置：必须写在源文件的第一行。
 * 带包编译：javac -d . 源文件名称.java （自动生成目录结构）。
 * 带包运行：java 包名.类名 （包名+类名又称全限定名）。
 * 采用域名倒置的规则：www.baidu.com.cn -> cn.com.baidu.xxx。
 * 例如：cn.com.company.department.group.project. module.XxxClass。
 */
public class Package包 {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}
