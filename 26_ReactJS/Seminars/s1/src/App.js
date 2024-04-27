import logo from './logo.svg';
import './App.css';
import Greeting from './components/Greeting.js';
import Time from './components/Time.js';
import EventCard from './components/EventCard.js';


function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src={logo} className="App-logo" alt="logo" />
        <p>
          Edit src/App.js asdf and save to reload.
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          Learn React
        </a>
      </header>
      <Greeting />
      <Time />
      <EventCard
        id="1"
        title="React"
        date='12-12-2024'
        time='12:00'
      />
      <EventCard 
        id="2"
        title="Django"
        date='12-12-2025'
        time='11:00'
      />
    </div>
  );
}

export default App;
