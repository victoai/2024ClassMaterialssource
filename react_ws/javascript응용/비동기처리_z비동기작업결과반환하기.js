// 비동기작업의 결과 반환할 때 콜백함수를 사용한다



function double( num  , cb){

    setTimeout( ()=>{
        const doubleNum = num *2;
       // console.log( doubleNum);
        cb( doubleNum);

    } ,1000);
}



//1.
double(10 , (res)=>{  console.log( res)});


//2.
double(2 ,  res =>   console.log( res) );


//3.
double(4, a );


//콜백함수로 전달한 함수 정의
function  a( data){
     console.log( "receive data = >" + data);
}


//4.
double( 3,  function (recv){       
       console.log( "receive data = >" + recv);
    }
);