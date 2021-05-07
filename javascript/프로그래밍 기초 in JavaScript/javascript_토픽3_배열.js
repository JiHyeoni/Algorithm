
/*

//배열(Array)

let courseRanking=[
  '자바스크립트 프로그래밍 기초',
  'Git으로 배우는 버전 관리',
  '컴퓨터 개론',
  '파이썬 프로그래밍 기초'
];

//index==PropertyName
console.log(courseRanking[0]);

let members=['쿤갈레','Zerrard66','우리생각해써','흙토끼','End Miracle'];
console.log(typeof members);
console.log(members.length);
console.log(members['length']);
console.log(members[members.length-1]);

//배열 추가
members[5]='NiceCodeit';
console.log(members[5]);

//배열 수정
members[3]='달토끼';
console.log(members);

//배열 삭제,추가,수정 가능(splice(startIndex, deleteCount,item))
console.log(members);
delete members[4]; // 완벽하게 삭제 X
console.log(members);

members.splice(1,1,'NiceCodeit','HiCodeit');
console.log(members);

members.splice(1,0,'1','2');//추가
console.log(members);

members.splice(1,1,'3',);//수정
console.log(members);

let members=['쿤갈레','Zerrard66','우리생각해써','흙토끼','End Miracle'];
console.log(members);

//배열의 첫 요소를 삭제 : shift()
members.shift();
console.log(members);

//배열의 마지막 요소를 삭제 : pop()
members.pop();
console.log(members);

//배열의 첫 요소로 값 추가 : unshift(value)
members.unshift('NiceCodeit');
console.log(members);

//배열의 마지막 요소로 값 추가 : push(value)
members.push('HiCodeit');
console.log(members);

//for .. of
let influencer=['suwonlog','small.tiger','Minam.ludens','cu_convenience24'];

for(let i=0;i<influencer.length;i++){
  console.log(influencer[i]);
}

for(let element of influencer){
  console.log(element);
}
*/

//다차원 배열
let twoDimensional=[[1,2],[3,4]];
console.log(twoDimensional[0][1]);