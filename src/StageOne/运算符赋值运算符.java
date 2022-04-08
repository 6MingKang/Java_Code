package StageOne;

/**
 * Writer:LiuXueKe
 * Time:2022/3/26、20:37
 * JavaStudyCode
 * 赋值运算符：等号右边赋值给等号左边
 */
public class 运算符赋值运算符 {
    public static void main(String[] args) {

        /*赋值运算符 等号右边赋值给等号左边
		-------------------------------------
		= 	直接赋值
		+=	求和后赋值
		-=	球差后赋值
		*=	求积后赋值
		/=	求商后赋值
		%=	求余后赋值
		-------------------------------------
		*/
        int e = 10;       //直接赋值
        e = e+5;
        System.out.println(e);

        int f = 10;
        f +=5;
        System.out.println(f);

        int g = 20;
        g %= 3;
        System.out.println(g);
    }
}
