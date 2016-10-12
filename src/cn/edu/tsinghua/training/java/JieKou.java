package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class JieKou implements JieKouOne ,JieKouTwo ,JieKouThree,JieKouFour {
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int umul(int a, int b) {
        return a/b;
    }

    public static void main(String[] args) {
        JieKou jieKou=new JieKou();
        System.out.println(jieKou.add(10,5));
        System.out.println(jieKou.sub(10,5));
        System.out.println(jieKou.mul(10,5));
        System.out.println(jieKou.umul(12,5));
    }
}
