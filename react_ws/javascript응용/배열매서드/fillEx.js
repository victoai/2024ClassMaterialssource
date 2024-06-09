

    // arr.fill(value [, start] [, end])    대괄호 묶은것은 생략가능 

let arr = new Array(6);
//수정매서드( 원본배열의 내용이 변경됨 )
arr.fill(0);
console.log( arr);



arr.fill(5, 0, 2);
console.log( arr);        
