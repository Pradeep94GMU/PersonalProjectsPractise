import 'bootstrap/dist/css/bootstrap.min.css';
import React from 'react';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import Navbar from './component/Navbar';
import Dashboard from './component/Dashboard';
import CreateUsername from './component/CreateUsername';

const App = () => {
    return (
        <Router>
            <div className="container mt-5">
                <Navbar />
                <Routes>
                    <Route path="/" element={<Dashboard />} />
                    <Route path="/create" element={<CreateUsername />} />
                </Routes>
            </div>
        </Router>
    );
};

export default App;
