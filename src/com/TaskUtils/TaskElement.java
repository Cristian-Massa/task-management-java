package com.TaskUtils;

public class TaskElement{
    int id;
    String description;

    public TaskElement(int id, String description){
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString(){
        return "Tarea de id: " + this.id + "\n"  + "Tarea: " + this.description;
    }
}