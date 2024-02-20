package 복습1;

import java.util.Arrays;
import java.util.Scanner;

public class another2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String[] arr= new String[100];

        int index = 0;//위치값
        System.out.println("먹고싶은 음식을 고르시오");
        System.out.println("입력을 그만하려면 [그만]을 입력하세요.");

        while(true){
            System.out.println(">");
            String menu =scan.next();

            if(menu.equals("그만")){
                System.out.println("입력종료");
                break;
            }
            arr[index] = menu; //메뉴추가
            index++;
        }
        System.out.println("-------입력받은 메뉴----------");
        System.out.println(Arrays.toString(arr));
    for(int i =0; i <index; i++){
        System.out.println(arr[i] + " ");
    }
    }
}
