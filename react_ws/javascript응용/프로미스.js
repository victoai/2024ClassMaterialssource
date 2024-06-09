const promise  = new Promise( 
    
    function (resolve, reject) {
        setTimeout(
            ()=>{ 
                let random  = Math.floor( Math.random() *2);
                if(random)
                    resolve( "성공");
                else
                    reject("실패");
            }, 500 );
    
    }
    ) ;



    promise.then( function( res){
          console.log( res);
    }).catch( function(err) {
        console.log( err);
    });