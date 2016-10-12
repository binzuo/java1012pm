package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
public class DuoTai extends JiBaseClass {
    public String book="Android江湖";
    public void test(){
        System.out.println("子类重写父类的方法");
    }
    public void sub(){
        System.out.println("子类的普通方法");
    }

    public static void main(String[] args) {
        JiBaseClass jiBaseClass=new JiBaseClass();
        System.out.println(jiBaseClass.book);
        jiBaseClass.base();
        jiBaseClass.test();//父类的被覆盖的方法
        DuoTai duoTai=new DuoTai();
        System.out.println(duoTai.book);
        duoTai.test();
        duoTai.sub();
        JiBaseClass jiBaseClass1=new DuoTai();
        System.out.println(jiBaseClass1.book);//6
        jiBaseClass1.base();//父类的普通方法
        jiBaseClass1.test();//子类重写父类的方法。
        //jiBaseClass1.sub();
    }
}
