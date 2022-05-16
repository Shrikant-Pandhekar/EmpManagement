package com.example.empManagement;

public class Emp {
    private int emp_id;
    private String emp_name;
    private String domain;
    private String position;
    private int salary;

    public Emp() {
    }

    public Emp(int emp_id, String emp_name, String domain, String position, int salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.domain = domain;
        this.position = position;
        this.salary = salary;
    }


    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
