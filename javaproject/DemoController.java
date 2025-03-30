// package com.demo.demo.Controller;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// import com.demo.demo.entity.Employee;

// @RestController
// public class DemoController {
//     @Value("${emp.dept}")
//     private String department;

//     @GetMapping("/api/{name}")
//     public String getMessage(@RequestParam String name)
//     {
//         return "Hello "+name;
//     }
    
//     @GetMapping("/dept")
//     public String getDept()
//     {
//         return department;
//     }
//     @GetMapping("/employee")
//     public Employee getEmployee()
//     {
//         Employee emp=new Employee();
//         emp.setId(1);
//         emp.setAge(19);
//         emp.setName("anu");
//         return emp;
//     }
// }
