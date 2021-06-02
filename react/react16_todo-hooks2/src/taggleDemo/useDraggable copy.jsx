import { useState } from "react";

const DRAGGABLE = "DRAGGABLE"
const BAR = "BAR"

const draggable = (item, id) => {
    return {
        type: DRAGGABLE,
        id,
        data: item
    }
}
const insertBars = (list) => {
    let i = 0
    const newBar = () => {
        return {
            type: BAR,
            id: i++
        }
    }
    return [newBar()].concat(
        ...list.map(item => {
            return [draggable(item, i++), newBar()];
        })
    )
}

function clacChanging(list, drag, drop) {
    list = list.slice();

    const dragItem = list[drag];

    // dir > 0从下往上 <0 从上往下
    const dir = drag > drop ? -2 : 2;
    // drop的地方是bar
    const end = dir > 0 ? drop - 1 : drop + 1;

    for (let i = drag; i != end; i += dir) {
        list[i] = list[i + dir];
    }

    list[end] = dragItem;
    return list;
}



export default function useDraggable(list) {
    // console.log('22', list);
    const [dragList, setDragList] = useState(() => {
        return insertBars(list)
    })
    // console.log(1111, dragList);
    const [dragOver, setDragOver] = useState(null)
    const [dragging, setDragging] = useState(null)

    return {
        dragList,
        createDropperProps: id => {
            return {
                // id,
                // key: id,
                dragging,
                dragOver,
                eventHandlers: {
                    ondragover: (e) => {
                        e.preventDefault()
                        setDragOver(id)
                    },
                    ondragleave: e => {
                        e.preventDefault()
                        setDragOver(null)
                    },
                    onDrop: e => {
                        e.preventDefault()
                        setDragOver(null)
                        setDragList(list => {
                            return clacChanging(list, dragging, id)
                        })
                    }
                }
            }
        },
        createDraggerProps: id => {
            return {
                id,
                key: id,
                dragging,
                eventHandlers: {
                    ondragstart: () => {
                        setDragging(id)
                    },
                    ondragend: () => {
                        setDragging(null)
                    }
                }
            }
        }
    }
};

// export default useDraggable