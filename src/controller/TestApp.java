package controller;

import service.IStudentService;
import servicefactory.StudentServiceFactory;

public class TestApp {
    public static void main(String[] args) {
        IStudentService studentService = StudentServiceFactory.getStudentService();
        String msg = studentService.addStudent("Swapnil", 24, "Mumbai Indians");
        if(msg.equalsIgnoreCase("success")){
            System.out.println("Row inserted successfully!!!");
        }else{
            System.out.println("Unable to insert the row!");
        }
    }
}
