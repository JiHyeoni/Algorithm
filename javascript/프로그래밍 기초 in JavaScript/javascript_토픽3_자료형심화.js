/*
//숫자 표기법
let millionaire=1000000000;
let myNumber=1e9; //지수 표기법

console.log(millionaire);
console.log(myNumber);
console.log(millionaire===myNumber);

console.log(5.3e3===5300);
console.log(-6.1e8===-610000000);

console.log(16e-5===0.00016);
console.log(-9.1e-5===-0.000091);

//16진법
let hex1 = 0xff;//255
let hex2=0xFF;//255

//8진법
let octal = 0o377; //255

//2진법
let binary = 0b11111111;//255

console.log(hex1);
console.log(hex2);
console.log(octal);
console.log(binary);

//Number
let myNumber=0.3591;
//toFixed(0~100)
console.log(Number(myNumber.toFixed(3)));//소수점 고정 -> string이 됨

myNumber=255;
//toString(2~36)->진수로 변환
console.log(myNumber.toString(2));
console.log((255).toString(8));
console.log(255..toString(16));

//String
let myString='  Hi Codeit';
//요소 탐색
console.log(myString.indexOf('i')); //앞부터
console.log(myString.lastIndexOf('i')); //뒤부터
//요소 접근
console.log(myString[3]); //대괄호 표기법
console.log(myString.charAt(3));//charAt 메소드
//문자열 길이
console.log(myString.length); // length 프로퍼티
//대소문자 변환
console.log(myString.toUpperCase());//대문자
console.log(myString.toLowerCase());//소문자
//양 끝 공백 제거
console.log(myString.trim()); // trim메소드
//부분 문자열 접근 slice(start,end)
console.log(myString.slice(0,2));
console.log(myString.slice(3));
console.log(myString.slice());
*/

//참조형 복사하기
let numbers1=[1,2,3];
let numbers2=numbers1.slice();

numbers2.push(4);

console.log(numbers1);
console.log(numbers2);


let course1={
  title:'파이썬 프로그래밍 기초',
  language : 'Python'
};

let course2=Object.assign({},course1);
let course3={}

for(let key in course1){
  course3[key]=course1[key];
}
course2.title='알고리즘의 정석';
course3.title='자료구조';
console.log(course1);
console.log(course2);
console.log(course3);