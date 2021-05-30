import logo from './logo.svg';
import './App.scss';
// import Hooks from './hooks_demo/hooks1';
// import Hooks from './hooks_demo/hooks2';
import Hooks from './hooks_demo/hooks3';

function App () {
  return (
    <div className="App">
      <img src={logo} className="App-logo" alt="logo" />

      <img src="/logo192.png" />
      <hr />
      <Hooks />
    </div>
  );
}

export default App;
