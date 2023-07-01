package com.example.demo.web;


import com.example.demo.service.TestService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController //rest api 만들거임
@RequestMapping("/api/latest")
public class TestController {

    private final TestService testService;

    public TestController(TestService testService){
        this.testService = testService;
    }

    //Create
    @PostMapping("/test")
    //http://localhost:8080/api/latest/test
    public ResponseEntity<String> create(@RequestBody Map<String, String> map){
        //리퀘스트 바디는 어떤값인지
        //val 1
        //val 2
        System.out.println("map.get(\"val1\") = " + map.get("val1"));
        System.out.println("map.get(\"val2\") = " + map.get("val2"));

        return ResponseEntity.ok("created");
    }

    //Read -- 단건 조회
    //http://localhost:8080/api/latest/test/아이디
    @GetMapping("/test/{id}")
    public ResponseEntity<String> read(@PathVariable Long id){
        System.out.println("id = " + id);
        return ResponseEntity.ok("Hello world KNU");
    }

    //Update
    @PutMapping("/test/{id}")
    //http://localhost:8080/api/latest/test/아이디
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Map<String, String> map){
        System.out.println("id = " + id);
        System.out.println("map.val1 = " + map.get("val1"));
        System.out.println("map.val2 = " + map.get("val2"));
        return ResponseEntity.ok("updated");
    }

    //Delete
    @DeleteMapping("/test/{id}")
    //http://localhost:8080/api/latest/test/아이디
    public ResponseEntity<String> delete(@PathVariable Long id){
        System.out.println("id = " + id);


        return ResponseEntity.ok("deleted");
    }


}
