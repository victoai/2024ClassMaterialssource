// 객체란? 다양한 값을 담는 자료형  


//객체만들기1
let objB = new Object();
objB.name = "John";
objB.age = 30;
console.log(objB);
 
 
//객체만들기2

let objA = {
    name : "john" ,
    age : 30
};

console.log( objA);


//객체 속성 다루기 

let  person = {
   name : "홍길동" ,
   age:25,
   address: "서울"
}


console.log( person.name);
console.log( person["age"]);

person.gender="male";

console.log( person);


