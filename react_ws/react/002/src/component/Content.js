const Content = ( {userInfo } ) => { 
    return (
      <section  style={{ border:"1px solid black"}}>
        <p> 이름 :  {userInfo.name}</p>      
        <p> 전화번호 :  {userInfo.tel}</p>      
        <p> 주소 :  {userInfo.address}</p>      
        <p> 이메일 :  {userInfo.email}</p>      
        <p> 회사 :  {userInfo.company}</p>      

        <p>좋아하는 것</p>
        <ul>
        {userInfo.likes.map((like, index) => (
          <li key={index}>{like}</li>
        ))}
      </ul>

      <p>좋아하는 것: {userInfo.likes.join(', ')}</p>
        
      </section>
    );
  }

  export default Content ;