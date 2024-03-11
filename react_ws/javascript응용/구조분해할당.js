

const Score = {
    userName:"홍",
    age :20
}



//객체 구조분해 할당
const  {userName, age} = Score;

console.log( userName);
console.log( age);

const  {userName : u, age :a} = Score;


console.log( u);
console.log( a);


//배열 구조분해할당
const  fruit = ["apple", "banana"];
const  [ aaa,bbb] = fruit;


console.log(  aaa);
console.log( bbb);



 

 
