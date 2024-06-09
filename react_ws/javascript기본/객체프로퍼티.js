
//객체 속성 다루기   객체.속성명
let  person = {
    name : "홍길동" ,
    age:25,
    address: "서울"
 }
 
 
 console.log( person.name);
 console.log( person["age"]); 

 //동적으로 속성을 추가 할 수 있다.
 person.gender="male";
 
 
 console.log( person);

 


// 객체속성 다루는 방법2  객체[ 속성명 ]
function addProperty( odj, key, value){
    obj[key] = value;
}



let obj={};


addProperty( obj, "name" , "김혜윤");
addProperty( obj, "age" ,  29 );
addProperty (obj, "nickname" , "솔이");



console.log( obj);