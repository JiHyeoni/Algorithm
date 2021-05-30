/*
//Object-Literal
const user={
  email:'chris123@google.com',
  birthdate:'1992-03-21',
  buy(item){
    console.log(`${this.email} buys ${item.name}`);
  },
};

const item={
  name:'스웨터',
  price:30000,
};

console.log(user.email);
console.log(user.birthdate);
user.buy(item);
*/

/*
//Factory function -> 객체를 생성해서 리턴하는 함수
function createUser(email,birthdate){
  const user={
    email,
    birthdate,
    buy(item){
      console.log(`${this.email} buys ${item.name}`);
    },
  };
  return user;
}


const item={
  name:'스웨터',
  price:30000,
};

const user1=createUser('chris123@google.com','1992-03-21');
const user2=createUser('jerry99@google.com','1995-07-19');

console.log(user1.email);
console.log(user2.email);
user1.buy(item);
user2.buy(item);
*/

/*
//Constructor Function => 생성자 함수
function User(email,birthdate){ //보통 대문자로 시작
  this.email=email;
  this.birthdate=birthdate;
  this.buy=function(item){
    console.log(`${this.email} buys ${item.name}`);
  };
}

const item={
  name:'스웨터',
  price:30000,
};

const user1=new User('chris123@google.com','1992-03-21');
const user2=new User('jerry99@google.com','1995-07-19');

console.log(user1.email);
console.log(user2.email);

console.log(user1.birthdate);
console.log(user2.birthdate);

user1.buy(item);
*/

//Class
class User{
  constructor(email,birthdate){ //생성자 -> 보통 프로퍼티를 넣음
    this.email=email; //생성되는 객체
    this.birthdate=birthdate;
  }
  buy(item){ //해당 객체의 메소드
    console.log(`${this.email} buys ${item.name}`);
  }
}

const item={
  name:'스웨터',
  price:30000,
};

const user1=new User('chris123@google.com','1992-03-21');

console.log(user1.email);
console.log(user1.birthdate);
user1.buy(item);

const user2=new User('jerry99@google.com','1995-07-19');

console.log(user2.email);
console.log(user2.birthdate);
user2.buy(item);