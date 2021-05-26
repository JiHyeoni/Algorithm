/*
// 조건 연산자(Conditional operator)
if(조건){
//조건이 true 일 때 동작
}
else{
  //조건이 false일 때 동작
}

switch(값){
  case A:
    //값이 A와 일치할 때 동작
    break;
  default:
    //값과 일치하는 case가 없을 때 동작
}

//조건 ? truthy 할 때 표현식 :  falsy 할 때 표현식 -> 상황 연산자(Ternary operator)

const CUT_OFF=80;
function passChecker(score){
  return score>CUT_OFF?'합격!':'불합격!';
}
console.log(passChecker(75));
*/

/*
//Spread 구문(Spared Syntax) -> 개별값으로 펼쳐진 것
const numbers=[1,2,3];
console.log(...numbers);

const webPulishing=['HTML','CSS'];
const interactiveWeb=webPulishing; //주소값 참조
const interactiveWeb1=webPulishing.slice();
const interactiveWeb2=[...webPulishing,'Python'];

interactiveWeb.push('JavaScript');

console.log(webPulishing);
console.log(interactiveWeb);
console.log(interactiveWeb1);
console.log(interactiveWeb2);


const arr1=[1,2,3];
const arr2=[4,5,6];
const arr3=[...arr1,...arr2];
console.log(arr3);
const arr4=arr1.concat(arr2);
console.log(arr4);

const introduce=(name,birth,job)=>{
  console.log('안녕하세요! 반갑습니다.');
  console.log(`저는 ${name}입니다.`);
  console.log(`${birth}년 생이고,`);
  console.log(`직업은 ${job}입니다.`);
  console.log(`잘 부탁드립니다 :)`);
};

const myArr=['코드잇',2017,'프로그래밍 강사'];
introduce(...myArr);

//배열을 펼쳐서 객체로 만들기
const members=['태호','총훈','우재'];
const newObject={...members};
console.log(newObject);
*/

/*
//모던한 프로퍼티 표기법 
//-> 프로퍼티 네임과 value로 사용할 변수나 함수의 이름이 같으면 중복해서 작성하지 않아도 됨
const title='Codeit';
const birth=2017;
const job='프로그래밍 강사';

const user={
  title, //title : title을 이렇게 줄이기 가능
  birth,
  job,
};
console.log(user);


function getFulName(){
  return `${this.firstName} ${this.lastName}`;
}

const user={
  firstName:'Tess',
  lastName:'Jang',
  getFulName, // 함수도 줄이기 가능
};

const admin={
  firstName: 'Alex',
  lastName: 'Kim',
  getFulName: getFulName,
};


const user1={
  firstName:'Tess',
  lastName:'Jang',
  getFulName(){ //getFulName: function()에서 : function을 없애기
    return `${this.firstName} ${this.lastName}`;
  }, // 함수 축약형도 가능
};

console.log(user.getFulName());
console.log(admin.getFulName());
*/

/*
//계산된 속성명(computed property name)
const propertyName='birth';
const getjob=()=>'job';

const codeit={
  ['topic'+'Name']:'Modern JavaScript',
  [propertyName]:2017,
  [getjob()]:'프로그래밍 강사',
};

console.log(codeit);
*/


/*
//구조 분해(Destructuring)
//배열
const rank=['효준','유나','민환','재하','규식'];
//const macbook=rank[0];
//const ipad=rank[1];
//const airpods=rank[2];
//const coupon=rank[3];
const[macbook='유나',ipad,airpods,...coupon]=rank;//순서대로 할당, 기본값 할당 가능, rest parameter 가능

console.log(macbook);
console.log(ipad);
console.log(airpods);
console.log(coupon);

let macbook1='효준';
let ipad1='유나';
[macbook1,ipad1]=[ipad1,macbook1]; //교환

console.log('Macbook 당첨자:',macbook1);
console.log('iPad 당첨자:',ipad1);

//객체
const macbook={
  title:'맥북 프로 16형',
  price: 3690000,
  memory:'16GB',
  storage:'1TB SSD 저장 장치',
  display:'16형 Retina 디스플레이',
};

//const title=macbook.title;
//const price=macbook.price;
const propertyName='memory';
const {title,color='silver',price:product,[propertyName]:productMemory,...rest} = macbook; //순서대로 X, 왼편에 선언된 변수의 이름과 똑같은 프로퍼티 네임이 있으면 값 할당 

console.log(title);
console.log(color);
console.log(product);//price:product로 하면 새로운 변수 이름으로 선언 가능
console.log(productMemory);
console.log(rest);

function printWinners([macbook,ipad,airpods,...coupon]){ // 파라미터 부분에서 구조분해 활용
  console.log('이벤트 결과를 알려드립니다!');
  console.log(`맥북의 주인공은 '${macbook}'님 입니다.`);
  console.log(`아이패드의 주인공은 '${ipad}'님 입니다.`);
  console.log(`에어팟의 주인공은 '${airpods}'님 입니다.`);
  console.log('코드잇 3개월 수강권 주인공은');


  for(let user of coupon){
    console.log(`'${user}'님`);
  }
  console.log(`이상 총 ${coupon.length}명 입니다.`);
}

const ranks=['효준','효신','재훈','소원','현승','종훈'];
printWinners(ranks);


const macbook={
  title:'맥북 프로 16형',
  price: 3690000,
  memory:'16GB',
  storage:'1TB SSD 저장 장치',
  display:'16형 Retina 디스플레이',
};

function printSummary({title,color='gray',price}){ //파라미터에서 바로 구조분해 활용
  console.log(`선택한 상품은 ${title}입니다.`);
  console.log(`색상은 ${color}이며,`);
  console.log(`가격은 ${price}원 입니다.`);
};
printSummary(macbook);

//중첩 객체 구조 분해
*/

/*
//에러와 에러 객체
//name, message
//원래 에러 발생할 수도 있지만 에러 객체 생성도 가능
console.log('시작!');
const error=new TypeError('타입 에러가 발생했습니다.');

throw error; //의도적으로 에러 발생시키기
console.log(error.name);
console.log(error.message);

console.log('끝!');

//try catch문
try{
  console.log('에러 전');

  const codeit='코드잇';
  console.log(codeit);
  codeit='codeit';

  const language='JavaScript';
  console.log(language);
}
catch(error){
  console.log('에러 후');
  console.error(error);
  console.log(error.name);
  console.log(error.message);
}
*/

//try catch 활용하기
function printMembers(members){
  try{ // try문도 코드블록이기 때문에 변수 선언의 스코프가 존재
  for(const member of members){
    console.log(member);
  } 
}
catch(err){
  console.error(err);
  alert(`${err.name}가 발생했습니다. 콘솔창을 확인해 주세요.`);
}
}
//예외 처리
const teamA=['상혜','혜진','지혜','혜선'];
printMembers(teamA);

const codeit={name:'codeit'};
printMembers(codeit);

const teamB=['영훈','재훈','종훈','정훈'];
printMembers(teamB);
