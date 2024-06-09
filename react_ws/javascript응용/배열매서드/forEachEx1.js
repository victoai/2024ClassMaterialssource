
const  acornStudent = [  "강지훈" , "김기엽" ,'이민재' , '김연수' , '이건희' , '윤성진'  , '윤라영' , '여민혜' , '장유나',  '양홍섭' , '김종범', '최환석' , '김예원' , '유원준', '함현지' , '김수진' , '정기원' ,'서원덕' , '박범준'  ];




acornStudent.forEach(   (item, index, arr) =>{

        console.log( item );
        console.log( index);
        console.log( arr);
});




console.log( " 배열의  요소값만 사용한다면 아래와 같이 작성하면 된다.")
acornStudent.forEach(   (item) =>{

        console.log( item );
         
});