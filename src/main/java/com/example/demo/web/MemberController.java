package com.example.demo.web;


import com.example.demo.domain.member.Member;
import com.example.demo.service.MemberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController //rest api 만들거임
@RequestMapping("/api")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @PostMapping("/join")
    //http://localhost:8080/api/latest/test
    public ResponseEntity<String> create(@RequestBody Member member){
        memberService.join(member);


        return ResponseEntity.ok("created");
    }

    //Read -- 단건 조회
    //http://localhost:8080/api/latest/test/아이디
    @GetMapping("/info/{id}")
    public ResponseEntity<String> read(@PathVariable Long id){
        memberService.findMember(id);
        return ResponseEntity.ok("Hello world KNU");
    }

    //Update
    @PutMapping("/update/{id}")
    //http://localhost:8080/api/latest/test/아이디
    public ResponseEntity<String> update(@PathVariable Long id, @RequestBody Member member){
        memberService.updateMember(id, member);
        return ResponseEntity.ok("updated");
    }

    //Delete
    @DeleteMapping("/delete/{id}")
    //http://localhost:8080/api/latest/test/아이디
    public ResponseEntity<String> delete(@PathVariable Long id){
       memberService.deleteMember(id);

        return ResponseEntity.ok("deleted");
    }
}
