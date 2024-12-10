import com.ClearConsole;
import com.Task;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al sistema gestor de tareas");
        boolean isRunning = true;
        while(isRunning){
        System.out.println("Opciones a elegir: \n 1 - Crear tarea \n 2 - Ver todas las tareas \n 3 - Borrar tarea");
        byte selection = scanner.nextByte();
            switch(selection) {
                case 1:
                    task.addTask();
                    break;
                case 2:
                    System.out.println("Ver todas las tareas:");
                    task.getAllTasks();
                    break;
                case 3:
                    task.deleteTaskById();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Esa accion no existe.");

            }
            ClearConsole.clearConsole();
        }
    }
}