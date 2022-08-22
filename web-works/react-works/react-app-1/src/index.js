import { createRoot } from 'react-dom/client';


// import App from './App';
import App from './components';




const container = document.getElementById('root');
const root = createRoot(container);

root.render(<App />);

// earlier 
// ReactDOM.render(<App />,document.getElementById('root'));