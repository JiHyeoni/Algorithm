//Date 객체
let myDate=new Date();
console.log(myDate);

/*
//for .. in
let codeit={
  name:'코드잇',
  bornYear: 2017,
  isVeryNice:true,
  worstCourse:null,
  bestCourse: '자바스크립트 프로그래밍 기초'
};

for (let key in codeit){
  console.log(key);
  console.log(codeit[key]);
}

//메소드(Method)

let greetings={
  sayHello:function(name){
    console.log(`Hello ${name}!`);
  },
  sayHi:function(){
    console.log('Hi!');
  },
  sayBye:function(){
    console.log('Bye!');
  }
};

greetings.sayHello('Codeit');
greetings['sayHello']('Codeit');

let rectAngle={
  width:30,
  height:50,
  getArea:function(){
    return rectAngle.width*rectAngle.height;
  }
}

let triAngle={
  width:15,
  height:40,
  getArea:function(){
    return triAngle.width*triAngle.height/2;
  }
}

//객체(Object)

let codeit={
  name:'코드잇',
  bornYear: 2017,
  isVeryNice:true,
  worstCourse:null,
  bestCourse:{
    title:'자바스크립트 프로그래밍 기초',
    language:'JavaScript'
  }
};

//점 표기법(objectName.propertyName)
console.log(codeit.bornYear);
console.log(codeit.bestCourse.title);

//대괄호 표기법(objectName['propertyName'])
console.log(codeit['bornYear']);
let propertyName='name';
console.log(codeit[propertyName]);
console.log(codeit.bestCourse['title']);

//프로퍼티 수정
console.log(codeit.name);
codeit.name='codeit';
console.log(codeit.name);

//프로퍼티 수정
console.log(codeit.ceo);
codeit.ceo='강영훈';
console.log(codeit.ceo);

//프로퍼티 삭제
console.log(codeit.worstCourse);
delete codeit.worstCourse;
console.log(codeit.worstCourse);

console.log(codeit.name!==undefined);
//'propertyName' in Object
console.log('name' in codeit); // 해당 프로퍼티가 객체안에 있는지
*/