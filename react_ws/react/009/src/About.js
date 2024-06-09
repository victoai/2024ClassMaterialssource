 

import "./About.css";

function About() {
  return (
    <section className='About'> 
     <h1>Who am I?</h1>
     <div className="About-wrap">
          <div  className="ImgCol">
                <img src={"https://image.cine21.com/resize/cine21/movie/2024/0415/13_38_51__661caf5ba73bf[W578-].jpg"}  alt="변우석"></img>
            </div>
            <div  className="Content">     
              <p>변우석: 기계공학과를 전공하였고, 현재는 개발자가 되기로 마음 먹었습니다.  </p>
              <p>아직 프로그래밍을 많이 접해보지 않아서 잘은 모르겠으나  </p>
              <mark> 백엔드개발</mark>에 관심이 좀더 있습니다.
            </div>
     </div>
     
    </section>
  );
}

export default About;
