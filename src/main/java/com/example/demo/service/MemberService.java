package com.example.demo.service;

import com.example.demo.domain.member.Member;

public interface MemberService {

    Member join(Member member);
    Member findMember(Long id);
    Member updateMember(Long id, Member member);
    Long deleteMember(Long id);
}
