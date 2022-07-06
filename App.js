//import logo from './logo.svg';
import React from 'react';

import './App.css';
import './nav.css';
import './Aboutus.css';
import './index.css';
import './Login.css'


import Navbar from './Component/Navbar';
import { BrowserRouter, Route, Switch} from 'react-router-dom';
import Home from './Component/Home';
import Register from'./Component/Register';
import Login from './Component/Login';
import Aboutus from './Component/Aboutus';
import MygalleryList from './Component/MygalleryList';


export const App = () => {
  return(
   <BrowserRouter>
    <div>
      <Navbar/>
      <Switch>
      <Route path='/Home' component={Home} exact={true}/>
      <Route path='/Register' component={Register} exact={true}/>
      <Route path='/Login' component={Login} exact={true}/>
      <Route path='/Aboutus' component={Aboutus} exact={true}/>
      <Route path='/MygalleryList' component={MygalleryList} exact={true}/>
      </Switch>
    </div>
   </BrowserRouter>
  );
}
export default App


