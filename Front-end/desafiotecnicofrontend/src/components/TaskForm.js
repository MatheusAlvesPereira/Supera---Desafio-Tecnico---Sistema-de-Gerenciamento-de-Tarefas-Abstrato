'use client'

import { useState } from 'react';
import axios from '../api/api';

const TaskForm = ({ onTaskAdded }) => {
  const [taskName, setTaskName] = useState('');

  const handleSubmit = async (e) => {
    e.preventDefault();
    try {
      const response = await axios.post('/tasks', { name: taskName });
      onTaskAdded(response.data);
      setTaskName('');
    } catch (error) {
      console.error('Error adding task:', error);
    }
  };

  return (
    <form onSubmit={handleSubmit}>
      <input
        type="text"
        value={taskName}
        onChange={(e) => setTaskName(e.target.value)}
        placeholder="New task name"
        required
      />
      <button type="submit">Add Task</button>
    </form>
  );
};

export default TaskForm;