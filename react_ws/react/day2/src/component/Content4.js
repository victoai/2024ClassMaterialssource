const Content4 = () => {

  const objA= {
    a:1,
    b:2

  }
    return (
      <section>
        <p>This is the main content of my app.</p>
        <h2>   {objA.a}</h2>
        <h2>   {objA.b}</h2>  
      </section>
    );
  }

  export default Content4;