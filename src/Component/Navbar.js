import { NavLink } from 'react-router-dom'
import React from 'react'

export const Navbar = () => {
  return (
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Navbar</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>
  
  <div class="collapse navbar-collapse" id="navbarNav">
    <ul class="navbar-nav">
      <li class="nav-item active">
        < NavLink to="/home" activeClassName="is-active" exact={true}>Home <span class="sr-only"></span></NavLink>
      </li>
      <li class="nav-item">
        < NavLink to ="/Register"  activeClassName="is-active" exact={true}>Register <span class="sr-only"></span></NavLink>
      </li>
      <li class="nav-item">
        <NavLink to ="/Login"  activeClassName="is-active" exact={true}>Login <span class="sr-only"></span></NavLink>
      </li>
      <li class="nav-item">
        <NavLink to ="/Aboutus"  activeClassName="is-active" exact={true}>Aboutus <span class="sr-only"></span></NavLink>
      </li>
      <li class="nav-item">
        <NavLink to ="/MygalleryList"  activeClassName="is-active" exact={true}>MygalleryList <span  class="sr-only"></span></NavLink>
      </li>
    </ul>
  </div>

    </nav>
  )
} 
export default Navbar