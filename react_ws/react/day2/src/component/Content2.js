const Content2 = () => {
  const boolA =true;
  const boolB  =false;
  
 //논리표현식의 결과인 블리언은 페이지에 렌더링되지 않는다  
    return (
      <section>
        <p>This is the main content of my app.</p>
        <h2>   {boolA || boolB}</h2>
        <h2> {String(boolA || boolB) } </h2>
      </section>
    );
  }

  export default Content2 ;