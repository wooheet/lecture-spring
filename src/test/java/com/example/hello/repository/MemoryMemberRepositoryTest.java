package com.example.hello.repository;

import com.example.hello.domain.Member;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MemoryMemberRepositoryTest {

    MemberRepository repository = new MemoryMemberRepository();


    @AfterEach
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    void save() {
        // given
        Member member = new Member();
        member.setName("용준");

        // when
        repository.save(member);

        // then
        Member result = repository.findById(member.getId()).get();

        assertThat(result).isEqualTo(member);
    }

    @Test
    void findById() {
    }

    @Test
    void findByName() {
        // given
        Member member1 = new Member();
        member1.setName("용준1");

        repository.save(member1);

        Member member2 = new Member();
        member2.setName("용준2");

        repository.save(member2);
        // when

        Member result = repository.findByName("용준1").get();

        // then
        assertThat(result).isEqualTo(member1);

    }

    @Test
    void findAll() {

        // given
        Member member1 = new Member();
        member1.setName("용준1");

        repository.save(member1);

        Member member2 = new Member();
        member2.setName("용준2");

        repository.save(member2);
        // when

        List<Member> result = repository.findAll();

        // then
        assertThat(result.size()).isEqualTo(2);
    }

    @Test
    void findByPassword() {
        Member member1 = new Member();
        member1.setName("용준1");
        member1.setPassword("1234");

        repository.save(member1);

//        repository.findByPassword()
    }

}