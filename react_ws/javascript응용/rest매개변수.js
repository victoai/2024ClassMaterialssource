// rest매개변수는 나머지 매개변수라고 하며, 스프레드 연산자처럼 기호 ...표기한다
// 스프레드 연산자는 배열이나 객체처럼 반복 가능한 값을 개별 요소로 분리하지만 rest 매개변수는 반대로 개별요소를 배열로 묶는다
// 매개변수에서 사용된다. 

function func( ...rest){
  console.log(  rest);

}



func( 1,2,3,4);
  


function func2( param, ...rest){
     console.log( param);
     console.log( rest);
}


func2(1,2,3,4);
