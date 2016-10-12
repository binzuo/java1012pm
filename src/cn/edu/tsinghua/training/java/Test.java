package cn.edu.tsinghua.training.java;

/**
 * Created by Administrator on 2016/10/12 0012.
 */
class Exercise {
    static {
        System.out.println("Exercise的静态初始块");
    }

    {
        System.out.println("Exercise的非静态初始块");
    }

    public Exercise() {
        System.out.println("Exercise的无参构造器");
    }
}
class ExerciseFirst extends Exercise {
    static {
        System.out.println("ExerciseFirst的静态初始块");
    }

    {
        System.out.println("ExerciseFirst的非静态初始块");
    }

    public ExerciseFirst() {
        System.out.println("ExerciseFirst的无参构造器");
    }

    public ExerciseFirst(String name) {
        this();
        System.out.println("ExerciseFirst的有参构造器，参数值为" + name);
    }
}
class ExerciseSecond extends ExerciseFirst{
    static {
        System.out.println("ExerciseScond的静态初始块");
    }
    {
        System.out.println("ExerciseScond的非静态初始块");
    }
    public ExerciseSecond(){
        super("南无地藏菩萨摩诃萨");
        System.out.println("执行ExercisrSecond的构造器");
    }

}
public class Test{
    public static void main(String[] args) {
        new ExerciseSecond();
        new ExerciseSecond();

    }

}


