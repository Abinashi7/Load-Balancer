import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * This program takes in servers from the command-line and store their information
 */
public class Test {

    public static void main(String[] args) {

        // to store the server distribution for printing purposes
        Map<String, Integer> distribution = new HashMap<>();

        // List to store current servers
        ArrayList<Server> servers= new ArrayList<>();

        // Creates an instance of all the servers available and store it in the server pool
        int numberOfServer = args.length;
        for(int i=0; i < numberOfServer; i++){
            String serverInfo = args[i];
            String serverName = serverInfo.substring(0,1);
            int weight = Integer.parseInt(serverInfo.substring(2));
            distribution.put(serverName, 0);
            servers.add(new Server(serverName, weight));

        }

        ServerInfo serverRoom = new ServerInfo();
        serverRoom.feed(servers);

        // Number of jobs to allocate to the current server pool
        int rounds = 6;

        for (int i = 0; i < rounds; i++) {
            String result = serverRoom.getServer().getName();
            distribution.put(result, distribution.get(result) + 1);
        }
        System.out.println("Current distribution is:");
        // Printing out the current distribution
        for(String key: distribution.keySet()){
            System.out.println(key + "->"+distribution.get(key));
        }

    }
}
