//모듈 문법 -> printer.js에서 export한 것을 이 파일에서 사용하겠다고 import 해야 사용 가능
//이름바꾸기 -> 변수 이름 as 파일내에서 사용할 이름
// 한꺼번에 다루기 -> * 키워드 사용 (와일드 카드 문자)
import {
  default as codeit, //default는 무조건 as 키워드로 받아와야함
  title as membersTitle, 
  data as membersData
} from './members.js';

//default export는 다음과 같은 방식으로도 가져올 수 있음
//import codeit,{
//  title as membersTitle, 
//  data as membersData
//} from './members.js';

import * as printerJS from'./printer.js'; 

const title='Codeit';

printerJS.print(title);
printerJS.print(membersTitle);
console.log(printerJS.title);
console.log(codeit);