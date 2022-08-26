import React, { Suspense } from 'react';
import { Route, Switch, HashRouter as Router, Link } from 'react-router-dom';

// import Home from './Home';
// import Sample from './Sample';
// import Hello from './Hello';


const Home = React.lazy(() => import('./Home'));
const Sample = React.lazy(() => import('./Sample'));
const Hello = React.lazy(() => import('./Hello'));
const NotFound = React.lazy(() => import('./NotFound'));

const App = () => {
    return (
        <div className="container">

            <Router>
                <div className="container">
                    <div className="row">
                        <div className="col-md-4">
                            <h2 className="alert alert-primary">Links</h2>
                            {/* http://localhost:3000/sample */}
                            <div className="ul">
                                <li>
                                    <Link to="/">Home</Link>
                                </li>
                                <li>
                                    <Link to="/sample">Sample</Link>
                                </li>
                                <li>
                                    <Link to="/hello">Hello</Link>
                                </li>
                                <li>
                                    <Link to="/something">NotFound</Link>
                                </li>
                            </div>

                        </div>
                        <div className="col-md-8">
                            <h2 className="alert-alert-info">Components</h2>

                            <Suspense fallback={<div>Loading Please Wait... </div>}>
                                <Switch>
                                    <Route path="/" exact={true}>
                                        <Home />
                                    </Route>

                                    <Route path="/sample" exact={true}>
                                        <Sample />
                                    </Route>


                                    <Route path="/hello" exact={true}>
                                        <Hello />
                                    </Route>


                                    <Route path="*" exact={true}>
                                        <NotFound />
                                    </Route>

                                </Switch>
                            </Suspense>

                        </div>
                    </div>
                </div>
            </Router>

        </div>
    )
}

export default App;