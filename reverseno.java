public class reverseno {
    public static void main(String[] args) {
        int n =59840;
        int ans = 0;
        while (n> 0){
            int rem  = n%10;
            n/=10;
            ans = ans * 10 + rem;


        }
        System.out.println(ans);
    }
}
