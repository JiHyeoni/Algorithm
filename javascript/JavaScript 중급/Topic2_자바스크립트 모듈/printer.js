// 모듈의 조건 
// 1. 파일만의 독립적인 스코프 존재해야함 -> 모듈 스코프
// 다른 파일에서 같은 변수이름 사용하면 에러가 발생할 수 있기 때문에 ..
//html type="module" 로 걸어줌
//but export 키워드를 사용하면 다른 파일에서도 사용가능
const title='CodeitPrinter';

function print(value){
  console.log(value);
}

export {title,print}; 
//따로 붙이지 않고 한번에 묶어서 export도 가능, as키퉈드도 사용 가능
