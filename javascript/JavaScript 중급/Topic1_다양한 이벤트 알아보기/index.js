/** 
 * [마우스 버튼 이벤트]
 * 
 * > MouseEvent.button
 * 0: 마우스 왼쪽 버튼
 * 1: 마우스 휠
 * 2: 마우스 오른쪽 버튼
 * 
 * > MouseEvent.type
 * click: 마우스 왼쪽 버튼을 눌렀을 때
 * contextmenu: 마우스 오른쪽 버튼을 눌렀을 때
 * dblclick: 동일한 위치에서 빠르게 두번 click할 때
 * mousedown: 마우스 버튼을 누른 순간
 * mouseup: 마우스 버튼을 눌렀다 뗀 순간
 */


/** 
 * [마우스 이동 이벤트]
 * 
 * > MouseEvent.type
 * mousemove: 마우스 포인터가 이동할 때
 * mouseover: 마우스 포인터가 요소 밖에서 안으로 이동할 때
 * mouseout: 마우스 포인터가 요소 안에서 밖으로 이동할 때 
 *
 * > MouseEvent.clientX, clientY
 * : 화면에 표시되는 창 기준 마우스 포인터 위치   
 * 
 * > MouseEvent.pageX, pageY
 * : 웹 문서 전체 기준 마우스 포인터 위치
 * 
 * > MouseEvent.offsetX, offsetY
 * : 이벤트가 발생한 요소 기준 마우스 포인터 위치
 */
 
/*
 const box1 = document.querySelector('#box1');

 function onMouseMove(e){
   //console.log('mouse is moving!');
   console.log(`client: (${e.clientX}, ${e.clientY})`); // 창 위치 기준
   console.log(`page: (${e.pageX}, ${e.pageY})`); // 문서 전체 위치 기준
   console.log(`offset: (${e.offsetX}, ${e.offsetY})`); // 요소 위치 기준
   console.log('------------------------------------');
 }

 box1.addEventListener('mousemove', onMouseMove);
 */

 /** 
 * [마우스 이동 이벤트]
 * 
 * > MouseEvent.type
 * mousemove: 마우스 포인터가 움직일 때
 * mouseover: 마우스 포인터가 요소 밖에서 안으로 움직일 때
 * mouseout: 마우스 포인터가 요소 안에서 밖으로 움직일 때 
 * 
 * > MouseEvent.target
 * : 이벤트가 발생한 요소
 * 
 * > MouseEvent.relatedTarget
 * : 이벤트가 발생하기 직전(또는 직후)에 마우스가 위치해 있던 요소
 */


/* 
const box2 = document.querySelector('#box2');

function printEventData(e) {
  console.log('event:', e.type);
  console.log('target:', e.target);
  console.log('relatedTarget:', e.relatedTarget);
  console.log('------------------------------------');
*/
/*
  if (e.target.classList.contains('cell')) {
    e.target.classList.toggle('on');
  }
*/
/*
}

box2.addEventListener('mouseover', printEventData);
box2.addEventListener('mouseout', printEventData);
*/

/** 
 * [키보드 이벤트]
 * 
 * > KeyboardEvent.type
 * keydown: 키보드 버튼을 누른 순간
 * keypress: 키보드 버튼을 누른 순간
 * keyup: 키보드 버튼을 눌렀다 뗀 순간
 * 
 * > KeyboardEvent.key
 * : 이벤트가 발생한 버튼의 값
 * 
 * > KeyboardEvent.code
 * : 이벤트가 발생한 버튼의 키보드에서 물리적인 위치
 */

/**
 * [input 태그 다루기]
 *  
 * > 포커스 이벤트
 * focusin: 요소에 포커스가 되었을 때
 * focusout: 요소에 포커스가 빠져나갈 때
 * focus: 요소에 포커스가 되었을 때 (버블링 x)
 * blur: 요소에 포커스가 빠져나갈 때 (버블링 x)
 * 
 * > 입력 이벤트
 * input: 사용자가 입력을 할 때
 * change: 요소의 값이 변했을 때
 */

/*
 const el = document.querySelector('#form');

 function printEventType(e) {
   console.log('type:', e.type);
   console.log('target:', e.target);
   console.log('---------');
 }
 
 el.addEventListener('focusin', printEventType);
 el.addEventListener('focusout', printEventType);
 el.addEventListener('input', printEventType);
 el.addEventListener('change', printEventType);
 */

 // Scroll 이벤트
/*
function printEvent(e){
  console.log(e);
  console.log(window.scrollY);
}
window.addEventListener('scroll',printEvent);
*/
 
let lastScrollY = 0;

function onSroll() {
  const nav = document.querySelector('#nav');
  const toTop = document.querySelector('#to-top');
  const STANDARD = 30;
  
  if (window.scrollY > STANDARD) { // 스크롤이 30px을 넘었을 때
    nav.classList.add('shadow');
    toTop.classList.add('show');
  } else { // 스크롤이 30px을 넘지 않을 때
    nav.classList.remove('shadow');
    toTop.classList.remove('show');
  } 

	if (window.scrollY > lastScrollY) { // 스크롤 방향이 아랫쪽 일 때
    nav.classList.add('lift-up');
  } else { // 스크롤 방향이 윗쪽 일 때
    nav.classList.remove('lift-up');
  }

  lastScrollY = window.scrollY;
}

window.addEventListener('scroll', onSroll);