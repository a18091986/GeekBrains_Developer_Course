import './App.css';
import Message from './components/Message';

function App() {
  return (
    <div className="App">
      <Message mes={'first message'}/>
      <Message mes={'second message'}/>
      <Message mes={'third message'}/>
    </div>
  );
}

export default App;
