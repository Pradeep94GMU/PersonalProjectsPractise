
import 'bootstrap/dist/css/bootstrap.min.css';
import { useState } from 'react';


 
      


const SearchUsername = () =>{
  const [name, setName] = useState('');
  const [message, setMessage] = useState('');
  const [responseTime, setResponseTime] = useState(null);

   // Function to handle the search API call
   const searchName = async () => {
    try {
        const startTime = performance.now();
        const response = await fetch(`http://localhost:8080/api/users/search?name=${name}`);
        const data = await response.json();

        const endTime = performance.now();

        const timeTaken = (endTime - startTime).toFixed(2); 



        console.log(data);

        if (data.length > 0) {
            setMessage('Name found in the database.');
        } else {
            setMessage('Name not found in the database.');
        }
        setResponseTime(timeTaken);
    } catch (error) {
        setMessage('Error occurred while searching for the name.');
    }
};

  return (
    <div className="container mt-5">
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
                                <p>Response time: 
                                  {responseTime} ms</p>
                            )}
                    </div>
                )}
            </div>
        </div>
    </div>
);
};
export default SearchUsername;