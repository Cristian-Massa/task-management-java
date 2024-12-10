package com;

import java.io.Console;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Scanner;

import com.TaskUtils.TaskElement;

interface ITasks{
    void addTask();
    void deleteTaskById();
    void getAllTasks();

}

public class Task implements  ITasks{
        Scanner scanner = new Scanner(System.in);
    ArrayList<TaskElement> tasks = new ArrayList<TaskElement>();
    public void addTask(){
        ClearConsole.clearConsole();
        boolean isRunning= true;
        System.out.println("Agreguemos una tarea:");
        while(isRunning){
            System.out.println("Por favor ingrese la descripcion de la tarea");
            String input = this.scanner.nextLine();
            if(!input.isEmpty()){
                int index = this.tasks.size() + 1;
                TaskElement newTask = new TaskElement(index, input);
                this.tasks.add(newTask);
                System.out.println("Tarea agregada.");
                System.out.println("Salir? presiona 0 o cualquier otra letra para continuar");
                String decision = this.scanner.next();
                if(decision.equals("0")){
                    System.out.println("Volviendo al menu principal");
                    isRunning = false;
                }
            }else{
                System.out.println("No puedes agregar algo sin descripcion.");

            }
        }
    };
    public void deleteTaskById(){
        ClearConsole.clearConsole();
        boolean isRunning = true;
        while (isRunning){
            System.out.println("Borrar tareas: Seleccionala con el id.");
            int id = this.scanner.nextInt() - 1;
            try {
                this.tasks.remove(id);
                System.out.println("Tarea borrada.");
            } catch (Exception e) {
                System.out.println("Tarea no existe.");
            }
            System.out.println("Salir? presiona 0 o cualquier otra letra para continuar");
            String decision = this.scanner.next();
            if(decision.equals("0")){
                System.out.println("Volviendo al menu principal");
                isRunning = false;
            }
        }
    };

    public void getAllTasks(){
        ClearConsole.clearConsole();
        System.out.println("Viendo las tareas.");
            for (int i = 0; i < this.tasks.size(); i++) {
                System.out.println(this.tasks.get(i));
            }
            System.out.println("Para salir presione 0.");
            String close = this.scanner.next();
    }


}