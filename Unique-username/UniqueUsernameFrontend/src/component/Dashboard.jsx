import React from 'react';
import TotalUsers from './TotalUsers';
import SearchUsername from './SearchUsername';

const Dashboard = () => {
    return (
        <div>
            <h1 className="text-center mb-4">Dashboard</h1>
            <TotalUsers />
            <SearchUsername />
        </div>
    );
};

export default Dashboard;
