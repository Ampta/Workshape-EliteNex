package day_1;

import java.util.Date;

public class Employee {
    private Integer id;
    private String fullName;
    private String department;
    private String address;
    private Date joiningDate;
    private Double salary;

    Employee(){

    }

    Employee(Integer id, String fullName, String department, String address, Double salary){
        this.id = id;
        this.fullName = fullName;
        this.department = department;
        this.address = address;
        this.joiningDate = new Date();
        this.salary = salary;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Date getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", department='" + department + '\'' +
                ", address='" + address + '\'' +
                ", joiningDate=" + joiningDate +
                ", salary=" + salary +
                '}';
    }
}
