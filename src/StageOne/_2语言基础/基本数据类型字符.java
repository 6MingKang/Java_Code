package StageOne._2语言基础;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、19:40
 * JavaStudyCode
 * 前置知识：
 *      ASCII(American Standard Code for Information Interchange)美国信息交换标准码
 *      基于拉丁字母的一套电脑编码系统 主要用于显示现代英语和其他西欧语言
 *      ASCII是最通用的信息交换标准 为英文字符设定了统一并且唯一的二进制编码
 *
 * Unicode编码
 *      Unicode(万国码)是计算机科学领域里的一项业界标准 包括字符集、编码方案等
 *      它为每种语言中的每个字符设定了统一并且唯一的二进制编码
 *      以满足跨语言、跨平台进行文本转换、处理的要求（其中包含了ASCII编码）
 *
 * Unicode中每个字符都对应一个二进制整数，可以使用多种方式赋值
 *      字符赋值：char c1 = 'A';（通过''描述为字符赋值）
 *      整数赋值：char c2 = 65;（通过十进制数65在字符集中对应的字符赋值）
 *      进制赋值：char c3 = '\u0041';（通过十六进制数41在字符集中所对应的字符赋值）
 *
 * 如果需要在程序中输出一个单引号字符 该如何完成?
 * 为了解决这一问题 Java采用了转义字符来表示单引号和一些特殊符号
 */
public class 基本数据类型字符 {
    public static void main(String[] args) {

        //char 类型只能用正整数  赋值加单引号
        //字符直接赋值
        char a = 'A';
        System.out.println(a);

        //整数 对应ASCII编码赋值 不用加单引号  输入整数直接赋值
        char a1 =65;
        System.out.println(a1);

        //整数 十六进制整数赋值 赋值加单引号
        char a2 ='\u0041';
        System.out.println(a2);

        System.out.println("-------------------");

        char A ='你';
        System.out.println(A);
        char A1 = '好';
        //加入（int）可得知对应的Unicode编码(万国码)是多少
        System.out.println((int)A1);

        System.out.println("-------------------");

        char A2 =25105;
        char A3 =21916;
        char A4 =27426;
        char A5 =20320;

        System.out.println(A2);
        System.out.println(A3);
        System.out.println(A4);
        System.out.println(A5);

        System.out.println("------------------------------------------------------------");

        char B1= 65;

        short B2= -1;//将B2赋值给char

        //不可以直接把short的值给char

        // 正常编译 编译器会报错 编译无法通过
        char B3 = (char)B2;//强制编译如果是整数编译通过显示结果       如果是负数 则会用？替代  显示？

        //char B3 = (char)B2;   强制赋值
        System.out.println(B3);

        //char支持  将本身具有特殊含义的字符  转换成  普通字符
        //char支持   将普通字符  转换成 本身具有特殊含义的字符
        //   \' \" \\ \t(缩进) \n(换行)

    }
}
