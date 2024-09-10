'use client'

import { useParams } from 'next/navigation';
import { useState, useEffect } from 'react';
import axios from '../../../api/api';

export default function TaskDetailPage() {
  const { id } = useParams();
  const [task, setTask] = useState(null);

  useEffect(() => {
    if (id) {
      const fetchTask = async () => {
        try {
          const response = await axios.get(`/tasks/${id}`);
          setTask(response.data);
        } catch (error) {
          console.error('Error fetching task:', error);
        }
      };

      fetchTask();
    }
  }, [id]);

  if (!task) return <p>Loading...</p>;

  return (
    <div>
      <h2>Task Detail</h2>
      <p>Name: {task.name}</p>
      {/* Add more details and functionality for editing the task here */}
    </div>
  );
}