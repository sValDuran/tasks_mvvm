package br.edu.ifsp.tasks_mvvm.dto

data class TaskDto(
    val id: Long,
    val description: String,
    val isCompleted: Boolean
)