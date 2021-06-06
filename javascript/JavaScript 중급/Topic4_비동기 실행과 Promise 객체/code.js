//한번 시작된 작업이 완료되기전에 바로 다음코드로 실행이 넘어가고
//나중에 콜백이 실행 됨으로써 작업이 마무리 되는 것 -> 비동기 실행

console.log('Start!');
fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>response.text())
.then((result)=>{consolelog(result);});
console.log('End');

//promise 객체 -> 작업에 관한 상태정보를 담고있는 객체
// 1. pending -> 작업이 진행중인 상태
// 2. fulfilled-> 작업이 성공 + 작업 성공 결과
// 3. rejected -> 작업이 실패 + 작업 실패 정보

//fetch함수는 promise 함수를 리턴 
//-> promise상태가 fullfilled상태일 때 then에 등록해둔 콜백함수 실행
//-> 작업성공 결과가 callback의 파라미터(response)로 넘어옴

//promise chaining -> promise 객체에 then메소드를 연속적으로 붙이는 것
//1. 콜백에서 promise 객체를 return 하는 경우
// -> then 메소드가 리턴했던 promise 객체는 콜백이 리턴한 promise객체와 동일한 상태와 결과를 갖게됨
//2. 콜백에서 promise 객체가 아닌 값을 리턴하는 경우
// -> then 메소드가 리턴했던 promise 객체는 fullfilled상태가 되고 콜백의 리턴값을 작업성공결과로 받게됨
console.log('Start!');
fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>response.text())
.then((result)=>{
  const user=JSON.parse(result);
  return user[0];
})
.then((user)=>{
  console.log(user);
  const {address}=user;
  return address;
})
.then((address)=>{
  console.log(address);
  const {geo}=address;
  return geo;
})
.then((geo)=>{
  console.log(geo);
  const {lat} = geo;
  return lat;
})
.then((lat)=>{
  console.log(lat);
});

console.log('End');



console.log('Start!');
fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>response.text())
.then((result)=>{
  const users=JSON.parse(result);
  const user=users[0];
  console.log(user);
  const {address}=user;
  console.log(address);
  const {geo}=address;
  console.log(geo);
  const {lat}=geo;
  console.log(lat);
});
console.log('End');

//promise chaining은 비동기 작업을 순차적으로 실행해야 할 때 
//전체 코드를 좀 더 깔끔하게 나타내기 위해 사용

fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>response.text())
.then((result)=>{
  const users=JSON.parse(result);
  const {id}=users[0];
  return fetch(`https://jsonplaceholder.typicode.com/posts?userId=${id}`);
})
.then((response)=>response.text())
.then((posts)=>{
  console.log(posts);
});

console.log('End');


//rejected상태가 되면 실행할 콜백
fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>response.text(),(error)=>{console.log(error);})
//첫번째 콜백 -> promise 객체가 fulfilled상태가 되면 실행, 두번째 객체 -> promise 객체가 rejected 상태가 되면 실행
.then((result)=>{console.log(result);});


//catch메소드 -> 가장 마지막에 작성하는것이 좋음
fetch('https://jsonplaceholder.typicode.commmmm/users')
.then((response)=>response.text())
.then((reulst)=>{
console.log(result);
throw new Error('test');
})
.catch((error)=>{console.log(error);}); //catch->promise객체가 rejected 상태가 되면 실행할 코드를 등록하는 메소드

//finally 메소드 -> fulfilled,rejected 상태 상관없이 실행시키고 싶은 메소드가 있을 때
//catch메소드보다도 뒤에 사용
fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>ressponse.text())
.then((result)=>{console.log(result);})
.catch((error)=>{console.log(error);})
.finally(()=>{console.log('exit');}); //파라미터 필요X


fetch('https://jsonplaceholder.typicode.com/users')
.then((response)=>response.text())
.then((result)=>{console.log(result);})
.catch((error)=>{
  console.log(error);
  throw new Error('from catch method');
})
.finally(()=>{console.log('exit');});


//직접 만들어보는 promise 객체

const p = new Promise((resolve,reject)=>{
  //setTimeout(()=>{resolve('success');},2000);//resolve함수는 promise객체를 fulfilled상태로 만듦, argument는 작업성공내용이 됨
  setTimeout(()=>{reject (new Error('fail'),2000);}); //reject->생성되는 promise객체를 rejected상태로 만듦, argument는 작업 실패 정보
});

//p.then((result)=>{console.log(result);})
p.catch((error)=>{console.log(error);});