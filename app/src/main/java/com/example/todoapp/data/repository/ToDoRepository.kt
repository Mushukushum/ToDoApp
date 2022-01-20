package com.example.todoapp.data.repository

import androidx.lifecycle.LiveData
import com.example.todoapp.data.ToDoDao
import com.example.todoapp.data.models.ToDoData

class ToDoRepository(
    private val todoDao: ToDoDao
) {

    val getAllData: LiveData<List<ToDoData>> = todoDao.getAllData()
    val sortByHighPriority: LiveData<List<ToDoData>> = todoDao.sortByHighPriority()
    val sortByLowPriority: LiveData<List<ToDoData>> = todoDao.sortByLowPriority()

    suspend fun insertData(toDoData: ToDoData){
        todoDao.insertData(toDoData)
    }

    suspend fun updateData(toDoData: ToDoData){
        todoDao.updateData(toDoData)
    }

    suspend fun deleteItem(toDoData: ToDoData){
        todoDao.deleteItem(toDoData)
    }

    suspend fun deleteAll(){
        todoDao.deleteAll()
    }

    fun searchDatabase(searchQuery: String): LiveData<List<ToDoData>>{
        return todoDao.searchDatabase(searchQuery)
    }
}