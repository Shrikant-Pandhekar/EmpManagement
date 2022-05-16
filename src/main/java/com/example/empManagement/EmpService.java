package com.example.empManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpService {
    @Autowired
    private EmpDAO empdao;

    public List<Emp> getAllEmp(){
        return empdao.getAllEmp();
    }

    public void addEmp(Emp emp){
        empdao.addEmp(emp);
    }

    public String updateEmp(Emp emp){
        return empdao.updateEmp(emp);
    }

    public void deleteEmp(int emp_id){
        empdao.deleteEmp(emp_id);
    }

    public void searchEmp(int emp_id){
        empdao.searchEmp(emp_id);
    }
}
