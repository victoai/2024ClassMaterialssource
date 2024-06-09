 
  

        let fruits=['딸기', '사과','배' ,'딸기라떼' , "딸기" ,"딸기시럽" ,"망고쥬스" ,"망고요플레" ,"망고" ];
        



        //딸기가 포함된 거 고르기 
        let strawberryInclude = fruits.filter( function( item) {
            if( item.includes("딸기")){
                return true;
            }             
        });
        console.log( strawberryInclude);

      

        // 딸기인거 고르기 

        let strawberry = fruits.filter(  function( item){
            return item === '딸기';
        });

        console.log( strawberry);


        
        // 딸기인거 고르기 

        let strawberry2 = fruits.filter(   item  =>  item ==='딸기');
        console.log(  ' 화살표 함수 사용' )
        console.log( strawberry2);


         // 딸기인거 고르기 

         let strawberry3 = fruits.filter(   item  => {  return  item ==='망고'  ;});
         console.log(  ' 화살표 함수 사용' )
         console.log( strawberry3);
 

 