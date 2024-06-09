
function orderCoffee( coffee,  time){

    setTimeout( ()=>{
        console.log( ` ${coffee} 제조 완료`);
    },
 time);
}


orderCoffee( '달콤한커피' , 4000);
orderCoffee( '레몬 티' , 2000);
orderCoffee( '아이스 아메리카노' , 3000);
