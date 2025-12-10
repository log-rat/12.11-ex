import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("종료를 원하면 exit,계속하기를 원하면 엔터");
            String command = sc.nextLine();

            if (command.equals("exit")) {
                System.out.println("종료합니다");
                break;
            }


            System.out.print("첫번째 숫자");
            int num = Integer.parseInt(sc.nextLine());

            System.out.print("두번째 숫자");
            int num2 = Integer.parseInt(sc.nextLine());

            System.out.print("기호를 입력하세요");
            char ex = sc.nextLine().charAt(0);

            int result = 0;

            if (ex == '+')
            {result = num + num2;}
            else if (ex =='-')
            {result = num - num2;}
            else if (ex == '*')
            {result = num * num2;}
            else if (ex == '/')
            {result = num / num2;}
            else{System.out.println("잘못된 기호입니다");
            continue;}

            System.out.println("결과: " + result);
        }


    }
}