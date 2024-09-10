"use client";

import { useState, useEffect } from "react";
import TaskForm from '../components/TaskForm';
import { getTaskLists } from "../api/api";

export default function Home() {
  const [tasks, setTasks] = useState([]);

  useEffect(() => {
    const fetchTaskLists = async () => {
      try {
        const response = await getTaskLists();
        setTaskLists(response.data);
      } catch (error) {
        console.error('Error fetching task lists:', error);
      }
    };

    fetchTaskLists();
  }, []);

  const handleTaskAdded = (newTask) => {
    setTasks([...tasks, newTask]);
  };

  return (
    <div>
      <h2>Task Lists</h2>
      <TaskForm onTaskAdded={handleTaskAdded}/>
      <ul>
        {tasks.map(task => (
          <li key={task.id}>{task.name}</li>
        ))}
      </ul>
    </div>
  );
}
