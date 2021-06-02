import { useState } from "react";

const DRAGGABLE = "DRAGGABLE"
const BAR = "BAR"

const draggable = (item,id) => {
    return {
        type: DRAGGABLE,
        id,
        data:item
    }
}
const insertBars = (list) => {
    let i = 0
    const newBar = () => {
        return {
            type: BAR,
            id:i++
        }
    }
    return [newBar()].concat(
        ...list.map(item => {
            return [draggable(item,id++),newBar()]
        })
    )
}


const Draggable = (list) => {
    const [dragList, setDragList] = useState(() => {
        insertBars(list)
    })
    const dragList = insertBars(list)

    for (let index = 0; index < array.length; index++) {
        if (index % 3 === 0 && index % 5 === 0) {
            console.log("SiteHost");
        }
        else if (index % 3 === 0) {
            console.log("Site");
        }
        else if (index % 5 === 0) {
            console.log("Host");
        }
        
        
    }

    return {
        dragList
    }
};