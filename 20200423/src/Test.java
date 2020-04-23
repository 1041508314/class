import java.util.Arrays;

/**
 * @program: 20200423
 * @description
 * @author: LiuXinYu
 * @create: 2020-04-23 14:35
 **/
public class Test {
    /**
     * 一个数组中 只有一个数字出现了一次 其他数字都是两次 找出这个只出现一次的数字
     * 位运算符  &按位与  |按位或  ^按位异或
     *  ^ ：两个相同的数字 进行异或 那么结果是0
     *  0^ 任何数字  结果都是任何数字
     */
    public static void main(String[] args) {
        int[] array = {1,2,4,1,4};
        int ret = 0;
        for (int i = 0; i < array.length; i++) {
            ret ^= array[i];
        }
        System.out.println(ret);
    }




    /**
     * 不规则的二维数组
     * @param args
     */
    public static void main3(String[] args) {
        int[][]array = new int[2][];
        array[0] = new int[]{1,2,3};
        array[1] = new int[]{4,5};
        //注意： C语言 是可以指定列 行可以自动推导
        //java 行必须指定  列不可以自动推导的
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
           System.out.println();
        }
        System.out.println(Arrays.deepToString(array));
    }


    /**
     *
     * java中的二维数组 实际上是一个一维数组中的每个元素
     * @param args
     */
    public static void main2(String[] args) {
        /**
         * 二维数组的打印方式
         */
        int[][] array = {{1,2,3},{4,5,6}};
        for (int[] tmp: array) {
            for (int x: tmp) {
                System.out.print(x + " ");
            }
        }
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//            }
//            System.out.println();
//        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.deepToString(array));
    }




    /**
     *
     * 二维数组的定义方式
     * @param args
     */
    public static void main1(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int[][] array2 = new int[][]{{1,2,3},{4,5,6}};
        int[][] array3 = new int[2][3];
    }
}
