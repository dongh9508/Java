//IterableDepartment.java which implements Iterable<Employee>
package java_extend.Sample;

import java.util.List;
import java.util.Iterator;
import java.util.Arrays;

class Employee {
  private String name;   private Integer age;
  public Employee(String name,Integer age) { this.name = name; this.age = age; }
  String getName() { return this.name; }
  //setters and getters for name & age go here
  //standard override of equals() & hashcode() methods goes here
}

class IterableDepartment implements Iterable<Employee> {
  List<Employee> employeeList;
  public IterableDepartment(List<Employee> employeeList){ this.employeeList=employeeList; }
  @Override
  public Iterator<Employee> iterator() { return employeeList.iterator(); }
}

//Iterates through IterableDepartment's employees using for-each loop 
public class IterableDeptClient {
  public static void main(String args[]){
    List<Employee> employeeList
        = Arrays.asList(new Employee("Tom Jones", 45),
        new Employee("Harry Jones", 42),
        new Employee("Ethan Hardy", 65),
        new Employee("Nancy Smith", 22),
        new Employee("Deborah Sprightly", 29));
    IterableDepartment iterableDepartment=new IterableDepartment(employeeList);
    for(Employee emp: iterableDepartment){
      System.out.println(emp.getName());
    }
  }
}
