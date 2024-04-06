
//배열순회매서드

const arr =[ 1,2,3];

function cb(item, idx){
    console.log( `${idx} 번째 요소: ${item}`  );
}


arr.forEach( cb);