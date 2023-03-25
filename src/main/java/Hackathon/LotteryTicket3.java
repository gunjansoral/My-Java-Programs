package Hackathon;

import java.util.*;

public class LotteryTicket3 {
    class Person {
        int desiredTicketNumber;
        int personNumber;
        int ticket;

        public Person(int desiredTicketNumber, int personNumber) {
            this.desiredTicketNumber = desiredTicketNumber;
            this.personNumber = personNumber;
        }

        public void incrementDesiredTicketNumber() {
            this.desiredTicketNumber++;
        }

        public void setTicket(int ticket) {
            this.ticket = ticket;
        }
    }

    public int[] getTicketAllocation(int[] desiredTicketNumbers) {
        Queue<Person> queue = new ArrayDeque<>();
        //add all person into queue with incremented index position
        for (int i = 0; i < desiredTicketNumbers.length; i++) {
            queue.add(new Person(desiredTicketNumbers[i], i));
        }
        HashSet<Integer> soldTickets = new HashSet<>();
        Person[] list = new Person[desiredTicketNumbers.length];
        while (!queue.isEmpty()) {
            Person p = queue.poll();
            if (!soldTickets.contains(p.desiredTicketNumber)) {
                soldTickets.add(p.desiredTicketNumber);
                p.setTicket(p.desiredTicketNumber);
                list[p.personNumber] = p;
            } else {
                p.incrementDesiredTicketNumber();
                queue.add(p);
            }
        }


        //make an array of person containing ticket number in order
        int[] result = new int[list.length];
        for (int i = 0; i < result.length; i++) {
            result[i] = list[i].ticket;
        }
        return result;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int ticketChoices = sc.nextInt();
        int[] desiredTicketNumbers = new int[ticketChoices];
        LotteryTicket3 ticketAllocation = new LotteryTicket3();
        for (int i = 0; i < desiredTicketNumbers.length; i++) {
            desiredTicketNumbers[i] = sc.nextInt();
        }
        int[] numbersAllotted = ticketAllocation.getTicketAllocation(desiredTicketNumbers);
        //print
        for (int i = 0; i < desiredTicketNumbers.length; i++) {
            System.out.println(numbersAllotted[i]);
        }
    }
}
