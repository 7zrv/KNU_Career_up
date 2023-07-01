package com.example.demo.Repository;

import com.example.demo.domain.member.Member;
import org.springframework.stereotype.Repository;


@Repository
public interface MemberRepository {

    Member create(Member member);
    Member findById(Long id);
    Member update(Long id, Member member);
    Long delete(Long id);
}
