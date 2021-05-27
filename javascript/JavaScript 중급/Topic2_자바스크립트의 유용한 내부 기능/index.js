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
*/
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

