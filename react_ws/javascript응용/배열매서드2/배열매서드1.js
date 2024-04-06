// 자바스크립트의 배열은 일반 객체에 기능을 추가해  만든 특수한 객체



//요소
//1. push
//배열의 맨 마지막에 요소 추가

let foods  = [ "짜장면" ,  "피자" ,  "치킨"];
foods.push("탕수육");
console.log( foods);



//2. pop
//배열의 맨 마지막 요소 제거, 제거된 요소를 반환

let removedItem  = foods.pop();
console.log( foods);
console.log( removedItem);



//3.shift
//배열의 맨앞의 요소를 제거하고 제거된 요소를 반환
let removedItemF = foods.shift();
console.log( foods);
console.log( removedItemF);



//4.unshift 
//배열의 맨앞에 요소를 추가하고 새로운 배열의 길이를 반환함 


let newLength = foods.unshift("갈비찜");
console.log( foods);
console.log( newLength);



