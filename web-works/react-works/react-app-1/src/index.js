import { createRoot } from 'react-dom/client';


import 'bootstrap/dist/css/bootstrap.css';


// import App from './App';
// import App from './01-basics';
// import App from './02-events';
// import App from './03-ctrl-un-ctrl';
import App from './03-ctrl-un-ctrl/index-ctrl';




const container = document.getElementById('root');
const root = createRoot(container);

root.render(<App />);

// earlier 
// ReactDOM.render(<App />,document.getElementById('root'));



