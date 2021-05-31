/*
//캡슐화 -> 특정 프로퍼티에 대한 접근을 미리 정해진 메소드들을 통해서만 가능하도록 하는 것
//프로그램의 안정성 높일 수 있음
class User{
  constructor(email,birthdate){ 
    this.email=email; 
    this.birthdate=birthdate;
  }
  buy(item){ 
    console.log(`${this.email} buys ${item.name}`);
  }

  get email() {//프로퍼티의 값을 구하는 함수
  return `Email Address is ${this._email}`;
  }

  set email(address){ //setter 메소드
    if (address.includes('@')){ //값에 대한 유효성 검사
      this._email=address; //숨기고자하는 프로퍼티 이름을 앞에 언더바를 붙임
    }
    else{
      throw new Error('invalid email address');
    }
  }
}

const item={
  name:'스웨터',
  price:30000,
};

const user1=new User('chris123@google.com','1992-03-21');
user1.email='chris_robert@google.com';
console.log(user1.email);
*/

/*
//상속
class User{ //부모클래스
  constructor(email,birthdate){ 
    this.email=email; 
    this.birthdate=birthdate;
  }
  buy(item){ 
    console.log(`${this.email} buys ${item.name}`);
  }
}

class PremiumUser extends User{ //자식클래스
  constructor(email,birthdate,level){
    super(email,birthdate);//부모클래스에 있는 생성자 함수를 의미
    this.level=level;
  }
  streamMusicForFree(){
    console.log(`Free music streaming for ${this.email}`);
  }
}

const item={
  name:'스웨터',
  price:30000,
};

const pUser1=new PremiumUser('chris123@google.com','1992-03-21',3);

console.log(pUser1.email);
console.log(pUser1.birthdate);
console.log(pUser1.level);
pUser1.buy(item);
pUser1.streamMusicForFree();
*/

/*
//다형성
class User{
  constructor(email,birthdate){ 
    this.email=email; 
    this.birthdate=birthdate;
  }
  buy(item){ 
    console.log(`${this.email} buys ${item.name}`);
  }
}

class PremiumUser extends User{
  constructor(email,birthdate,level,point){
    super(email,birthdate);
    this.level=level;
    this.point=point;
  }

  buy(item){ //자식클래스에서 부모클래스에 있는 메소드 이름을 동일하게 정의하고 다른 내용을 채우는 것 -> 오버라이딩
    super.buy(item); //부모 클래스의 buy 메소드를 그대로 호출
    this.point+=item.price*0.05;
  }

  streamMusicForFree(){
    console.log(`Free music streaming for ${this.email}`);
  }
}


const item={
  name:'스웨터',
  price:30000,
};


const user1=new User('chris123@google.com','1992-03-21');
const pUser1=new PremiumUser('tommy@google.com','1990-12-07',3);

const users=[user1,pUser1];
users.forEach((user)=>{
  user.buy(item);
  console.log(user instanceof PremiumUser); //어떤 클래스로 만든 객체인지 확인하고 싶을 때
  //자식클래스로 만든 객체는 부모 클래스로 만든 객체로도 인정됨
});
*/

//static 프로퍼티와 static 메소드 -> 클래스에 직접적으로 딸려있는 것들
class Math{
  static PI=3.14; // static을 붙이면 class로 객체를 생성하지 않아도 프로퍼티와 메소드 사용 가능 

  static getCircleArea(radius){
    return Math.PI * radius * radius;
  }
}

Math.PI=3.141592; // 바로 변경 가능
Math.getRectangleArea= function(width,height){
  return width*height;
}

console.log(Math.PI); //클래스 이름으로 바로 접근
console.log(Math.getRectangleArea(4,5));

console.log(Date.now());//now라는 static 메소드
