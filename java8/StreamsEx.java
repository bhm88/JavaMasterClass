package java8;

import java.util.*;
import java.util.stream.Collectors;

public class StreamsEx {
    public static List<Employee> createEmployeeList() {
        List<Employee> employeeList = new ArrayList<>();

        Employee e1 = new Employee("John", 21);
        Employee e2 = new Employee("Martin", 19);
        Employee e3 = new Employee("Mary", 31);
        Employee e4 = new Employee("Stephan", 18);
        Employee e5 = new Employee("Gary", 26);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);

        return employeeList;
    }

    public static void main(String[] args) {

        List<Employee> li = createEmployeeList();


        //filter and map
        List<String> filteredList = li.stream()
                .filter(i -> i.getAge() > 25)
                .map(Employee::getName)
                .collect(Collectors.toList());
        filteredList.forEach((name) -> System.out.println(name));


        //count
        long count = li.stream()
                .filter(i -> i.getAge() == 25)
                .count();
        System.out.println(count);

        //findAny
        Optional<Employee> name = li.stream()
                .filter(i -> i.getName() == "Mary").findAny();
        if (name.isPresent()) {
            System.out.println(name.get());
        }

        //max age
        OptionalInt max = li.stream()
                .mapToInt(Employee::getAge).max();
        if (max.isPresent())
            System.out.println("Maximum age of Employee: " + max.getAsInt());

        //sorting
        li.sort((e1, e2) -> e1.getAge() - e2.getAge());
        li.forEach(System.out::println);


        //string join method
        List<String> employeeNames = li
                .stream()
                .map(Employee::getName)
                .collect(Collectors.toList());
        String employeeNamesStr = String.join(",", employeeNames);
        System.out.println("Employees are: " + employeeNamesStr);


        //grouping
        Map<String, List<Employee>> map = li.stream()
                .collect(Collectors.groupingBy(Employee::getName));
        map.forEach((name1, employeeListTemp) -> System.out.println("Name: " + name1 + " ==>" + employeeListTemp));

        Integer[] arr = new Integer[]{1, 2, 3, 4, 3, 2, 4, 2};
        List<Integer> listWithDuplicates = Arrays.asList(arr);

        Set<Integer> setWithoutDups = listWithDuplicates.stream().collect(Collectors.toSet());
        setWithoutDups.forEach((i) -> System.out.print(" " + i));

        Integer[] arr1 = new Integer[]{1, 2, 3, 4, 3, 2, 4, 2};
        List<Integer> listWithDuplicates1 = Arrays.asList(arr1);
        List<Integer> listWithoutDups = listWithDuplicates1.stream().distinct().collect(Collectors.toList());
        listWithoutDups.forEach((i) -> System.out.print(" " + i));

        Integer[] arr3=new Integer[]{100,24,13,44,114,200,40,112};
        List<Integer> list = Arrays.asList(arr3);
        OptionalDouble average = list.stream()
                .mapToInt(n->n*n)
                .filter(n->n>10000)
                .average();

        if(average.isPresent())
            System.out.println(average.getAsDouble());


        List<Integer> listOfIntegers = Arrays.asList(new Integer[] {40,34,21,37,20});

        List<Integer> result = listOfIntegers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);

        List<Integer> reverseOrder = listOfIntegers.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(reverseOrder);


    }

    static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}

//internediate operations are lazy---returns streams
//filter(predicate--test),map(function--apply),flatmap(fumction),sort,distinct,limit,skip
//consumer---accept
//supplier--get


//terminal ops
//foreach,collect,max,min,count,anymatch,allMatch,findAny,findfirst,toArray,reduce
