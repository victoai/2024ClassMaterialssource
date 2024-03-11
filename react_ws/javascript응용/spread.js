const fruitOne = ['apple', 'banana'];
const fruitTwo = ['grape', 'peach'];

const fruitAll = [...fruitOne, ...fruitTwo  ];

console.log(fruitAll); // ['apple', 'banana', 'grape', 'peach']


const Score = {
    userName:"홍",
    age :20
}


//객체스프레드 연산자 , 객체 안에서만 사용
const objB ={
    ...Score ,
    kor:100
}


console.log( objB);