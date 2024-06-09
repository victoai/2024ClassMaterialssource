import { useParams, useNavigate } from "react-router-dom";
import Header from "../component/Header";
import Button from "../component/Button";
import Viewer from "../component/Viewer";


import { getStringedDate } from "../utils/get-stringed-date";
import { useContext, useEffect, useState } from "react";
import { DiaryStateContext } from "../App";


const Diary = () => {
    
  const params = useParams();
  const nav = useNavigate();

  // context 가져오기
  const data = useContext(DiaryStateContext);
  const [curDiaryItem, setCurDiaryItem] = useState();



  useEffect(() => {
    const currentDiaryItem = data.find(
      (item) => String(item.id) === String(params.id)
    );

    if (!currentDiaryItem) {
      window.alert("존재하지 않는 일기입니다.");
      nav("/", { replace: true });
    } else {
      setCurDiaryItem(currentDiaryItem);
    }
  }, [params.id, data]);



  if (!curDiaryItem) {
    return <div>데이터 로딩중...!</div>;
  }

   
  const { createdDate, emotionId, content } = curDiaryItem;
  const title = getStringedDate(new Date(createdDate));

  return (
    <div>
      <Header
        title={`${title} 기록`}
        leftChild={
          <Button onClick={() => nav(-1)} text={"< 뒤로 가기"} />
        }
        rightChild={
          <Button
            onClick={() => nav(`/edit/${params.id}`)}
            text={"수정하기"}
          />
        }
      />
      <Viewer emotionId={emotionId} content={content} />
    </div>
  );
};

export default Diary;
