/*
//함수를 만드는 방법
//함수 선언 -> 호이스팅 해도 문제 X, 함수 스코프가 있음
printCodeit(); //Codeit

function printCodeit(){
  console.log('Codeit');
}

//함수 표현식 -> 함수 선언을 값처럼 사용하는 방식, 선언 이전에 접근 불가, 할당된 변수에 따라 스코프 존재
const printCodeit=function(){
  console.log('Codeit');
}
printCodeit();
*/

/*
//값으로서 함수 -> 객체의 프로퍼티나 배열로도 접근 가능
const printJS=function(){
  console.log('JavaScript');
};
console.log(typeof printJS);

const myObject={
  brand:'Codeit',
  bornYear: 2017,
  isVeryNice: true,
  sayHi: function(name){
    console.log(`Hi! ${name}`);
  }
};
myObject.sayHi('JavaScript');

const myArray=[
  'codeit',
  2017,
  true,
  function(name){
    console.log(`Hi! ${name}`);
  },
];
myArray[3]('Codeit');


function makeQuiz(quiz,answer,success,fail){
  if(prompt(quiz)===answer){
    console.log(success());
  }
  else{
    console.log(fail());
  }
};

function getSuccess(){
  return '정답!';
};

function getFail(){
  return '오답!';
};

const question='5 + 3 = ?';

makeQuiz(question,'8',getSuccess,getFail); //콜백 함수


//함수를 리턴하는 함수 -> 고차함수
function getPrintHi() {
  return function(){
    console.log('Hi!?');
  };
};

const sayHi=getPrintHi();
sayHi();
getPrintHi()();
*/

/*
//Parameter
function greeting(name = 'Codeit', interest='JavaScript'){ // 파라미터
  console.log(`Hi! My name is ${name}!`);
  console.log(`I like ${interest}!`);
}

greeting('JavaScript');
greeting('Codeit');
greeting('World'); // 파라미터로 전달하는 값 -> 아규먼트(Argument)

greeting(undefined,'Python');

function defaultTest(x,y=x+3){ //앞쪽에 정의된 파라미터를 사용 할 수 있음
  console.log(`x: ${x}`);
  console.log(`'y: ${y}`);
}

defaultTest(2,3);
*/

/*
//arguments -> 유사배열
function printArguments(a,b,c){
  console.log(a);
  console.log(b);
  console.log(c);
  console.group('-------------------');
  for (const arg of arguments){
    console.log(arg);
  }
  console.log('------------------')
}

printArguments('Young','Mark','Koby');
printArguments('Captain');
printArguments('Jayden','Scott');
printArguments('Suri','Jack','Joy','Noel');
*/

/*
//Rest Parameter -> 배열
function printArguments(...args){
  for(const arg of args){
    console.log(arg);
  }
  console.log('------------------');
  console.log(args.splice(0,2));
  //console.log(arguments.splice(0,2));
  console.log('------------------');
};

printArguments('Young','Mark','Koby');
printArguments('Captain');
printArguments('Jayden','Scott');
printArguments('Suri','Jack','Joy','Noel');

function printRest(first,second,...others){
  console.log('코드잇 레이스 최종 결과');
  console.log(`우승 : ${first}`);
  console.log(`준우승 : ${second}`);
  for(const arg of others){
    console.log(`참가자 : ${arg}`);
  }
}

printRest('Phil','Won','Emma','Min','Luke');
*/

/*
//Arow Function
const getTwice=(number)=>{
  return number*2;
}
console.log(getTwice(5));

const sum=(a,b)=>{
  const result=a+b;
  return result;
}
console.log(sum(10,5));

const getTwice1=number=>number*2; //내부가 return 문 하나로 이루어져 있으면 중괄호와 함께 return 키워드 생략 가능
console.log(getTwice1(6));

const getCodeit=()=>({name:'Codeit',});//return할 것이 객체면 ()로 한번 감싸주기
console.log(getCodeit());
//ArowFunction에서는 arguments 객체는 없음
*/

//this
//console.log(this);

function getFulName(){
  return `${this.firstName} ${this.lastName}`;
}

const user={
  firstName:'Tess',
  lastName:'Jang',
  getFulName: getFulName,
};

const admin={
  firstName: 'Alex',
  lastName: 'Kim',
  getFulName: getFulName,
};

console.log(user.getFulName());
console.log(admin.getFulName());