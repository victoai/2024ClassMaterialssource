 
        let fruits=['딸기', '사과','배'];

        //배열이름.forEach();
        //매개변수로 함수를 받음 
        fruits.forEach( function( item , index){
             console.log( item);
        });


 

        for( let i=0; i<fruits.length ;  i++){
            console.log(  fruits[i]);
        }





        // forEach 작동원리
        // 함수를 매개변수로 받는다 (매개변수로 받는 함수를 콜백함수라고 한다)        
        function myForEach(  수행코드 ){
            //3번반복
            for( let i=0; i<3; i++){
                수행코드( i);
            }
        }

        
        myForEach( todo);        

        //익명함수로 작성해서 전달
        myForEach( function(  index){
             console.log( "익명" +index );
        });



        //함수만들어서 전달
        function todo( index){
            console.log( "todo" +index);
         }

 