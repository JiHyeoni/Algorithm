//상수(constant)
const PI=3.14;
let radius = 0;

//원의 넓이를 계산하는 함수
function calculateArea(){
  return PI*radius*radius;
}

//반지름에 따른 원의 넓이를 출력하는 함수
function printArea(){
  return `반지름이 ${radius}일 때, 원의 넓이는 ${calculateArea()}`;
}

radius=4;
console.log(printArea());

radius=7;
console.log(printArea());

/*
//Scope: 범위, 영역
let x=3;//글로벌 변수, 전역 변수
function myFunction(){//블록문(Block Statement)
let x=5;//로컬 변수, 지역 변수 (블록문 안에서만 유효)
console.log(x);
}

myFunction();
console.log(x);

//옵셔널 파라미터(Optional Parameters)
function introduce(name,age,nationality='한국'){
  console.log(`제 이름은 ${name}입니다.`);
  console.log(`나이는 ${age}살 이고,`);
  console.log(`국적은 ${nationality}입니다.`);
};

introduce('코드잇',4,'미국'); //값을 모두 전달한 경우
console.log('');
introduce('코드잇',4);//파라미터 값을 생략한 경우

function printSquare(x){
  console.log(x*x);
};

function getSquare(x){
  return x*x;
};

printSquare(3);
console.log(getSquare(3));
console.log(printSquare(3));

function square(x){
  console.log('return 전');
  return x*x; //함수호출 값 반환, 함수자체의 실행 중단 역할
  console.log('return 후'); //Dead Code
};
console.log('함수 호출 전');
console.log(square(3));
console.log('함수 호출 후');


//할당 연산자
let name='코드잇';
let x=5;

x=x-2;
console.log(x);
*/