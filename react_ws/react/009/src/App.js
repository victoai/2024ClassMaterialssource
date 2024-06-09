import React ,{useState} from 'react';
import './App.css';
 

function App() {

    const images = [
        'https://img.insight.co.kr/static/2024/05/29/700/img_20240529094418_qapy79ll.webp' ,
        'https://cf.asiaartistawards.com/news/21/2024/05/2024052720483581659_1.jpg' ,
        'https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyNDA0MjNfMjcy%2FMDAxNzEzODUyMzM0Mjc4.wT6jo7CmNUDIRdz4ZKzPSksssl2k-U7ZYAC9sNDdoSAg.uguLV78HQVtq7Ki5uWokYt5HjKEZy8Ue0eILyhRqbwAg.PNG%2Fimage.png&type=sc960_832'

       
   ];

  
   const [currentIndex, setCurrentIndex] = useState(0);


   const handlePrev = () => {
       setCurrentIndex((prevIndex) => {
           if (prevIndex === 0) {
               return images.length - 1;
           } else {
               return prevIndex - 1;
           }
       });
   };

  
   const handleNext = () => {
       setCurrentIndex((prevIndex) => {
           if (prevIndex === images.length - 1) {
               return 0;
           } else {
               return prevIndex + 1;
           }
       });
   };





  return (
    <div className="App">
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
    <section  className='Experience'>
      <h1>Experience</h1>
      <ul>
        <li>프론트개발
          <ul>
            <li>HTML</li>
            <li>CSS</li>
            <li>javascript</li>
          </ul>
        </li>
        <li>백엔드
          <ul>
            <li>Oracle</li>
            <li>java</li>
            <li>MVC2</li>
            <li>Spring & mybatis</li>
          </ul>
        </li>
      </ul>
    </section>    
    <section  className='Education'>
      <h1>Education</h1>
      <table>
        <thead>
          <tr>
            <td>출신학교</td>
            <td>전공</td>
            <td>기간</td>
            <td>구분</td>
          </tr>
        </thead>
        <tbody>
          <tr>
            <td>셰필드대학</td>
            <td>기계공학과</td>
            <td>17.09~20.06</td>
            <td></td>
          </tr>
        </tbody>
      </table>
    </section>
    <section className="Gallery">
           <div className="Gallery-Img">
                <img src={images[currentIndex]} alt={`선업튀 ${currentIndex + 1}`} />
            </div>
            <div className="preBtn" onClick={handlePrev}>이전</div>
            <div className="nextBtn" onClick={handleNext}>이후</div>
        </section>
    </div>
  );
}

export default App;
