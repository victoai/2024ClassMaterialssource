
// 배열에서 조건에 맞는 요소를 반환한다

 let arr= [
{
    name: "강지훈",
    address: "미국"
},{
    name:"김기엽",
    address: "서울"
},
{
    name:"김연수",
    address: "일본"
}

 ];



 let resultItem  = arr.find(   item => item.address=== "미국"); 

 let resultItem2  = arr.find(    function( item){
    return  item.name === "강지훈";
 });


 let resultItem3 = arr.find(   item => { return  item.address==="서울"});


 console.log( resultItem);
 console.log( resultItem2);
 console.log( resultItem3);
