import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import {BrowserRouter as Router, Routes, Route} from 'react-router-dom';
import AddUser from './Users/AddUser';
import Login from './pages/Login';
import EditUser from './Users/EditUser';

function App() {
  let isLoggedIn = true;

  return (
    <div className="App">
      <Router> 
      {isLoggedIn ? <Navbar /> : null} 
      <Routes>
        <Route exact path="/" element={<Login />} />
        <Route exact path="/home" element={<Home />} />
        <Route exact path="/adduser" element={<AddUser />} /> 
        <Route exact path="/edituser/:id" element={<EditUser />} />
        <Route exact path="/deleteuser/:id" element={<Home />} />       
      </Routes>
      </Router>
    </div>
  );
}

export default App;
