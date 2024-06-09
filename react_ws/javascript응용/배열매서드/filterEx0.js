 

        //배열준비
        //조건에 맞는것만 새로운 배열에 넣기


        let fruits=['딸기', '사과','배' ,'딸기라떼' , "딸기" ,"딸기시럽"];


        let index=0;
        let newArry=[];
        
        for( let i=0; i< fruits.length ; i++){
            if( fruits[i] ==="딸기"){
                newArry[index]= fruits[i];
                index++;
            }
        }


        console.log( newArry)
 