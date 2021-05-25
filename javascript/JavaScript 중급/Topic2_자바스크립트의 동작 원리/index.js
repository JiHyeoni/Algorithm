/*
//AND와 OR의 연산 방식
console.log('Codeit'&&'JavaScript');
//왼쪽값이 true일 경우 오른쪽 값 리턴, 왼쪽값이 false인경우 왼쪽 값 리턴
console.log('Codeit'||'JavaScript');
//왼쪽값이 true일 경우 왼쪽 값 리턴, 왼쪽값이 false인 경우 오른쪽 값 리턴

console.log(null&&undefined); //null
console.log(0||true); //true
console.log('0'&&NaN); // NaN
console.log({}||123); //{}

function print(value){
  const message=value||'Codeit';

  console.log(message);
}

print();
print('JavaScript');
*/

//변수와 스코프
//var 키워드의 단점 1.호이스팅 2.중복 선언 3. 스코프의 차이(전역변수)-> let이나 const 사용

// var x; 함수스코프 (function scope)
// let y; 블록 스코프 (block scope)
// const z; 블록 스코프 (block scope)

let x=3;
if(x<4){
  let y=3;
}

for(let i=0;i<5;i++){
  console.log(i);
}
console.log('x: ',x);
console.log('y: ',y);
console.log('i: ',i);