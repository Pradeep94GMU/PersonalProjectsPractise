import React, { useState, useEffect } from 'react';
import './App.css';  // Import the CSS file

function App() {
  const [description, setDescription] = useState([]);
  const [newItem, setNewItem] = useState("");
  const [message, setMessage] = useState("");

  // Fetch the list of to-do items from the backend
  const fetchItems = async () => {
    try {
      const response = await fetch('http://localhost:8080/api/v1/todo');
      const data = await response.json();
      console.log(data);
      setDescription(data);
    } catch (error) {
      console.error('Failed to fetch items', error);
    }
  };

  // Add a new item to the list (POST request to the backend)
  const addItem = async () => {
    if (newItem.trim() === "") return;

    const item = { description: newItem };

    try {
      const response = await fetch('http://localhost:8080/api/v1/todo', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(item),
      });

      if (response.ok) {
        setMessage('Item added successfully!');
        setNewItem("");  // Clear input field
        fetchItems();    // Refresh the list
      } else {
        setMessage('Failed to add item.');
      }
    } catch (error) {
      setMessage('Error occurred while adding item.');
      console.error('Error adding item:', error);
    }
  };

  // Fetch the list of items when the component mounts
  useEffect(() => {
    fetchItems();
  }, []);

  return (
    <div className="container">
      <h2 className="title">Item List</h2>
      <input
        type="text"
        placeholder="Item Name"
        value={newItem}
        onChange={(e) => setNewItem(e.target.value)}
        className="input"
      />
      <button onClick={addItem} className="button">
        Add Item
      </button>
      <p>{message}</p>
      <ul className="list">
        {description.map((item, index) => (
          <li key={index} className="list-item">{item.description}</li>
        ))}
      </ul>
    </div>
  );
}

export default App;
