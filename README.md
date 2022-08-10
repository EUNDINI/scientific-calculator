<h1 align="center">공학용 계산기 scientific-calculator</h1>
<p align="center">
  <img src="https://user-images.githubusercontent.com/72064966/183895156-d4edafee-d992-48a4-8b71-97cccf86b04d.PNG">
</p>

## 기술 스택
<p>
  <img src="https://img.shields.io/badge/Java-007396?style=flat-square&logo=Java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Android-3DDC84?style=flat-square&logo=android&logoColor=white"/>
</p>

## 애플리케이션 기능 🛠
* 사칙연산 & 멱승
  * 숫자 -> 연산자 -> 숫자 -> 등호 클릭 후 결과 출력
* 루트 및 sin연산
  * 숫자 -> 연산자 -> 등호 클릭 후 결과 출력
* 연산자를 누를 경우 
  * 연산자의 종류를 hint 속성으로 표시
* 숫자는 여러 자릿수 입력 가능
* 옵션메뉴를 클릭
  * [일반용] <ㅡ> [공학용] 전환
* C(Clear) 버튼을 누를 경우
  * 계산 초기화 → 처음 숫자부터 다시 입력
* 오류 처리
  * 입력 순서를 지키지 않거나 연산 오류가 발생하였을 때   
    또는 기타 오류 발생 시 Toast 안내 후 초기화
* 연속 계산 기능
  * 하나의 연산자 사용이 아닌 여러 연산자를 사용하여 계산
  * 입력 예: 45 + 5 / 2 * 4 = 결과 100 출력 (연산자의 우선
  순위는 고려하지 않으며 입력한 순서대로 연산 수행)
