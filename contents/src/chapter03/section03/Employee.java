package chapter03.section03;

/**
 * Created by ehay@naver.com on 2018-08-14
 * Blog : http://ehay.tistory.com
 * Github : http://github.com/ehayand
 */

public class Employee implements Comparable<Employee> {
    private int id;
    private double salary;

    //    @Override
//    public int compareTo(Employee other) {
//        return getId() - other.getId(); // ID is always 0 or more
//    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(salary, other.salary); // It is legal for compare method to access other.salary
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


}
