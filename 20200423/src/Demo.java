/**
 * @program: 20200423
 * @description
 *   访问修饰限定符
 *   public：公有的
 *   private：私有的
 *   protected：受保护的
 *   什么都不写：默认权限-> 包访问权限
 * @author: LiuXinYu
 * @create: 2020-04-23 15:45
 **/


class Person{
    //字段->成员变量  定义在方法外边 类的里边
    //实例成员变量： 在对象里面
    //实例成员没有初始化 默认值为对应的0 值  引用类型默认为null  简单类型默认为0
    //char-> '\u0000'    boolean -> false
    public String name = "lxy";
    public int age = 21;

    //静态成员变量
    //如何访问静态数据成员
    public static int size;

    //方法->行为
    public void eat(){
        int a = 10;
        System.out.println("eat()!");
    }
    public void sleep(){
        System.out.println("sleep()!");
    }
    public static void func1(){
        System.out.println("static::func1()");
        //age = 99;  错误  静态方法内部 不能够访问非静态的数据成员
        size = 999;
    }
    public void show(){
        System.out.println("我叫" + name + ", 今年" + age + "岁");
    }
}

class test{
    public int a;
    public static int count;
}


public class Demo {
    public static void func(){

    }
    public void func2(){

    }
    public static void main(String[] args) {
        func();//静态的只能调用静态的
        Demo Demo = new Demo();
        Demo.func2();

    }




    public static void main7(String[] args) {
    test t1 = new test();
    t1.a++;
    test.count ++;
        System.out.println(t1.a);
        System.out.println(test.count);
        System.out.println("==========");
        test t2 = new test();
        t2.a ++;
        test.count ++;
        System.out.println(t2.a);
        System.out.println(test.count);
    }




    public static void main6(String[] args) {
        Person per = new Person();
        per.show();
        per.name = "张三";
        per.age = 10;
        per.show();
    }





    /**
     * 如何访问实例成员方法
     * @param args
     */
    public static void main5(String[] args) {
        Person per = new Person();
        per.eat();
        per.sleep();
    }



    /**
     * 如何访问静态成员方法
     * @param args
     */
    public static void main4(String[] args) {
        Person.func1();
    }



    public static void main3(String[] args) {
        //如何访问静态数据成员
        //类名.静态成员变量
        //静态成员变量不属于对象 属于类
        //Person per = new Person();
        //System.out.println(per.name);
        //System.out.println(per.size);//这里报错  因为静态成员变量属于类
        System.out.println(Person.size);
    }


    public static void main2(String[] args) {
        Person per = new Person();
        //如何访问对象中的实例成员变量
        //操作符 点号  对象的引用 . 成员变量
        System.out.println(per.name);
        per.name = "bit";
        System.out.println(per.name);
        System.out.println(per.age);
    }




    public static void main1(String[] args) {
        //一个类可以产生多个对象
        //实例化一个对象  通过关键字new
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
    }
}
