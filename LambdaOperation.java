@FunctionalInterface
interface Operation{
    void addition(int num1, int num2);
}
public class LambdaOperation {
    public static void main(String[] args) {
        Operation op = (num1,num2) -> System.out.println("Addition: " +(num1 + num2));
        op.addition(10, 20);
    }
}
