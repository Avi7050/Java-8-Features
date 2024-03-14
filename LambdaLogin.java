@FunctionalInterface
interface Login{
    String check(String username,String password);
}
public class LambdaLogin {
    public static void main(String[] args) {
        Login log = (username,password) -> ((username.equalsIgnoreCase("Avinash")) && (password.equals("AvinashKumar"))?"Login Success":"Login Failed"); 
        String status = log.check("Avinash", "AvinashKumar");
        System.out.println("Your Login status: " + status);
    }
}
