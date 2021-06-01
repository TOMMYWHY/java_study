import { useState } from "react";

const insertBars = (list) => {

}


const Draggable = (list) => {
    const [dragList,setDragList] = useState()
    const dragList = insertBars(list)


    return {
        dragList
    }
};