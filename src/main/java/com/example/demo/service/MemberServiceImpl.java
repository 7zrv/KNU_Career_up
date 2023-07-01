package com.example.demo.service;

import com.example.demo.Repository.MemberRepository;
import com.example.demo.domain.member.Member;
import org.springframework.stereotype.Service;


@Service
public class MemberServiceImpl implements MemberService{


    private final MemberRepository memberRepository;


    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Member join(Member member) {

        return memberRepository.create(member);
    }

    @Override
    public Member findMember(Long id) {
        return memberRepository.findById(id);
    }

    @Override
    public Member updateMember(Long id, Member member) {
        return memberRepository.update(id, member);
    }

    @Override
    public Long deleteMember(Long id) {
        return memberRepository.delete(id);
    }
}
