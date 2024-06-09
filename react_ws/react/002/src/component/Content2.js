const Content2 = ( {name, tel, address, email , company, likes } ) => { 
    return (
      <section style={{ border:"1px solid black"}}>
        <p> 이름 :  {name}</p>      
        <p> 전화번호 :  {tel}</p>      
        <p> 주소 :  {address}</p>      
        <p> 이메일 :  {email}</p>      
        <p> 회사 :  {company}</p>      

        <p>좋아하는 것</p>
        <ul>
        {likes.map((like, index) => (
          <li key={index}>{like}</li>
        ))}
      </ul>

      <p>좋아하는 것: {likes.join(', ')}</p>
        
      </section>
    );
  }

  export default Content2 ;