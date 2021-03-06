JAVA main() Method
==============

# main() Method
+ 프로그램의 시작점
+ 모든 자바 응용 프로그램에 꼭 들어가야 하는 문장
+ 자바에서 응용 프로그램의 실행 시작되는 메소드
> main() 메소드가 없는 프로그램은 동작할 수 없음. <br>
> 컴퓨터가 소스 코드를 읽을 때 main() 메소드를 실행하고 거기에 정의된 순서에 따라 프로그램 실행

```javascript
 public static void main(String[] args) { } 
```
![main Method](https://user-images.githubusercontent.com/76231561/106952166-14564f00-6774-11eb-833c-a1f9069587a6.png)

## main() 메소드의 타입과 특징

### 1. public 속성
> 접근 제어자

> 메소드가 다른 클래스에서 호출 가능함을 의미
 JVM(자바 가상 기계)에 의해 호출 되어야 함.

### 2. static 속성
main() 메소드가 포함된 클래스의 객체(인스턴스, instance)가 생성되기 전에 JVM(자바 가상 기계)에 의해 호출되므로 선언되어야 함.
> static 속성이 아닌 메소드, 변수를 직접적으로 사용 불가

> 해결책 = new 연산자

> new 연산자를 이용해 사용하고자 하는 메소드, 변수가 있는 클래스의 객체를 만들고, 그 객체를 이용해 해당 메소드, 필드 접근

> static 속성이 아닌 메소드에서 static 속성의 메소드, 필드에 접근 시 ``` 클래스명.(메소드 이름 혹은 변수 이름) ```의 방식으로 접근할 수 있다

> 다른 클래스에 있는 메소드, 변수의 경우 접근 지정자의 범위에 의해서 접근하지 못하는 경우 주의

### 3. 리턴 타입 : void
리턴 값 없음

### 4. 인자 : 문자열 배열(String[]) 전달
자바는 명령행에 주어진 모든 인자를 문자열로 처리해 main()에 전달
+ String으로 []을 통해 배열로 생성
> args : 일반적으로 이렇게 사용할 뿐이지 다른 것들로도 대체 가능

+ C언어와 비슷
+ 응용 프로그램 시작 전, 인자들이 모두 하나의 문자열 배열에 저장
> 문자열 배열에 대한 레퍼런스가 main() 메소드의 args(메소드 인자)에 복사

> main() 메소드에서  args(인자)를 이용해 명령행 인자 전달 받기 가능