package com.example.empManagement;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {

    @Autowired
    private EmpService empService;

    @GetMapping("/emp")
    public List<Emp> helloWorld(){
        return  empService.getAllEmp();
    }

    @PostMapping("/emp")
    public void addEmp(@RequestBody Emp emp){
        empService.addEmp(emp);
    }

    @PutMapping("/emp")
    public String updateEmp(@RequestBody Emp emp){
        return empService.updateEmp(emp);
    }

    @DeleteMapping("/emp/{emp_id}")
    public void deleteEmp(@PathVariable int emp_id){
        empService.deleteEmp(emp_id);
    }

    @GetMapping("/emp/{emp_id}")
    public void searchEmp(@PathVariable int emp_id){
        empService.searchEmp(emp_id);
    }
}
