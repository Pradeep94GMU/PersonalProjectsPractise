import React, { useState } from 'react';

const SearchUsername = () => {
    const [name, setName] = useState('');
    const [message, setMessage] = useState('');
    const [responseTime, setResponseTime] = useState(null);

    const searchName = async () => {
        try {
            const startTime = performance.now();
            const response = await fetch(`http://localhost:8080/api/users/search?name=${name}`);
            const data = await response.json();

            const endTime = performance.now();
            const timeTaken = (endTime - startTime).toFixed(2);

            if (data.length > 0) {
                setMessage('FOUND... Total number of matching records: ' + data.length);
            } else {
                setMessage('Name not found in the database.');
            }
            setResponseTime(timeTaken);
        } catch (error) {
            setMessage('Error occurred while searching for the name.');
        }
    };

    return (
        <div>
            <h1 className="text-center mb-4">Search Username</h1>
            <div className="row justify-content-center">
                <div className="col-md-6">
                    <div className="form-group">
                        <input
                            type="text"
                            value={name}
                            onChange={(e) => setName(e.target.value)}
                            className="form-control"
                            placeholder="Enter name to search"
                        />
                    </div>
                    <div className="text-center mt-3">
                        <button onClick={searchName} className="btn btn-primary">Search</button>
                    </div>
                    {message && (
                        <div className="alert alert-info mt-3">
                            {message}
                            {responseTime && (
                                <p>Response time: {responseTime} ms</p>
                            )}
                        </div>
                    )}
                </div>
            </div>
        </div>
    );
};

export default SearchUsername;
