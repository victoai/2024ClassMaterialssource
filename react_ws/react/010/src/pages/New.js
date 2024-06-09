import Header from "../component/Header";
import Button from "../component/Button";
import Editor from "../component/Editor";

import { useNavigate } from "react-router-dom";
import { useContext } from "react";

import { DiaryDispatchContext } from "../App";


const New = () => {

  const { onCreate } = useContext(DiaryDispatchContext);
  const nav = useNavigate();


  const onSubmit = (input) => {
    onCreate(
      input.createdDate.getTime(),
      input.emotionId,
      input.content
    );
    nav("/", { replace: true });
  };

  return (
    <div>
      <Header
        title={"새 일기 쓰기"}
        leftChild={
          <Button onClick={() => nav(-1)}   text={"< 뒤로 가기"}  type={"default"}/>
        }
      />
      <Editor onSubmit={onSubmit} />
    </div>
  );
};

export default New;