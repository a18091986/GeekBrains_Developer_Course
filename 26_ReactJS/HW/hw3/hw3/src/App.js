import logo from './logo.svg';
import './App.css';
import TemperatureConverter from './modules/converter';
import TodoList from './modules/todolist';

function App() {
  return (
    <div className="App">
      <h3>Конвертер температуры</h3>
      <TemperatureConverter/>
      <hr></hr>
     <h3>Список дел</h3>
      <TodoList/>
    </div>
  );
}

export default App;