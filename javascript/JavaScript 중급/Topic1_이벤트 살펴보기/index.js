/*
// 이벤트 등록하기
let btn = document.querySelector('#myBtn');

// btn.onclick = function () {
// 	console.log('Hi Codeit!');
// }; -> 새로운 이벤트를 등록하면 덮어쓰게 될 수 있음

function event1() {
	console.log('Hi Codeit!');
}

function event2() {
	console.log('Hi again!');
}

btn.onclick=function(){
  event1();
  event2();
}; -> 이벤트가 복잡해지거나 리턴값을 주고 받을 때 어려움이 생길 수 있음


// elem.addEventListener(event, handler) -> 가장 권장, 하나의 요소에 여러개의 독립적인 핸들러 등록 가능 
btn.addEventListener('click', event1);
btn.addEventListener('click', event2);

// elem.removeEventListener(event, handler)
btn.removeEventListener('click', event2);
*/

/*
// 이벤트 객체 (Event Object)
const myInput = document.querySelector('#myInput');
const myBtn = document.querySelector('#myBtn');

function printEvent(event) {
  console.log(event);
  event.target.style.color='red';
}

myInput.addEventListener('keydown', printEvent);
myBtn.addEventListener('click', printEvent);
*/

/*
// 이벤트 버블링 (Event Bubbling) -> 부모 요소의 핸들러도 동작하게 되는 것
const content = document.querySelector('#content');
const title = document.querySelector('#title');
const list = document.querySelector('#list');
const items = document.querySelectorAll('.item');

content.addEventListener('click', function(e) {
  console.log('content Event');
  //console.log(e.currentTarget);
});

title.addEventListener('click', function(e) {
  console.log('title Event');
  //console.log(e.currentTarget);
});

list.addEventListener('click', function(e) {
  console.log('list Event');
  //console.log(e.currentTarget);
});

for (let item of items) {
  item.addEventListener('click', function(e) {
    console.log('item Event');
    //console.log(e.currentTarget);
    e.stopPropagation(); // 버블링을 멈추는 방법 but 가급적 버블링을 막는 경우는 피하는 것이 좋음
  });
}
*/


/*
// 이벤트 위임 (Event Delegation)
const list = document.querySelector('#list');

list.addEventListener('click',function(e){
  //if(e.target.tagName==='LI')
  if(e.target.classList.contains('item')/* contains : 해당 요소의 클래스 속성에 있는지 확인해서 불린 형태로 결과 리턴*/
/*  ){ 
    //부모 요소에는 적용되지 않게
    e.target.classList.toggle('done'); // -> 부모요소 리스트에 이벤트 핸들러 등록하면 모든 자식요소의 이벤트 다룰 수 있음
 }
}); 

//for(let item of list.children){
//  item.addEventListener('click',function(e){
//    e.target.classList.toggle('done');
//  })
//}

const li =document.createElement('li');
li.classList.add('item');
li.textContent='일기 쓰기';
list.append(li);
*/


// 브라우저의 기본 동작
const link = document.querySelector('#link');
const checkbox = document.querySelector('#checkbox');
const input = document.querySelector('#input');
const text = document.querySelector('#text');

//event.preventDefault

link.addEventListener('click', function(e) {
	e.preventDefault();
	alert('지금은 이동할 수 없습니다.');
});

input.addEventListener('keydown', function(e) {
	if (!checkbox.checked) {
		e.preventDefault();
		alert('체크박스를 먼저 체크해 주세요.');
	}
});

document.addEventListener('contextmenu', function(e) {
	e.preventDefault();
	alert('마우스 오른쪽 클릭은 사용할 수 없습니다.');
});