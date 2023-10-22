# AOP Practice
## 1. Environment
* **JAVA**: 1.8.0_192
* **Spring Boot**: 2.7.17

## 2. Content
#### a. Timer  
* Timer 어노테이션 생성 후 Pointcut으로 지정  
* @Around를 사용해 task 수행시간을 측정  
<img width="743" alt="image" src="https://github.com/songahh/aopPractice/assets/77879519/5fa1871a-c32d-4e4d-ad17-a4748f416666">


#### b. Log Printer
* @Before를 사용해 Request를 처리하는 메서드와 인자 출력  
<img width="1030" alt="image" src="https://github.com/songahh/aopPractice/assets/77879519/942cb176-c3fb-4db8-af02-8735e3a76d76">

