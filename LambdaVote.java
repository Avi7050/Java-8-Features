@FunctionalInterface
interface VoteCheck{
    String name = "Avinash";
    String check(String name, int age, String location);
}
public class LambdaVote {
    public static void main(String[] args) {
        VoteCheck vc = (name,age,location) ->((age >= 18) &&(location.equalsIgnoreCase("hyderabad"))?"Eligible to vote":"Not eligible to vote");
        String status = vc.check("Avinash", 28, "Hyderabad");
        System.out.println("Hii " + VoteCheck.name + "! You are " + status);
    }
}
