/*
//forEach와 map
const members=['영훈','윤수','동묵','태호'];

for(let member of members){
  console.log(`${member}님이 입장하셨습니다.`);
}

members.forEach(function(member){ //argument로 callback함수를 작성
  console.log(`${member}님이 입장하셨습니다.`);
});

members.forEach((member,index)=>{ //argument로 callback함수를 작성
  console.log(`${index} ${member}님이 입장하셨습니다.`);
});
//첫번째 파라미터는 배열의 요소, 두번째 파라미터는 요소의 인덱스, 세번째 파라미터는 반복적인 배열

const firstNames=['영훈','윤수','동묵','태호'];
const lastNames=['강','이','손','성'];

firstNames.forEach((firstNames,i,arr)=>{
  console.log(`${lastNames[i]}${firstNames}님이 입장하셨습니다.`);
  console.log(arr);
});

//map은 for each와 사용하는 방식은 같으나 메소드의 호출 결과로 새로운 배열 리턴, for each는 return값이 없음
const fulNames = firstNames.map((firstNames,i)=>{
  return lastNames[i]+firstNames;
});
console.log(fulNames);
//배열의 반복 작업이 필요할 때는 for each를, 반복작업을 통해서 새로운 배열이  필요한 경우에는 map 메소드 활용
//최대 반복횟수는 메소드를 처음 호출할 때 그당시 요소의 개수
*/

/*
//filter와 find -> 원하는 조건에 맞는 요소들만 추려내서 새로운 배열을 만듦
//차이점 1. filter는 return값이 배열, find는 값
//차이점 2. 같은 배열에서 메소드를 호출하더라도 반복되는 횟수의 차이 존재 (find는 조건에 만족하는 하나의 값만 찾음)
const devices=[
  {name: 'GalaxyNote', brand:'Samsung'},
  {name: 'Macbookpro', brand:'Apple'},
  {name: 'iPad', brand:'Apple'},
  {name:'GalaxWatch', brand: 'Samsung'},
  {name:'iMac',brand:'Apple'},
  {name:'GalaxyBuds',brand:'Samsung'},
  {name:'Gram',brand:'LG'},
  {name:'GalaxyBook',brand:'Samsumg'},
  {name:'SurfacePro',brand:'Microsoft'},
  {name:'ZenBook',brand:'Asus'},
  {name:'MacbookAir',brand:'Apple'},
];

const apples=devices.filter((el,i)=>{
  console.log(i);
  return el.brand==='Apple';
});

console.log(apples);

const myLaptop = devices.find((el,i)=>{
  console.log(i);
  return el.brand==='Banana';
});

console.log(myLaptop);
*/
 

/*
//some과 every
const numbers=[1,3,5,7,9];

//some : 조건을 만족하는 요소가 1개 이상 있는지
const someReturn = numbers.some((el)=>el>5);

//every : 모든 요소가 조건을 만족하는지
const everyReturn = numbers.every((el)=>el>5);

console.log('some:',someReturn);
console.log('every:',everyReturn);
*/

//reduce
//numbers.reduce((acc,el,i,arr)=>{ //acc 누산기 -> 직전에 동작한 콜 백 함수가 리턴한 값을 전달받음
//  return nextAccValue;
//},initialAccValue);// 첫번째 콜백함수가 동작할 때 acc의 값을 전달
const numbers=[1,2,3,4];

const sumAll=numbers.reduce((acc,el,i)=>{
  console.log(`${i}번 index의 요소로 콜백함수가 동작중입니다.`);
  console.log('acc:',acc);
  console.log('el:',el);
  console.log('------------');
  return acc+el;
},0);

console.log('sumAll:',sumAll);