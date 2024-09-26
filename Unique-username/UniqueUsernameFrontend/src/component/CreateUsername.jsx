import React, { useState } from 'react';

const CreateUsername = () => {
    const [usernamesToCreate, setUsernamesToCreate] = useState(1);
    const [message, setMessage] = useState('');

    const createUsernames = async () => {
        try {
            const response = await fetch('http://localhost:8080/api/users/createUsername', {
                
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json',
                },
                
                body: JSON.stringify({ count: usernamesToCreate }),
                
            });
            console.log('hello1');
            const data = await response.json();
            console.log('hello2')
            setMessage(`${data.created} usernames created successfully.`);
            console.log('hello3')
        } catch (error) {
            setMessage('Error occurred while creating usernames.');
        }
    };

    return (
        <div className="mt-5">
            <h1 className="text-center mb-4">Create Usernames</h1>
            <div className="row justify-content-center">
                <div className="col-md-6">
                    <div className="form-group">
                        <input
                            type="number"
                            value={usernamesToCreate}
                            onChange={(e) => setUsernamesToCreate(e.target.value)}
                            className="form-control"
                            placeholder="Number of usernames to create"
                            min="1"
                        />
                    </div>
                    <div className="text-center mt-3">
                        <button onClick={createUsernames} className="btn btn-primary">Create Usernames</button>
                    </div>
                    {message && (
                        <div className="alert alert-info mt-3">
                            {message}
                        </div>
                    )}
                </div>
            </div>
        </div>
    );
};

export default CreateUsername;
