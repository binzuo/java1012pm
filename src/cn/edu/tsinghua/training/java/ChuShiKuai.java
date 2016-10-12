package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class ChuShiKuai {
    {
        int a=6;
        if (a>4){
            System.out.println("局部变量a的值大于4");
        }
        System.out.println("初始化块");
    }
    {
        System.out.println("第二个初始化块");
    }
    public ChuShiKuai(){
        System.out.println("无参构造方法");
    }

    public static void main(String[] args) {
        //ChuShiKuai chuShiKuai=new ChuShiKuai();
    }
}
