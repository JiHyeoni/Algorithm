/*
//window : 전역객체 (Global Object)
console.log(window);
console.log(window.innerWidth);
console.log(window.innerHeight);
*/

/*
//DOM (Document Object Model)
console.log(document);
console.log(typeof document);
console.dir(document);

const title=document.querySelector('#title');
*/

/*
//DOM 트리 여행하기
const myTag=document.querySelector('#list-1');
console.log(myTag);

//형제 요소 노드
console.log(myTag.previousElementSibling);
console.log(myTag.nextElementSibling);

//부모 요소 노드
console.log(myTag.parentElement);

//자식 요소 노드
console.log(myTag.children);
console.log(myTag.children[1]);
console.log(myTag.firstElementChild);
console.log(myTag.lastElementChild);

//서로 연결해서 탐색 가능
console.log(myTag.parentElement.nextElementSibling);
*/

/*
//요소 노드 주요 프로퍼티
const myTag= document.querySelector('#list-1');

//innerHTML
console.log(myTag.innerHTML);
myTag.innerHTML+='<li>Exotic</li>'

//outerHTML
console.log(myTag.outerHTML); //해당 요소를 포함한 전체 HTML코드를 문자열로 리턴
//myTag.outerHTML='<ul id="new-list"><li>Exotic</li></ul>'
// -> outerHTML에 값을 할당하게 되면 처음 선택한 요소는 사라짐

//textContent
console.log(myTag.textContent); //text만 가져옴
myTag.textContent='<li>new text!</li>';
*/

/*
const today = document.querySelector('#today');

today.innerHTML = '<li>처음</li>' + today.innerHTML;
today.innerHTML = today.innerHTML + '<li>마지막</li>';

today.outerHTML = '<p>이전</p>' + today.outerHTML; 

const newToday = document.querySelector('#today');
newToday.outerHTML = newToday.outerHTML + '<p>다음</p>';

// 요소 노드 추가하기
const tomorrow = document.querySelector('#tomorrow');

// 1. 요소 노드 만들기 : document.createElement('태그이름');
const first=document.createElement('li');

// 2. 요소 노드 꾸미기 : textContent, innerHTML, ...
first.textContent='처음';

// 3. 요소 노드 추가하기 : NODE.prepend, append, after, before
tomorrow.prepend(first); //prepend -> 노드의 첫 번째 노드로 파라미터로 전달한 값을 추가할 수 있음

const last=document.createElement('li');
last.textContent='마지막';
tomorrow.append(last);

const prev=document.createElement('p');
prev.textContent='이전';
tomorrow.before('문자열', prev);

const next=document.createElement('p');
next.textContent='다음';
tomorrow.after(next);
*/

/*
// 노드 삭제와 이동
const today=document.querySelector('#today');
const tomorrow=document.querySelector('#tomorrow');

//노드 이동하기 : prepend, append, after, before
today.append(tomorrow.children[1]);
tomorrow.children[1].after(today.children[1]);


// 노드 삭제하기 : Node.remove();
tomorrow.remove();
today.children[2].remove();
*/

/*
// HTML 속성 (HTML attribute)
const tomorrow = document.querySelector('#tomorrow');
const item = tomorrow.firstElementChild;
const link = item.firstElementChild;

// elem.getAttribute('속성'): 속성에 접근하기
console.log(tomorrow.getAttribute('href'));
console.log(item.getAttribute('class'));

// elem.setAttribute('속성', '값'): 속성 추가(수정)하기
tomorrow.setAttribute('class', 'list'); // 추가
link.setAttribute('href', 'https://www.codeit.kr'); // 수정 -> 이미 존재하기 때문에

// elem.removeAttribute('속성'): 속성 제거하기
tomorrow.removeAttribute('href'); 
tomorrow.removeAttribute('class'); 

// id 속성
console.log(tomorrow);
console.log(tomorrow.id);

// class 속성
console.log(item);
console.log(item.className);

// href 속성
console.log(link);
console.log(link.href);
console.log(tomorrow.href);

*/

// 스타일 다루기
const today = document.querySelector('#today');
const tomorrow = document.querySelector('#tomorrow');

// elem.classList : add, remove, toggle
const item = tomorrow.children[1];
item.classList.add('done'); // 클래스 추가
item.classList.remove('done'); //클래스 제거
item.classList.toggle('done'); //있으면 제거, 없으면 추가


// elem.className -> 클래스 속성값 전체가 바뀌게 됨, 추가는 X
today.children[1].className='done';


// style 프로퍼티 -> 별로 좋은 방법은 아님
today.children[0].style.textDecoration = 'line-through';
today.children[0].style.backgroundColor='#DDDDDD';