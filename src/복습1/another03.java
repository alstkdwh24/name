package 복습1;

import java.util.Scanner;

public class another03{
    public static void main(String[] args) {
       Account acc= new Account("홍길동","1234","1000");

       acc.deposit(1000);//입금
       acc.withDraw(1500);//출금

        int bel = acc.getBalance();
        System.out.println(acc.name+ "님의 잔액은");

    }

}
