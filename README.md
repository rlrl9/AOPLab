# AOPLab

(1) AOPLab1.java
 /hello 요청시 info 레벨로 로그를 출력하는 before 와 after 어드바이스 메서드를 구현한다.
 (HelloController)
(2) AOPLab2.java
 /select 요청시 info 레벨로 로그를 출력하는 before 어드바이스 메서드를 구현한다.
 (MultiController)
/search 요청시 info 레벨로 로그를 출력하는 after 어드바이스 메서드를 구현한다.
 (MultiController)
(3) AOPLab3.java
 EmpController 의 모든 메서드 호출시 실행 시간을 측정하여 INFO 레벨로 로그를 출력하는
 around 어드바이스 메서드를 구현한다. 
(4) AOPLab4.java
 ExceptionLocalController 의 detail() 메서드 호출시 오류가 발생하면 Exception 객체 정보를
 INFO 레벨로 로그를 출력하는 afterthrowing 어드바이스 메서드를 구현한다.
