import React from 'react'
import logo from '../Simplify SD.png'

export default function Login() {
    return (
        <div className='container w-25'>
            <form>
                <img className="w-100 mb-4" src={logo} alt="" />
                    <h1 class="h3 mb-3 fw-normal">Please sign in</h1>

                    <div className="form-floating mb-2">
                        <input type="username" class="form-control" id="floatingInput" placeholder="name@example.com" />
                            <label for="floatingInput">Username</label>
                    </div>
                    <div className="form-floating mb-2">
                        <input type="password" class="form-control" id="floatingPassword" placeholder="Password" />
                            <label for="floatingPassword">Password</label>
                    </div>

                    <div className="checkbox mb-3">
                        <label>
                            <input type="checkbox" value="remember-me" /> Remember me
                        </label>
                    </div>
                    <button className="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
                    <p className="mt-5 mb-3 text-muted">© 2023</p>
            </form>
        </div>
    )
}
