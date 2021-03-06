3. 클래스와 객체의 차이 정리하기

객체(Object)?
: 소프트웨어 세계에 구현할 대상
: 클래스에 선언된 모양 그대로 생성된 실체
- 자신의 고유의 이름과 상태(state)와 행동(behavior)을 갖음.
* 멤버변수 :  객체의 상태(속성, 특성) 
* 메소드 혹은 멤버함수 : 객체의 행동(기능) 
=> 객체는 클래스로부터 만들어짐
- 클래스의 인스턴스 라고도 부름
- 모든 인스턴스를 대표하는 포괄적인 의미를 갖음
* 객체지향언어(oop)의 관점에서 클래스의 타입으로 선언되었을 때 객체라고 부름

클래스(Class) ?
: 객체는 객체의 상태와 행동이 어떻게 만들지를 결정하는 blueprint(청사진)
: 객체를 만들어 내기 위한 설계도/틀, 연관되어 있는 변수와 메소드의 집합

* blueprint(청사진) ? = 설계도
: 클래스에서는 버튼이라는 객체가 클릭되어지면 다음화면으로 이동하는 행동을 정의하고 
지금 버튼의 이름을 지정하는 상태 등이 동작할 수 있게끔 정의 되어져 있는 설계도 

* 참조변수 : 메모리에 생성된 인스턴스를 가리키는 변수(생성된 인스턴스의 메모리 주소값)

* 인스턴스화 = 클래스로부터 객체를 만드는 과정

-- 인스턴스(instance)란 ? 
-- : 붕어빵 틀에서 구워져 나오는 각가의 붕어빵들 (틀 = 클래스)
-- : 클래스가 메모리에 생성된 상태, 클래스로부터의 객체 
-- : 설계도를 바탕으로 소프트웨어 세계에 구현된 구체적인 실체
-- : 객체를 소프트웨어에 실체화한 것
--- 실체화된 인스턴스는 메모리에 할당
--- 힙 메모리에 멤버 변수의 크기에 따라 메모리 생성
--- 클래스 기반으로 new 를 통해 인스턴스 생성
--- 인스턴스는 객체에 포함된다고 볼 수 있음
--- 객체지향언어(oop)의 관점에서 객체가 메모리에 할당되어 실제 사용될 때 인스턴스라고 부름
--- 추상적인 개념과 구체적인 객체 사이의 관계에 초점을 맞출 경우 사용
---- ~의 인스턴스의 형태로 사용
---- 객체는 클래스의 인스턴스 
---- 객체 간의 링크는 클래스 간의 연관 관계의 인스턴스 
---- 실행 프로세스는 프로그램의 인스턴스
--- 반드시 클래스와 객체 사이의 관계로 한정지어 사용할 필요는 없다 
--- 어떤 원본(추상적인 개념)으로부터 생성된 복제본

Q. 클래스와 객체의 차이는 무엇인가 ?
A.
클래스 = 설계도
객체 = 설계도로 구현한 모든 대상

Q. 객체와 인스턴스의 차이는 무엇인가 ?
A. 
객체 = 소프트웨어 세계에 구현할 대상, 클래스의 타입으로 선언되었을 경우
클래스= 객체를 구현하기 위한 blueprint(청사진)
인스턴스 = 청사진에 따라 생성된 실체, 객체가 메모리에 할당되어 실제 사용될 경우

객체 -> 현실 세계에 가까움, (초점) 실체
인스턴스 -> 소프트웨어 세걔에 가까움, (초점) 관계

* 객체 = 클래스의 인스턴스
* 인스턴스 = 방금 인스턴스화하여 레퍼런스를 할당한 객체
=> 추상적인 개념으로부터 생성되었다는 것에 의미를 부여할 뿐이지 엄격하게 객체와 인스턴스를 나누긴 어려움


--- 개념적으로 인스턴스는 객체에 포함된다고 할 수도 있고 
인스턴스라고 표현을 하는 것이 더 정확하지만 둘을 같다고 봐도 틀린 말은 아님(?)

Q. 인스턴스와 레퍼런스 변수의 차이는 무엇인가 ?
A. 
[    Person person1 = new Person();    ]

레퍼런스 변수 = 문자 그래도의 person1
인스턴스 = person1의 생성에 따른 멤버 변수, 메소드의 할당된 메모리에 생성된 상태 


