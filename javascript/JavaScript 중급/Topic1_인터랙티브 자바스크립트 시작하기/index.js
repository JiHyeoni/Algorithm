/*
//id로 태그 선택하기
const myTag=document.getElementById('btns');
console.log(myTag);
*/


/*
//class로 태그 선택하기
const myTags = document.getElementsByClassName('color-btn');
console.log(myTags);
//배열의 메소드는 사용 불가 X, 대괄호 표기법으로 접근은 가능 -> 유사배열
console.log(myTags[1]);
console.log(myTags.length);

for(let tag of myTags){
  console.log(tag);
}
*/
/*
//css 선택자로 태그 선택하기
const myTag=document.querySelector('#myNumber');
console.log(myTag);
const myTags=document.querySelectorAll('.color-btn');
console.log(myTags); //querySelector를 class에 사용하면 맨 앞 요소만 출력됨
*/

//이벤트(Event)와 버튼 클릭
const btn=document.querySelector('#myBtn');

//이벤트 핸들링(Event Handling)
btn.onclick=function(){ //이벤트 핸들러(Event Handler)
  console.log('Hello Codeit!');
}