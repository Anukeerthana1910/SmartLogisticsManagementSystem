// package com.demo.demo.Controller;

// import java.util.List;

// import org.hibernate.EmptyInterceptor;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RestController;

// import com.demo.demo.entity.Employee;
// import com.demo.demo.repository.studentbank;
// import com.demo.demo.service.EmployeeService;

// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.RequestParam;

// @RestController
// public class EmployeeController {
//     @Autowired
//     EmployeeService empService;
//     @PostMapping("/add")
//     public Employee insertEmployee(@RequestBody Employee e)
//     {
//         return empService.addEmployee(e);
//     }
//     @GetMapping("/get")
//     public List<Employee> getAllEmployee() {
//         return empService.getEmployee();
//     }
//     @PutMapping("/update/{id}")
//     public Employee updateEmployee(@PathVariable Long id, @RequestBody Employee emp)
//     {
//         return empService.updateEmployee(id,emp);
//     }
//     @DeleteMapping("/delete/{id}")
//     public String deleteEmployee(@PathVariable Long id)
//     {
//         return empService.deleteEmployee(id);
//     }
// }
