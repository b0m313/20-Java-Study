7. this와 this()의 차이점 및 특징 정리하기
- 두 키워드는 전혀 다른 키워드

this.___ = ****;
: 인스턴스변수에 매개변수를 대입

**** = ****;
: 지역에 매개변수를 대입


[ this ]
: 객체 = 자기자신(나) = 인스턴스 자신을 가르키는 참조 변수 = 객체의 주소 = 필드에 있는 인스턴스 변수 = 자신을 참조하는 참조변수
: 생성자의 매개변수로 선언된 변수의 이름이 인스턴스 변수와 같을 때 인스턴스 변수와 지역변수를 구분하기 위해서 사용
=> 매개변수와 필드 변수의 이름이 같은 경우에 구별하기 위한 목적으로 필드변수를 가리키는 때에 사용 
=> 생성자의 매개변수 이름과 객체의 이름이 같을 경우 객체 앞에 this를 붙여 구현
=> this를 사용해 객체 접근
- static 메소드에서는 this를 사용하지 못함

[ this() ]
: 생성자 호출
: 생성자임을 알려주고 싶어서 !
: 생성자 내부에서만  사용 가능
: 같은 클래스의 다른 생성자를 호출할 때 사용
- 생성자가 중복되어 있는 경우에 같은 클래스 내의 다른 생성자를 호출할 때 사용  
- 반드시 첫번째 문장에 와야함 