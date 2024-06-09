

// includes 매서드는 배열에 특정 요소가 있는지 판별  (true, false 반환)

// arr.includes(  item, fromIndex );

let fruits=['딸기', '사과','배' ,'딸기라떼' , "딸기" ,"딸기시럽" ,"망고쥬스" ,"망고요플레" ,"망고" ];
        

let result1= fruits.includes("딸기" ,  8);
let result2  = fruits.includes("딸기", 0);

console.log( result1);
console.log( result2);




 let item="딸기라떼" ;
 let result3 =  item.includes("딸기");
 console.log( result3);