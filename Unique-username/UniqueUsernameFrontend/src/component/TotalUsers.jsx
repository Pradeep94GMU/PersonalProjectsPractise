import React, { useState, useEffect } from 'react';
import { formatNumber } from './utils'; // Create a separate utils file for reusable functions

const TotalUsers = () => {
    const [totalUsersCount, setTotalUsersCount] = useState(null);
    
    const totalUsers = async () => {
        try {
            const response = await fetch(`http://localhost:8080/api/users/totalUsers`);
            const data = await response.json();
            setTotalUsersCount(data);
        } catch (error) {
            console.error('Error fetching total users:', error);
        }
    };

    useEffect(() => {
        totalUsers();
    }, []);

    return (
        <div className="alert alert-info mt-3 text-center">
            Total Users: {totalUsersCount} <span> and </span> {formatNumber(totalUsersCount)} <br />
        </div>
    );
};

export default TotalUsers;
