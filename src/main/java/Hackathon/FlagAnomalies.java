package Hackathon;

import java.util.*;

public class FlagAnomalies {
    public class Log {
        int userId;
        int timeStamp;
        String actionType;
        private int signIn;
        private int signOut;
        int timeDiff;

        public Log(int userId, int timeStamp, String actionType) {
            this.userId = userId;
            this.timeStamp = timeStamp;
            this.actionType = actionType;
            this.signIn = 0;
            this.signOut = 0;
        }

        public void setSignIn(int signIn) {
            this.signIn = signIn;
        }

        public void setSignOut(int signOut) {
            this.signOut = signOut;
        }
    }

    public int[] flagAnomaly(String[] logs) {
        ArrayList<Integer> timeDifference = new ArrayList<>();

        //separate each string of logs into int userId, int timeStamp and a string actionType values
        Log[] log = new Log[logs.length];
        for (int i = 0; i < logs.length; i++) {
            String seperatedLog[] = logs[i].split(";");
            int userId = Integer.parseInt(seperatedLog[0]);
            int timeStamp = Integer.parseInt(seperatedLog[1]);
            String actionType = seperatedLog[2];
            log[i] = new Log(userId, timeStamp, actionType);
        }

        //calculate signIn and signOut value of same id -> timeDiff = signOut - signIn, for each log
        for (int i = 0; i < log.length; i++) {
            for (int j = i + 1; j < log.length; j++) {
                if (log[i].userId == log[j].userId && log[j].timeStamp - log[i].timeStamp <= 60) {
                    timeDifference.add(log[i].userId);
                }
            }
        }

        //store each id in an array named timeDifferance which timeStamp should be less than 60 and sort it in ascending order
        Collections.sort(timeDifference);
        int[] finalIdsOfUsers = new int[timeDifference.size()];
        for (int i = 0; i < finalIdsOfUsers.length; i++)
            finalIdsOfUsers[i] = timeDifference.get(i);

        //return the array
        return finalIdsOfUsers;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] logs = new String[size];
        for (int i = 0; i < size; i++) {
            logs[i] = sc.next();
        }
        FlagAnomalies anomaly = new FlagAnomalies();
        //print
        int[] logIds = anomaly.flagAnomaly(logs);
        if (logIds.length == 0) {
            System.out.println("N/A");
        } else {
            for (int i = 0; i < logIds.length; i++) {
                System.out.println(logIds[i]);
            }
        }
    }
}
