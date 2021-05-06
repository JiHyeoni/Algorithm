//null과 undefined
let codeit;
console.log(codeit); // undefined는 선언을 한 다음 값을 정하지 않았다는것을 의미
codeit=null;
console.log(codeit); //의도적으로 값이 없을 때 

/*
//템플릿 문자열(template strings)
//template: 일정한 틀, 형식
let year=2010;
let month=3;
let day=11;
console.log('생년원일은 '+year+'년 '+month+'월 '+day+'일 입니다.');
console.log(`생년원일은 ${year}년 ${month}월 ${day}일 입니다.`)

let myNumber=3;
function getTwice(x){
  return x*2;
}

console.log(`${myNumber}의 두 배는 ${getTwice(myNumber)}입니다.`);


//형 변환(Type Conversion)
//같음 비교 연산(===,==,!==,!=)
console.log(1==='1'); //일치, 불일치(!==)
console.log(1===true);
console.log(1=='1')//동등,부등(!=)
console.log(1==true);

//관계 비교 연산(<,<=,>,>=)
console.log(2<'3');
console.log(2>true);
console.log('2'<=false);
console.log('two'>=1);

console.log('4'-true); //자동으로 변환
console.log(4+'2'); //+는 문자를 연결하는 기능이 더 강함
console.log(4+2);
console.log(4-true);
console.log(4*false);
console.log(4/'2');
console.log('4'**true);
console.log(4%'two');

//'',0,NaN <- falsy
//문자->숫자
let x='문자';
console.log(x);
console.log(Number(x));
console.log(typeof x);
console.log(typeof Number(x));

console.log('');

//불린->문자
let y=true;
console.log(y);
console.log(Number(y));
console.log(typeof y);
console.log(typeof Number(y));

//숫자->문자
let x=123;
console.log(x);
console.log(String(x));
console.log(typeof x);
console.log(typeof String(x));

console.log('');

//불린->문자
let y=true;
console.log(y);
console.log(String(y));
console.log(typeof y);
console.log(typeof String(y));

//String, Number, Boolean
console.log(Number('10')+Number('5'));
console.log(String(10)+String(5));


//typeof 연산자
console.log(typeof ('Hello'+'Codeit'));
console.log(typeof (8-3));

let name='Codeit';
function sayHello(){
  console.log('Hello');
};
console.log(typeof name);
console.log(typeof sayHello);


console.log(typeof 101);
console.log(typeof 'Codeit');
console.log(typeof true);

//불린(Boolean)
console.log(2>1);
console.log(2<1);
console.log(3===3); //===는 자료형까지 비교, ==는 자료형까지 비교는 안함
console.log(3!==3);

console.log(true&&true);
console.log(true&&false);
console.log(true||false);
console.log(false||false);
console.log(!true);
console.log(!false);

//문자열
console.log('Hello' + 'Codeit');
console.log('3'+'5');
console.log(`He said "I'm Iron man"`);

console.log('코드잇');

//거듭제곱
console.log(2**3);

//나머지
console.log(7%3);
*/
