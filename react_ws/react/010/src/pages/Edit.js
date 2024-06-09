import { useParams, useNavigate } from "react-router-dom";  

import Header from "../component/Header";
import Button from "../component/Button";
import Editor from "../component/Editor";

import { useContext, useEffect, useState } from "react";
import { DiaryDispatchContext, DiaryStateContext } from "../App";   


const Edit = () => {
 

  const params = useParams();   //일기번호 가져오기
  const nav = useNavigate();    // url이동

  
  const { onDelete, onUpdate } = useContext(DiaryDispatchContext);
  const data = useContext(DiaryStateContext);


  const [curDiaryItem, setCurDiaryItem] = useState();
 

  // 데이터값이 변경되면 수행되어야 하는 코드 작성  
  // side effect 
  useEffect(() => { 


    //일기번호에 대한 일기정보 찾기

    const currentDiaryItem = data.find(
      (item) => String(item.id) === String(params.id)
    );

    if (!currentDiaryItem) {
      window.alert("존재하지 않는 일기입니다.");
      nav("/", { replace: true });
    }

    setCurDiaryItem(currentDiaryItem);
    
  }, [params.id, data]);

 

  //삭제하기
  const onClickDelete = () => {
    if (
      window.confirm("일기를 정말 삭제할까요? 다시 복구되지 않아요!")
    ) {
      // 일기 삭제 로직
      onDelete(params.id);
      nav("/", { replace: true });
    }
  };

  //수정하기
  const onSubmit = (input) => {
    if (window.confirm("일기를 정말 수정할까요?")) {
      onUpdate(
        params.id,
        input.createdDate.getTime(),
        input.emotionId,
        input.content
      );
      nav("/", { replace: true });
    }
  };

  return (
    <div>
      <Header
        title={"일기 수정하기"}
        leftChild={
          <Button onClick={() => nav(-1)} text={"< 뒤로 가기"}   type={"default"}/>
        }
        rightChild={
          <Button
            onClick={onClickDelete}
            text={"삭제하기"}
            type={"negative"}
          />
        }
      />
      <Editor initData={curDiaryItem} onSubmit={onSubmit} />
    </div>
  );
};

export default Edit;