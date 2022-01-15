package com.example.todoapp.data.repository

import androidx.lifecycle.LiveData
import com.example.todoapp.data.ToDoDao
import com.example.todoapp.data.models.ToDoData

class ToDoRepository(
    private val todoDao: ToDoDao
) {

    val getAllData: LiveData<List<ToDoData>> = todoDao.getAllData()

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
}