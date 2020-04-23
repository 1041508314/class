/**
 * @program: 20200423
 * @description
 * 封装：用private来修饰属性 或者 方法
 * 没有特殊要求 属性都设置为私有的
 * @author: LiuXinYu
 * @create: 2020-04-23 17:14
 **/
class Student{
    //private修饰 限定只能在类当中进行访问
    //为什么要封装
    private String name;
    private  int age;


    //alt + insert  -> getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //    //提供公开的接口
//    public String getMyName(){
//        return this.MyName;
//    }
//    public  void setMyName(String MyName){
//       // MyName = MyName;//其实就是自己给自己赋值 并没有赋值属性 局部变量优先
//        this.MyName = MyName;//this:当前对象的引用
//    }

    private  void func1(){
        System.out.println("func1()");
    }

    public void show(){
        System.out.println("我叫" + this.name + ", 今年" + age + "岁");
    }

//重新是想了一下Object类的 toString（）方法
    //Object是所有类的父类           alt+insert  -> toString()
    @Override//注解： 这个注解指的是 这个方法是重新写的
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//以上是类的实现者写的代码

//以下是类的调用者
public class Test1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("lxy");
        String str = student.getName();
        System.out.println(str);
        //student.show();
        System.out.println(student);
    }
}
