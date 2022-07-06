import { Button } from 'bootstrap'
import React, { useState } from 'react'

const AddMygallery = () => {
  
    const [Firstname, setFirstname] = useState('')
    const [Lastname, setLastname] = useState('')
    const [Email, setEmail] = useState('')

    const saveMygallery = (e) =>{
        e.preventDefaul();
        
        const mygallery = {Firstname, Lastname, Email}
        console.log(mygallery);
    }
    return (
    <div>
        <div className='Container'>
            <div className='Row'>
                <div className='card col-md-6 effset-md-3 effset-md-3'>
                    <h2 className='text-center'>AddMygallery</h2>
                    <div className='card-body'>
                        <form>
                            <div className='form-group mb-2'>
                                <label className='form-lable'>Firstname:</label>
                                <input
                                type={Text}
                                placeholder = "enter Firstname"
                                className='form-control'
                                value={Firstname}
                                onChange = {(e) => setFirstname(e.target.value)}>
                                </input>
                            </div>
                            
                            <div className='form-group mb-2'>
                                <label className='form-lable'>Lastname:</label>
                                <input
                                type={Text}
                                placeholder = "enter Lastname"
                                className='form-control'
                                value={Lastname}
                                onChange = {(e) => setLastname(e.target.value)}>
                                </input>
                            </div>
                            
                            <div className='form-group mb-2'>
                                <label className='form-lable'>Email:</label>
                                <input
                                type={Text}
                                placeholder = "enter Email"
                                className='form-control'
                                value={Email}
                                onChange = {(e) => setEmail(e.target.value)}>
                                </input>
                            </div>

                            <Button className ="btn btn-success" onclick = {(e) => saveMygallery(e)}></Button>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
  )
}

export default AddMygallery