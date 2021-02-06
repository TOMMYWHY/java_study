import logo from './logo.svg';
import './App.css';
// import Count from './components/Count'
import Count from './containers/Count'
import store from './redux/store';

function App() {
  return (
    <div>
      app...
      <Count store={store} />

    </div>
  );
}

export default App;
