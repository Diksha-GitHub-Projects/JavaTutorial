package org.java.tutorial;

import java.sql.SQLOutput;
import java.util.*;

public class ComparableInterface {
    public static void main(String[] args) {

        Employee[] array = new Employee[] {
                new Employee(1,"Java"),new Employee(2,"Basic"),null
        };

        List<Employee> emp = new ArrayList<>(Arrays.asList(new Employee(1,"Java"),new Employee(2,"Basic")));
        Collections.sort(emp);
        // based on id
        emp.forEach(System.out::println);

        // based on name
        Comparator<Employee> nameComparator = Comparator.comparing(Employee::getName).thenComparing(Employee::getId);
        Collections.sort(emp,nameComparator);
        emp.forEach(System.out::println);

        // reverse order
        Comparator<Employee> idComparator = Comparator.comparing(Employee::getId, (s1,s2) ->
                new Integer(s1).compareTo(new Integer(s2))).reversed();
        Collections.sort(emp,idComparator);
        emp.forEach(System.out::println);

        Comparator<Employee> empComp = Comparator.comparing(Employee::getId);

       // Comparator<Employee> empNatural = Comparator.naturalOrder();
       // Comparator<Employee> empReversed = Comparator.reverseOrder();
        Comparator<Employee> nullFirst = Comparator.nullsFirst(Comparator.comparing(Employee::getId));

       // Arrays.sort(array,empNatural);
       // Arrays.sort(array,empReversed);
        Arrays.sort(array,nullFirst);

        System.out.println(array[0]);

    }
}

// With comparable we can have only 1 sorting logic as we implement compareTo only once
class Employee implements Comparable<Employee>{
    int id;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    String name;

    Employee(int id,String name){
      this.id = id;
      this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        return new Integer(id).compareTo(o.id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
