import React, { useState } from 'react';
import './Gallery.css';

const Gallery = () => {
   
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
        <section className="Gallery">
           <div className="Gallery-Img">
                <img src={images[currentIndex]} alt={`선업튀 ${currentIndex + 1}`} />
            </div>
            <div className="preBtn" onClick={handlePrev}>이전</div>
            <div className="nextBtn" onClick={handleNext}>이후</div>
        </section>
    );
};

export default Gallery;
