import React, { useState } from 'react'
import {Link, useNavigate } from 'react-router-dom'
import axios from 'axios'

export default function AddUser() {
    let navigate = useNavigate()

    const [user, setUser] = useState({
        name: '',
        username: '',
        email: ''
    })

    const { name, username, email } = user;
    const onInputChange = (e) => {
        setUser({ ...user, [e.target.name]: e.target.value })
    }

    const onSubmit = async (e) => {
        e.preventDefault()
        await axios.post("http://localhost:8080/user", user)
        navigate("/Home")
    }


    return (        
        <div className='container'>
            <h2>Trial! And Errors    </h2>
            <div className='row'>
                <div className='col-md-6 offset-md-3 rounded p-4 mt-2 shadow'>
                    <h2 className='text-center'>Register User</h2>
                    <form onSubmit={(e) => onSubmit(e)}>
                        <div className='mb-3'>
                            <label htmlFor='Name' className='form-label'>Name</label>
                            <input
                                type='text'
                                className='form-control'
                                name='name'
                                value={name}
                                onChange={(e) => onInputChange(e)}
                            />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='Username' className='form-label'>Username</label>
                            <input
                                type='text'
                                className='form-control'
                                name='username'
                                value={username}
                                onChange={(e) => onInputChange(e)}
                            />
                        </div>
                        <div className='mb-3'>
                            <label htmlFor='Email' className='form-label'>Email</label>
                            <input
                                type='text'
                                className='form-control'
                                name='email'
                                value={email}
                                onChange={(e) => onInputChange(e)}
                            />
                        </div>
                        <button type='submit' className='btn btn-outline-primary mx-4'>Submit</button>
                        <Link type='cancel' className='btn btn-outline-danger mx-4' to='/Home'>Cancel</Link>
                    </form>
                </div>
            </div>
        </div>
    )
}
