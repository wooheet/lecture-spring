package com.example.hello;

import com.example.hello.domain.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

@SpringBootApplication
public class HelloApplication {
	static void testEntity() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");

		EntityManager em = emf.createEntityManager(); // thread간에 공유를 하지 않는다. 데이터베이스 연결 후 끊는거처럼 사용하고 버려야한다.

		EntityTransaction tx = em.getTransaction();

		tx.begin();

		try {
//			Member member = new Member();
//			member.setId(100L);
//			member.setName("test");
//
//			em.persist(member);

			// update -> jpa가 관리, 그리고 jpa의 모든 데이터 변경은 트랜잭션 안에서 실행된다

			Member findMember = em.find(Member.class, 1L);
			findMember.setName("test test");
//
//			tx.commit();

			// JPQL 검색
//			List<Member> result = em.createQuery("select m from Member as m", Member.class)
//					.setFirstResult(1)
//					.setMaxResults(10)
//					.getResultList();


		} catch (Exception e) {
			tx.rollback();
		} finally {
			em.close();
		}

		emf.close();
	}
	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
		testEntity();
	}

}
