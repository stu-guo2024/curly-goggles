//ForEach循环，用更加简便的方式实现数组的遍历
//Java 1.5 以上可以使用
/*
用法：
for (要读取的数组类型 返回变量名：要读取的数组名称）{
    循环体
    }
 */
public class ForEach {
    public static void main(String[] args) {
        //建议在Java中使用这种方法定义数组，而不是 int sz[] = {1,2,3,4,5,6}
        int[] sz = {1,2,3,4,5,6};
        for (int ys:sz){
            System.out.println(ys);
        }
    }
}
