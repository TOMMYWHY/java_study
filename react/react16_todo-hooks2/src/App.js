import logo from './logo.svg';
import './App.scss';
// import Hooks from './hooks_demo/hooks1';
// import Hooks from './hooks_demo/hooks2';
// import Hooks from './hooks_demo/hooks3';
// import Hooks from './hooks_demo/hooks4';

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

function App () {
  return (
    <div className="App">
      <img src={logo} className="App-logo" alt="logo" />

      <img src="/logo192.png" />
      <hr />
      {/* <Hooks /> */}

      <Card {...list[0]} />
    </div>
  );
}

export default App;

const DraggableList = ({list}) => {
  return <div className="digglebale-list"> </div>;
};
const Draggable = ({children}) => {
  return <div className="dragglable ">{children}</div>;
};
const Bar = () => {};

const Card = ({src, title}) => {
  return (
    <div className="card">
      <img src={src} />
      <span>{title}</span>
    </div>
  );
};
