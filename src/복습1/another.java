package 복습1;

public class another {
    public static void main(String[] args) {
        int []arr={34,65, 12, 34, 56, 34, 100, 54, 21};
        int max = arr[0];

        for(int i =0; i<arr.length;i++){
            if(max <arr[i]){
                max = arr[i];
            }
        }
        System.out.println("가장 큰 수는:"+max);

    }
}
