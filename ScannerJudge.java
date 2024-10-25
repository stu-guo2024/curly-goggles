//Scanner判断数据合法性，防止程序因用户输入错误的数据类型出现异常
import java.util.Scanner;
public class ScannerJudge {
    public static void main(String[] args) {
        /*
        用这种方法读入用户输入的int类型数据时，若用户输入其他类型的数据，且该类型不能被自动转换为int类型，如String，程序就会报错终止：
        int input;
        Scanner scan = new Scanner(System.in);
        input = scan.nextInt();
        System.out.println(input)
        我们可以使用hasNext()方法避免这个问题，如下方代码所示：
         */
        Scanner scan = new Scanner(System.in);
        int input;
        //可判断指定类型，如scan.nextInt()用于判断输入的是否使Int型，输入代码到has.Next时提示里会显示可校验的所有类型对应的写法。
        if (scan.hasNextInt()){
            input = scan.nextInt();
            System.out.println(input);
        }else {
            System.out.println("输入错误！");
        }
    }
}
