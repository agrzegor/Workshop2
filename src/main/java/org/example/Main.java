package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        boolean running = true;
        User user = new User();
        UserDao userDao = new UserDao();
        while (running) {

            /*
                Create user
             */

            System.out.println("Provide user name");
            user.setUserName(scn.nextLine());
            System.out.println("Provide user email");
            user.setEmail(scn.nextLine());
            System.out.println("Provide user password");
            user.setPassword(userDao.hashPassword(scn.nextLine()));
            user = userDao.create(user);
            System.out.println("Continue - enter / finish - exit");

            /*
            Read user
             */

            System.out.println("Provide user id: ");
            int userId = scn.nextInt();
            User userUpdate = userDao.read(userId);
            userDao.delete(userId);

           /*
           Update user
            */

            System.out.println("Set user name: ");
            String setName = scn.next();

            System.out.println("Set email: ");
            String setEmail = scn.next();
            userUpdate.setEmail(setEmail);

            System.out.println("Set password: ");
            String setPassword = scn.next();
            userUpdate.setPassword(setPassword);

            userDao.update(userUpdate);

            /*
            Find all users
             */

            System.out.println("Print users: ");
            userDao.findAll();
            userDao.printAllUsers();
            System.out.println("Continue - enter / finish - exit");
            scn.nextLine();

            if (scn.nextLine().equals("exit")) {
                running = false;
            }
        }
    }
}