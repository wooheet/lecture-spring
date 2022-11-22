# lecture-spring

## 용준님 과제

멤버 도메인 설계
- 회원 ID
- 이름
- PASSWORD
- 핸드폰 번호


서비스 요구사항 정의
- 로그인
- 아이디/비밀번호 찾기
- 회원가입


저장소
- 아직 데이터 저장소가 선정되지 않음
  - MySQL, PostgreSQL, Redis, etc


웹 애플리케이션 계층 구조
(컨트롤러 -> 서비스 -> 레포지토리) -> DB
- 멤버 도메인을 모두 참조한다.

controller: 웹 MVC의 컨트롤러 역할
service: 핵심 비즈니스 로직 구현
repository: 데이터베이스에 접근, 도메인 객체를 DB에 저장
도메인: 비즈니스 도메인 객체

MemberService -> MemberRepository(interface) -> MemoryMemberRepository
                                             -> JDBC
                                             -> Hibernate

Spring Boot [v]
WEB [v]
MVC [v]
JPA [v]
QueryDSL []
Spring Transaction []
Proxy Pattern []
ThreadLocal []
AOP []
JPA 활용 []

---
API 서버 과제 []
- 회원 + 주문 + ~~ +
- => 제가 리뷰
코딩 테스트 []
---

# 장용준 지원 현황
컴투스 -> 서류 탈락
스마게 -> SGDT(인적성) -> 인턴(공채) -> 초봉베이스
NC -> 코딩 테스트 탈락
=> 코딩 테스트 리뷰


스타트업 개발자
- 실무 위주로 바닥부터 배우기
- 연봉이 짜다 
- 2년정도 배우고 -> 중견, 대기업 이직

중소 (더 안좋음)
- 실무 위주로 바닥부터 배우기
- 연봉이 짜다
- 2년정도 배우고 -> 중견, 대기업 이직






