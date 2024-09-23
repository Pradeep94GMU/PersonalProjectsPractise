import { useEffect, useState } from 'react';
import './App.css';
import ChallengeList from './components/ChallengeList';
import axios from 'axios'

function App() {
  const [challenges, setChallenges] = useState([]);

  //  We will try to use another hook for getting the backend data...
  //useEffect 
  useEffect( () =>{
    //we need to write a funtion which will use the axios code 
    const fetchChallenges = async () => {
    //we need to write code here for the fetching API
    //we need to use axios
    const response = await axios.get('http://localhost:8080/challenges');
    console.log(response)
    setChallenges(response.data);


    };
    fetchChallenges();

  }, []

  )




  return (
      <div className="App">
      <h1> My Challenge App</h1>
      <ChallengeList challenges={challenges} />
     
    </div>

  );
}

export default App;
