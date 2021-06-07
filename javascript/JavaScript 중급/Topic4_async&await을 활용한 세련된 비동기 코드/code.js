//async/await이란?

async function fetchAndPrint(){
  console.log(2);
  const response = await fetch('https://jsonplaceholder.typicode.com/users');
  console.log(7);
  const result=await response.text();
  console.log(result);
}
console.log(1);
fetchAndPrint(); //await을 만나면 일단 뒤의 코드를 실행하고 코드의 실행흐름은 fetchAndPrint함수를 호출한 곳으로 가게됨
console.log(3);
console.log(4);
console.log(5);
console.log(6);
//바깥코드가 다 실행되고 난 뒤 await 뒤에있는 promise객체가 fulfilled상태가 될 때까지 기다림

//async -> 비동기, 함수안에 비동기적으로 실행 될 부분이 있다는 것을 의미
//await -> 그 뒤의 코드를 실행하고 그 코드가 리턴하는 promise 객체가 fulfilled상태가 될 때까지 기다려줌
//await은 async함수 내에서만 사용 가능


async function fetchAndPrint(){
  try{
  const response = await fetch('https://jsonplaceholder.typicode.com/users');
  const result=await response.text();
  console.log(result);
  }
  catch(error){
    console.log(error);
  }
  finally{
    console.log('exit');
  }
}

fetchAndPrint();


//async함수는 항상 promise 객체를 리턴함
async function fetchAndPrint(){
  //return 3; //-> 작업성공결과가 3인 promise객체를 리턴
  return fetch('https://jsonplaceholder.typicode.com/users')
  .then((response)=>response.text());
}
fetchAndPrint();


//하나의 async함수 안에서 또 다른 async 함수를 사용할 수 있음
const applyPrivacyRule = async function(users){
  const resultWithRuleApplied=users.map((user)=>{
    const keys=Object.keys(user);
    const userWithoutPrivateInfo={};
    keys.forEach((key)=>{
      if(key!=='address'&&key!=='phone'){
        userWithoutPrivateInfo[key]=user[key];
      }
    });
    return userWithoutPrivateInfo;
  });

  const p = new Promise((resolve,reject)=>{
    setTimeout(()=>{resolve(resultWithRuleApplied);},2000);
  });
  return p;
};

async function getUsers(){
  try{
    const response=await fetch('https://jsonplaceholder.typicode.com/users');
    const result=await response.text();
    const users=JSON.parse(result);
    const resultWithPrivacyRuleApplied=await applyPrivacyRule(users); //async함수 안에서 await을 붙여서 또 다른 async함수를 사용할 수 있음 
    return resultWithPrivacyRuleApplied;
  }
  catch(error){console.log(error);}
  finally{console.log('exit');}
}

getUsers().then((result)=>{console.log(result);});