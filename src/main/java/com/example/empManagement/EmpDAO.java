package com.example.empManagement;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmpDAO {

//    Used Static List to store data
    private static List<Emp> empList = new ArrayList<>();

//    To Get the All the Employees
    public List<Emp> getAllEmp() {
             return empList;
    }

//    To add the employees
    public void addEmp(Emp emp){
        empList.add(emp);
    }

//    To Update the salary of Employee
    public String updateEmp(Emp emp){
        for (Emp emp1: empList) {
            if (emp1.getEmp_id() == emp.getEmp_id()){
                emp1.setSalary(emp.getSalary());
                return "Salary Updated";
            }
            
        }
        return "Salary is not updated";
    }

//    To Delete Employee
    public void deleteEmp(int emp_id){
        for (int i = 0; i < empList.size(); i++) {
            if (emp_id == empList.get(i).getEmp_id()){
                empList.remove(i);
                return;
            }
            
        }

    }

//    To Search particular Employee from the List
    public Emp searchEmp(int emp_id){
        for (int i = 0; i < empList.size(); i++) {
            if (emp_id == empList.get(i).getEmp_id()){
                return empList.get(i);
            }

        }
        return null;

    }

}
