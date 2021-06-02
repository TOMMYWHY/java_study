import logo from './logo.svg';
import './App.scss';
// import Hooks from './hooks_demo/hooks1';
// import Hooks from './hooks_demo/hooks2';
// import Hooks from './hooks_demo/hooks3';
// import Hooks from './hooks_demo/hooks4';
import useDraggable from './taggleDemo/useDraggable';

const list = [
  {
    src: 'https://ss0.bdstatic.com/70cFvHSh_Q1YnxGkpoWK1HF6hhy/it/u=3783328855,4212909771&fm=26&gp=0.jpg',
    title: '11111',
  },
  {
    src: 'ch/src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F2019-12-25%2F5e02fe1a18215.jpg&refer=http%3A%2F%2Fpic1.win4000.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1625095351&t=c1d2f3a8f0501410bb16c9505b237784',
    title: '22222',
  },
  {
    src: 'https://gimg2.baidu.com/image_search/src=http%3A%2F%2Ftp.ecysj.net%2Fwp-content%2Fuploads%2F2019%2F07%2F66-1ZFQ4452V20.jpg&refer=http%3A%2F%2Ftp.ecysj.net&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1625095355&t=758e07c7d6ca55c45c1f831c6aa01213',
    title: '333333',
  },
  {
    src: 'https://ss3.baidu.com/-fo3dSag_xI4khGko9WTAnF6hhy/zhidao/pic/item/6a600c338744ebf87c918f37def9d72a6159a7d2.jpg',
    title: '444444 ',
  },
];

const cls = (def, ...conditions) => {
  const list = [def];
  conditions.forEach (cond => {
    if (cond[0]) {
      list.push (cond[1]);
    }
  });
  console.log (list);
  return list.join (' ');
};

function App () {
  return (
    <div className="App">
      <img src={logo} className="App-logo" alt="logo" />

      <img src="/logo192.png" />
      <hr />
      {/* <Hooks /> */}

      {/* <Card {...list[0]} /> */}

      <DraggableList list={list} />
    </div>
  );
}

export default App;

const DraggableList = ({list}) => {
  const {dragList, createDraggerProps, createDropperProps} = useDraggable (
    list
  );
  // console.log ('aaaa', dragList);
  return dragList.map ((item, i) => {
    if (item.type === 'BAR') {
      return <Bar id={i} key={item.id} {...createDropperProps (i)} />;
    } else {
      return (
        <Draggable {...createDraggerProps ()}>
          <Card {...item.data} />
        </Draggable>
      );
    }
  });

  // return <div className="digglebale-list"> </div>;
};
const Draggable = ({children, evenHandlers, dragging, id}) => {
  console.log (dragging, '111');
  return (
    <div
      {...evenHandlers}
      draggable={true}
      className={cls ('draggable', [dragging === id, 'dragging'])}
    >
      {children}
    </div>
  );
};
const Bar = ({id, dragging, dragOver, eventHandlers}) => {
  if (id === dragging + 1) {
    return null;
  }
  return (
    <div
      {...eventHandlers}
      className={(cls ('draggagble--bar'), [dragOver === id, 'dragOver'])}
    >
      <div className="inner" style={{height:id===dragOver? '80px':"0px"}} />
    </div>
  );
};

const Card = ({src, title}) => {
  return (
    <div className="card">
      <img src={src} />
      <span>{title}</span>
    </div>
  );
};
