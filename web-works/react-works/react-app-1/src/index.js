import { createRoot } from 'react-dom/client';


import 'bootstrap/dist/css/bootstrap.css';


// import App from './App';
// import App from './01-basics';
// import App from './02-events';
// import App from './03-ctrl-un-ctrl';
// import App from './03-ctrl-un-ctrl/index-ctrl';
// import App from './04-life-cycle';
// import App from './05-contacts-fetch';
// import App from './06-hoc';
// import App from './07-multi-component';
// import App from './08-lazy';
import App from './09-hooks';





const container = document.getElementById('root');
const root = createRoot(container);

root.render(<App />);

// earlier 
// ReactDOM.render(<App />,document.getElementById('root'));



