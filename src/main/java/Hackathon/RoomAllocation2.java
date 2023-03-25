package Hackathon;

import java.util.*;

public class RoomAllocation2 {
    public static int getRooms(int n, ArrayList<Integer> capacities) {
        Collections.sort(capacities, Collections.reverseOrder());
        int numRooms = 0;
        for (int capacity : capacities) {
            if (n == 0) {
                break;
            }
            if (capacity <= n) {
                numRooms++;
                n -= capacity;
            }
        }
        if (n == 0) {
            return numRooms;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numberOfPeople = sc.nextInt();
        int numberOfRoomCapacity = sc.nextInt();
        ArrayList<Integer> capacities = new ArrayList<>();
        for (int i = 0; i < numberOfRoomCapacity; i++) {
            capacities.add(sc.nextInt());
        }
        System.out.println(getRooms(numberOfPeople, capacities));
    }
}
