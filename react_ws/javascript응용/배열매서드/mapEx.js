

// map
// map은 배열 각각의 요소에 대한 함수 호출 결과를 모아 새배열을 반환함
// 배열의 요소를 사용하여 새로운 배열을 반환한다



/* 요구사항
   문자열배열을 원하는 html형식 배열로 만들기
*/

const  acornStudent = [  "강지훈" , "김기엽" ,'이민재' , '김연수' , '이건희' , '윤성진'  , '윤라영' , '여민혜' , '장유나',  '양홍섭' , '김종범', '최환석' , '김예원' , '유원준', '함현지' , '김수진' , '정기원' ,'서원덕' , '박범준'  ];


/*
let acornHtml  =acornStudent.map(  ( item , index) =>{
      return  '<p>'+  item  + '</p>';
});
*/

let acornHtml  =acornStudent.map(  ( item , index) =>   '<p>'+  item  + '</p>' );


 
console.log( acornHtml); 


function a( item, index){
         return  '<div>'  + item +  index  +'</div>' ;
}


let  acornHtmlDiv  =  acornStudent.map( a );
console.log(acornHtmlDiv );


