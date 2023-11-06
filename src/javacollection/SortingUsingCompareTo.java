package javacollection;
import java.util.*;



public class SortingUsingCompareTo {
    public static void main(String[] args) {

        Employee employee1 = new Employee(3, "Jatin", 22);
        Employee employee2 = new Employee(2, "Rohit", 33);
        Employee employee3 = new Employee(1, "Cheenu", 24);


        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);



        Collections.sort(employeeList);

        SortingUsingCompareTo obj = new SortingUsingCompareTo();
        obj.printEmployees(employeeList);

    }

    public void printEmployees(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getId() + " "+ employee.getName()+" "+ employee.getAge());
        }



//        employees.forEach(System.out::println);
//        employees.forEach(employee -> System.out.println(employee));
    }

}
