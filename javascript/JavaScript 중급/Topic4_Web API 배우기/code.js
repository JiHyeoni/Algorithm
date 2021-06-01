/*
fetch('https://jsonplaceholder.typicode.com/users') //json -> 정보를 교환할 때 사용하기 위해 만들어진 데이터 포맷 
.then((response)=>response.text()) 
.then((result)=>{
  const users=JSON.parse(result);//string타입의 json 데이터를 javascript객체로 변환할 수 있음
  console.log(users.length);
  users.forEach((user)=>{
    console.log(user.name);
  });
}); 


fetch('https://jsonplaceholder.typicode.com/users') 
.then((response)=>response.text()) 
.then((result)=>{console.log(result);});
*/

//get, post request
fetch('https://learn.codeit.kr/api/members')  //get 전체직원
.then((response)=>response.text()) 
.then((result)=>{console.log(result);});

fetch('https://learn.codeit.kr/api/members/3')  //get 특정직원
.then((response)=>response.text()) 
.then((result)=>{console.log(result);});


const newMember={
  name:'Jerry',
  email: 'jerry@codeitmall.kr',
  department:'engineering',
};

fetch('https://learn.codeit.kr/api/members/',{ //post
  method:'POST', //request에 관한 각종 설정 -> 옵션개체(default는 get)
  body:JSON.stringify(newMember), //stringify -> javascript 객체를 string타입의 json 데이터로 변환
})
.then((response)=>response.text())
.then((result)=>{console.log(result); });


//put, delete request
const member={
  name:'Alice',
  email: 'alice@codeitmall.kr',
  department:'marketing',
};

fetch('https://learn.codeit.kr/api/members/2',{
  method:'PUT',
  body:JSON.stringify(member),
})
.then((response)=>response.text())
.then((result)=>{console.log(result); });



fetch('https://learn.codeit.kr/api/members/2',{
  method:'DELETE',
})
.then((response)=>response.text())
.then((result)=>{console.log(result); });