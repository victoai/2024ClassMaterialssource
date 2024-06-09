import {getEmotionImage} from  "../utils/get-emotion-image";
import "./EmotionItem.css";


//  이모션아이디, 
//   감정내용
//   선택여부
//   클릭되었을 때 내용
const EmotionItem = ({ emotionId, emotionName, isSelected , onClick})=>{


    return(
        
        <div onClick={onClick}    className={ `EmotionItem ${isSelected ?  `EmotionItem_on_${emotionId}` :""}`} >
            <img  className="emotion_img"  src={getEmotionImage( emotionId)}  alt='감정이미지'/>
            <div  className="emotion_name">  {emotionName}</div>
        </div>
        
    );
};


export default EmotionItem;
