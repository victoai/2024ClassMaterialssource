//단락평가
//논리연산에서 첫번째 피연산자 값이  false이므로 두번째 피연산자 무엇이든 false가된다. 
//논리연산에서 첫번째 피연산자의 값만으로 해당 식의 결과가 확실할 때 두번째 값은 평가하지 않는 것을  단락평가라고 한다.


// AND 단락평가

function calcA(){
    console.log( "calcA");
    return false;
}



function calcB(){
    console.log("calcB");
    return true;
}




// 둘 다 만족해야 참이다
//calcB()함수는 호출되지 않는다.
console.log(  calcA()  &&  calcB());






//OR 단락평가 
//calcA()는 호출되지 않는다

console.log( calcB() ||  calcA());



