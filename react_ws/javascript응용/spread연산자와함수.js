//함수 호출시  인수로 전달되는 값에서 사용


function func( a, b, c) {
    console.log( a, b, c );
}


let arr= [1,2,3];
func(...arr);    // 매개변수에  각 각  3개 값으로 1,2,3을 전달하는 것과 같은 효과를 얻게 된다
//func( 1, 2, 3) 동일한 효과