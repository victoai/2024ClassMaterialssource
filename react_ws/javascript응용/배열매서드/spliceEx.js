

let arr = ["one","two","three","four"];
let removed = arr.splice(0,1);    // 원본배열에서 0번째 요소를 제거합니다. 반환값은 삭제된 요소값를 배열로 반환함
// let removed  =  ["one"];

//삭제된 배열의 요소를 반환함
console.log(removed[0]);


//원본배열에서 첫번재요소에서 1개 삭제
console.log( arr);



 

 
let arr2 = ["one","two","three","four"];
 arr2.splice(1);      // 1번쩨 인덱스에서 마지막 요소까지 제거됨 , 0번째 요소만 남음 
console.log( arr2);
 