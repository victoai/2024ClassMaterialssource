import { useNavigate } from "react-router-dom";
import { getEmotionImage } from "../utils/get-emotion-image";
import Button from "./Button";
import "./DiaryItem.css";


const DiaryItem = ({ id, emotionId, createdDate, content }) => {

  const nav = useNavigate();  

  const goDiaryPage = () => {
    nav(`/diary/${id}`);
  };

  const goEditPage = () => {
    nav(`/edit/${id}`);
  };

  return (
    <div className="DiaryItem">

      {/* 감정이모콘 */}
      <div  onClick={goDiaryPage}   className={`img_section img_section_${emotionId}`}  >
        <img src={getEmotionImage(emotionId)}  alt="이미지" />
      </div>


        {/*일기정보 */}        
      <div onClick={goDiaryPage} className="info_section">
        <div className="created_date">
          {new Date(createdDate).toLocaleDateString()}
        </div>
        <div className="content">{content}</div>
      </div>
      

      {/*수정하기 */}
      <div className="button_section">
        <Button onClick={goEditPage} text={"수정하기"} />
      </div>
    </div>
  );
};

export default DiaryItem;
