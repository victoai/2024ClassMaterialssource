 


 let person= {
    name : "김혜윤",
    age : 29 ,
    sayHi : function() {
         console.log(  "안녕하세요");
    }
 }



 console.log( person);
 person.sayHi();

 
 person.sayHi.call(person);  
 
