import React from 'react';
import './App.scss';
import useDraggable from './taggleDemo/useDraggable';

const list = [
  {
    src: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586970234373&di=a665d347ed7acfed0f39aad0bb78509a&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201504%2F05%2F20150405H5939_PJwYi.jpeg',
    title: '万事屋找我',
  },
  {
    title: '吃吃吃……',
    src: 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1586970602470&di=e3071fc352ca96f73bf2e75725d3f7bf&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201208%2F31%2F20120831140113_ayLse.thumb.700_0.jpeg',
  },
  {
    title: '汪汪',
    src: 'https://ss1.bdstatic.com/70cFvXSh_Q1YnxGkpoWK1HF6hhy/it/u=968093909,4033932240&fm=26&gp=0.jpg',
  },
];

function cls (def, ...conditions) {
  const list = [def];
  conditions.forEach (cond => {
    if (cond[0]) {
      list.push (cond[1]);
    }
  });
  return list.join (' ');
}

export default function App () {
  return (
    <div className="App">
      <DraggableList list={list} />
    </div>
  );
}

function DraggableList({list}) {
  const {dragList, createDraggerProps, createDropperProps} = useDraggable (
    list
  );
  return dragList.map ((item, i) => {
    if (item.type === 'BAR') {
      return <Bar id={i} {...createDropperProps (i)} key={item.id} />;
    } else {
      return (
        <Draggable {...createDraggerProps (i, item.id)}>
          <Card {...item.data} />
        </Draggable>
      );
    }
  });
}

//List
// Draggable
// Bar
// Draggable
// Bar

function Draggable({children, eventHandlers, dragging, id}) {
  return (
    <div
      {...eventHandlers}
      draggable={true}
      className={cls ('draggable', [dragging === id, 'dragging'])}
    >
      {children}
    </div>
  );
}

function Bar({id, dragging, dragOver, eventHandlers}) {
  if (id === dragging + 1) {
    return null;
  }

  return (
    <div
      {...eventHandlers}
      className={cls ('draggable--bar', [dragOver === id, 'dragover'])}
    >
      <div
        className="inner"
        style={{
          height: id === dragOver ? '80px' : '0px',
        }}
      />
    </div>
  );
}

function Card({src, title}) {
  return (
    <div className="card">
      <img src={src} />
      <span>{title}</span>
    </div>
  );
}
