package br.edu.ifsp.tasks_mvvm.data.repository

import br.edu.ifsp.tasks_mvvm.data.dao.TaskDao
import br.edu.ifsp.tasks_mvvm.data.model.Task

class TasksRepository {
    private val dao = TaskDao

    fun findAll(): List<Task>{
        return dao.getAllTasks()
    }

    fun findById(id: Long): Task{
        return dao.getTask(id)
    }

    fun insert(task: Task){
        dao.addTask(task)
    }
}