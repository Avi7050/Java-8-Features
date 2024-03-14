import java.util.*;
class Employee{
    int id;
    String name;
    double salary;
    Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
public class ForEachMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Avinash","Akash","Amit","Ajay");
        names.forEach(name -> System.out.print(name + " "));
        System.out.println();
        List<Integer> numbers = Arrays.asList(10,20,30,40,50);
        numbers.forEach(number -> System.out.print(number + " "));
        System.out.println();
        List<Employee> emps = Arrays.asList(new Employee(1, "Avinash", 100000.00),
                                    new Employee(1, "Akash", 10009.00));
                emps.forEach(emp -> System.out.println("ID: " + emp.id + ", Name: " + emp.name + ", Salary: " + emp.salary));
    }
}
