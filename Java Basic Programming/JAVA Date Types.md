JAVA Date type 
================
Primitive Type (기본 타입, 8개)과 Reference Type (참조 타입, 1개 - 3가지)으로 분류

![javadatatype](https://user-images.githubusercontent.com/76231561/106920289-4bb20500-674e-11eb-97e7-5ee37d7476de.jpeg)

## Data Type (데이터형) 
자바 언어가 처리할 수 있는 데이터(자료) 종류

## 리터널 (literal)? = 값
- 프로그램에서 직접 표현한 값 
- 정수, 실수, 문자, 논리, 문자열 리터럴이 있음.
- (예) 34, 42.195, '%', true, "hello", ...

# Primitive Type (기본 타입)
+ byte, short, char, int, long, float, double, boolean 타입
+ 위 타입의 변수에는 값 자체가 저장

## boolean Types (논리 타입)
### boolean
+ (논리리터럴) True(참) / False(거짓) 중 하나의 값
+ 1비트 
> 자바 가상 기계에서 처리하는 boolean의 실제 크기는 1비트가 아닐 수 있음
+ 2가지 상태 값에 따라 boolean 타입 변수 치환, 조건문과 제어문의 흐름 변경하는데 사용
<br>

## Integer Types (정수 타입)
정수를 저장할 수 있는 타입
### byte /  short  / int /  long 타입

| 타입 | 메모리 사용크기 |                       저장되는 값의 허용 범위                       |
|:-----:|:---------------:|:-------------------------------------------------------------------:|
|  byte |      1 byte (8 bit) | -128 ~ 127                                                          |
| short |      2 byte (16 bit) | -32768 ~ 32767                                                      |
|  int  |      4 byte (32 bit) | -2147483648 ~ 2147483647 (약 -21억 ~ + 21억)                        |
|  long |      8 byte (64 bit) | -9223372036854775808 ~ 9223372036854775807 (약 -900경 ~ 약 +900 경) |
> 허용 범위를 초과한 값을 대입했을 경우 컴파일 에러 발생
<br>

Q. 왜 정수 타입를 4가지로 분류했을까?
> A. 컴퓨터의 성능 한계(메모리 한계) 때문
<br>

(정수 리터럴) 10진수, 8진수, 16진수, 2진수 리터럴
> - (기본적인 컴파일러) 정수 리터럴을 int타입으로 간주 <br>
> - 정수 리터럴이 int 타입의 허용범위를 초과할 경우, long 타입임을 컴파일러에게 알려줘야 함.

|   진수  |             진수 입력         |                         구성                           |                   코드 형식               | 10진수로 변환하면 | 
|:--------:|:--------------------------:|:--------------------------------------:|:--------------------------------------:|:--------:|
| 10진수 | 일반적으로 사용하는 수 | 소수점 없는 0 ~ 9                                 | <code> int n = 15; </code>        | 15 |
|  2진수  |        0b(0B) 로 시작      | 0, 1                                                     | <code> int b = 0b0101; </code> | 5 |
|  8진수  |         0 으로 시작         | 0 ~ 7                                                  |<code> int m = 015; </code>       | 13 |
| 16진수 |         0x(0X) 로 시작      | 0 ~ 9 , A(a) / B(b) / C(c) / D(d) / E(e) / F(f) | <code> int k = 0x15; </code>      | 21 |
<br>

+ long 타입 <br>
> 수치가 큰 데이터를 다루는 프로그램에서 주로 사용
>> (예) 은행, 과학과 관련된 프로그램, ... <br>

> - long 형 리터럴은 숫자 뒤에 L 와 l 을 붙여 표시
> - 소문자 l은 숫자 1과 비슷해 혼동하기 쉬우므로 대문자 L 사용 <br>
> - <code> long X = 24L </code> <br>

Q. long 형 변수에 정수 리터럴을 저장할 때 반드시 L을 붙여야 할까?
> A.  __No__ 정수 리터럴이 int 형의 허용범위 이내라면 L를 붙이지 않아도 된다.
<br>

### char 타입
작은 따옴표(')로 감싼 하나의 문자 리터럴을 저장할 수 있는 타입
(문자 리터럴) 하나의 문자를 작은따옴표(')로 감싼 것
> (예) 'w' , 'A' , '가', '*', '3', '글', \u0041
+ 자바는 유니코드를 저장할 수 있도록 2 byte 크기인 char 타입을 제공
> Unicode유니코드로 변환되어 저장 <br>
>> __Unicode(유니코드) ?__ 세계 각국의 문자를 2 byte로 표현할 수 있는 숫자(0 ~ 65535)로 매핑한 국제 표준 규약 <br>

+ 작은따옴표(')로 감싼 문자 리터럴은 유니코드로 변환되기 때문에 int 타입 변수에도 저장 가능
> + char 타입 변수에 저장하면 자동으로 문자로 매핑되어 출력 <br>
> + int 타입 변수에 저장하면 유니코드 자체 출력
<br>

## String Class type (String 클래스)
큰따옴표(")로 감싼 문자열을 저장할 수 있는 타입
>__문자열(String) ?__ 큰따옴표(")로 감싼 문자들
+ 문자열은 기본 타입이 아니고 __클래스 타입__
+ 큰 따옴표(")로 감싼 문자 또는 여러 개의 문자들은 유니코드로 변환되지 않음

--------------------------------------------------------------------------------------------------
+  __이스케이프(Escape) 문자 ?__
문자열 내부에 역슬래시(\\)가 붙은 문자
> 문자열 내부에 특정 문자를 포함 가능

| 이스케이프 문자 | 출력 용도 |
| :-----------------: | :---------: |
| <code> \b </code> | 백스페이스(backspace) |
| <code> \t </code> | 탭(tab)만큼 띄움 |
| <code> \n </code> | 줄 바꿈(라인 피드, line feed) |
| <code> \f </code> | 폼 피드(form feed) |
| <code> \r </code> | 캐리지 리턴(carriage return) |
| <code> \\" </code> | "(이중 인용부호, double quote) 출력 |
| <code> \\' </code> | '(단일 인용부호, single quote) 출력 |
| <code> \\ </code> | \(백슬래시, backslash) 출력 |
| <code> \u16진수 </code> | 16진수 유니코드에 해당하는 문자 출력 |

+ 문자/문자열 리터럴 구분

> 
| 리터럴을 구별하는 기호 | 리터럴 구분 |
| :-------------------------: | :------------: |
| <code>  '(작은 따옴표) </code> | 문자 리터럴 |
| <code>  "(큰 따옴표) </code> | 문자열 리터럴 |

--------------------------------------------------------------------------------------------------

##  Floating-Point Types(실수 타입, 부동소수점 타입)
실수를 저장할 수 있는 타입
### float / double
(실수 리터럴) 소수점 형태, 지수 형태로 표현한 실수 
> (예) 12. , 12.0 , .1234 , 0.1234 , 1234E-4 <br>
>> 소스코드에서 소수점이 있는 숫자 리터럴은 10진수 실수로 인식

 - (기본적인 컴파일러) 실수 리터럴을 double 타입으로 해석
> 이렇기 때문에 double 타입 변수에 저장해야 함.
>> 실수 리터럴을 float 타입 변수에 저장하면 __컴파일 에러__ 발생

 - 실수 리터럴을 float 타입으로 저장하고 싶다면 리터럴 뒤에 f(float), d(double)을 명시적으로 붙여서 float 타입임을 알 수 있도록 해야 함.

| 타입 | 메모리 사용크기 |  저장되는 값의 허용 범위(양수 기준) | 정밀도(소수점 이하 자리) |
| :----: | :-----------------: | :--------------------------------------: | :-------------------------: |
| float | 4 byte (32 bit) | (1.4 * 10^-45^) ~ (3.4 * 10^38^) | 7자리 |
| double | 8 byte(64 bit) | (4.9 * 10^-324^) ~ (1.8 * 10^308^) | 15자리 |

![float001](https://user-images.githubusercontent.com/76231561/106931588-17dcdc80-675a-11eb-90e2-7d667b5af281.jpg)

>  double 타입은 float 타입보다 2배 정도 정밀도가 높기 때문에 좀 더 정확한 데이터 저장이 가능
>> + double이라는 이름은 float 타입보다 약 2배의 정밀도를 갖는다는 의미에서 붙여진 것
>> + 메모리에 여유가 있고 특별한 이유가 없는 한, 실수 리터럴을 저장할 때엔 __double 타입__ 사용하는 것 추천
 
# Reference Type (참조 타입, 객체 타입)
+ 기본 타입을 제외한 배열, (열거), 클래스, 인터페이스 등
+ 객체(object)의 번지를 참조하는 타입 
> 객체 타입의 변수에 객체의 번지 저장
> __번지로 객체를 참조__한다는 의미

## 배열 타입
## 열거 타입
## 클래스
## 인터페이스