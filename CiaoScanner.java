import java.util.Scanner;

public class CiaoScanner {
  public static void main( String[] args ) {
    // Scannerを new する
    Scanner sc = new Scanner( System.in );

    // 名前を入力してください、と表示する
    System.out.print( "input your name: " );

    // System.in から、名前の文字列を入力する
    String name = sc.nextLine();

    // メッセージを入力してください、と表示する
    System.out.print( "input your msg: " );

    // System.in から、メッセージの文字列を入力する
    String msg = sc.nextLine();

    // くりかえし処理: 0: ALOHA! from Yoshino みたいに表示する
    int loop = 10;
    for ( int i=0; i<loop; i++ ) {
      System.out.println( i + ": " + msg + "! from " + name );
    }
  }
}