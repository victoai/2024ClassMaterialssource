/*

함수
: 이름이 붙은 명령들의 모음 ( 관련있는 코드 모아두기 )  
: 코드의 재사용성(중복을 제거할 수 있다), 코드 분할( 코드를 나눠서 작업할 수 있다)

: 매개변수와 반환값  ( 들어오는 값, 나가는 값)

- 양치질하기함수 만들어 보기 
 
*/

//함수선언식
function 양치질하기(){
    console.log("치약을 짠다");
    console.log("칫솔질을 한다");
    console.log("헹군다");
}
 


//1~10까지 합 출력하기
function printTenTotal(){
  let sum=0;
  for( let i=1; i<=10; i++){
      sum +=i;
  }
  console.log(sum);
}


//1~10까지의 합 반환하기
function getTenTotal(){
  let sum=0;
  for( let i=1; i<=10; i++){
      sum +=i;
  }
  
  return sum;
}


//함수표현식
let  isAdult =  function( age){
       if( age > 20) 
	       return true;
       else 
	       return false;     
}

//함수 호출
양치질하기();
//10까지 합 호출
printTenTotal();

//미성년자 판단
let result  =  isAdult(18);
console.log( result);