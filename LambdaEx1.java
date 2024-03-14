interface Greeting{
    void greet();
}
public class LambdaEx1{
    public static void main(String[] args) {
        Greeting g1 =  () -> System.out.println("Lambda Example1 ");
        g1.greet();
        Greeting g2 =  () -> {System.out.println("Lambda Example line1 ");
                            System.out.println("Lambda Example line2 ");
                        };
        
        g2.greet();
    }
}