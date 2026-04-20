// Q68: Design a simple Chatbot for client-server communication (basic simulation)

import java.util.Scanner;

class SimpleChatbot {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Chatbot Started (type 'exit' to stop)");

        while (true) {

            System.out.print("You: ");
            String input = sc.nextLine().toLowerCase(); // take input

            // exit condition
            if (input.equals("exit")) {
                System.out.println("Bot: Goodbye!");
                break;
            }

            // simple responses
            if (input.contains("hello")) {
                System.out.println("Bot: Hello! How can I help you?");
            } 
            else if (input.contains("name")) {
                System.out.println("Bot: I am a Java Chatbot.");
            } 
            else if (input.contains("course")) {
                System.out.println("Bot: You are studying MCA.");
            } 
            else {
                System.out.println("Bot: Sorry, I don't understand.");
            }
        }

        sc.close();
    }
}
