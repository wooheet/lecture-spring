package com.example.hello.repository;

import com.example.hello.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);

    Optional<Member> findById(Long id); // null

    Optional<Member> findByName(String name);

    Optional<Member> findByPassword(String password);

    List<Member> findAll();

    void clearStore();
}
