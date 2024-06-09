// main.js

// 모듈 가져오기
const mathUtils = require('./모듈만들기math');

// 함수 사용
const num1 = 10;
const num2 = 5;

const sum = mathUtils.add(num1, num2);
const difference = mathUtils.subtract(num1, num2);

console.log(`Sum: ${sum}`);          // Sum: 15
console.log(`Difference: ${difference}`); // Difference: 5
