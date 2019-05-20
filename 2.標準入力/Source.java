import java.util.Scanner;

public class Source{
    public static void main(String[] args) {
        //Scannerクラスのインスタンス変数の初期化
        Scanner scanner = new Scanner(System.in);
        System.out.print("数値を入力>>");
        //int型変数の標準入力
        int number = scanner.nextInt();
        System.out.print("文字列を入力>>");
        //String型変数の標準入力
        String text = scanner.next();
        System.out.println("入力された数値：" + number);
        System.out.println("入力された文字列：" + text);
    }
}