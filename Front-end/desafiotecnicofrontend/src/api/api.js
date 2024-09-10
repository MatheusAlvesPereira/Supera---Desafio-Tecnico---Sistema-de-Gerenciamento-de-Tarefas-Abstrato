import axios from 'axios';

const api = axios.create({
  baseURL: 'http://localhost:8080', // URL do back-end
});

export const getTaskLists = () => api.get('/lists');
export const getTasksByListId = (listId) => api.get(`/tasks/${listId}`);