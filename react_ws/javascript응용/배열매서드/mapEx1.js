

const  arr = [ 2,4,6];

let  newArr = arr.map(   (  item, index)=>{
   return   item * item;
});

console.log (  newArr);

 


 
//한 줄 인경우  { } 중괄호 블럭과  return문 생략가능
let  newArr2 = arr.map(   (  item, index)=>  item*item);
console.log (  newArr2);