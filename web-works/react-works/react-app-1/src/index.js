import { createRoot } from 'react-dom/client';


// import App from './App';
// import App from './01-basics';
import App from './02-events';




const container = document.getElementById('root');
const root = createRoot(container);

root.render(<App />);

// earlier 
// ReactDOM.render(<App />,document.getElementById('root'));



