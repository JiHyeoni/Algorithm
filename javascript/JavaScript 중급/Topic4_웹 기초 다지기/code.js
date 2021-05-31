fetch('https://www.google.com') //fetch->서버로 request를 보내고 response를 받는 함수 
.then((response)=>response.text()) //서버에 response가 온 후 실행. 받은 response를 처리 -> 콜 백 함수
//콜백함수(나중에 어떤 조건이 만족되었을 때 실행되는 함수)
//then 콜백을 등록해주는 메소드 -> 나중에 서버에 response가 왔을때 그 콜백이 실행 
.then((result)=>{console.log(result)}); //result->response의 내용