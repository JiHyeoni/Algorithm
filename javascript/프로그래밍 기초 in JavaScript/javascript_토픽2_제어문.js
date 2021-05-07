//break와 continue
for(let i=1;i<=10;i++){
  if(i%2===0){
    continue;
  }
  console.log(i);
}
let i=1;

while(i<=10){
  console.log(i);
  if(i===7){
    break;
  }
  i++;
}

/*
//while문
let i=1;
while(i<=10){
  console.log(`${i} 코드잇 최고!`)
  i++
}

//for 반복문(loop statement)
for(let i=1; i<=10; i++){
  console.log(`${i} 코드잇 최고!`);
}

// switch문(switch statement)
switch(비교할값){
  case 조건값1:
    동작부분;
    break;
  case 조건값2:
    동작부분;
    break;
  default:
    동작부분;
}

//if문 (if statement)
let temperature=140;

if(temperature<=0){
  console.log('물이 업니다.')
}
else if(temperature<100){
  console.log('물이 얼지도 끓지도 않습니다.')
}
else if(temperature<150){
  console.log('물이 끓습니다.')
}
else{
  console.log('물이 모두 수증기가 되었습니다.')
}
*/