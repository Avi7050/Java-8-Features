import java.util.*;
class Employee{
    String name;
    double salary;
    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }
}
public class MapForEachMethod {
    public static void main(String[] args) {
        Map<String,Integer> wordCount = Map.of("Ratan",1,"is",10,"Great",5);
        wordCount.forEach((key,value) -> System.out.println(key + ", " + value)); 
        Map<Integer,Employee> emps = Map.of(1,new Employee("Avinash", 1000000),
                                                2,new Employee("Akash", 10009));
            emps.forEach((key,value) -> System.out.println(key + ", " + value.name + ", " + value.salary));
    }
}
