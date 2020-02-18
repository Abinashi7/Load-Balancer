import java.util.*;

/**
 * This program creates an instance of ServerInfo that fetches the capacities of the servers in the pool and
 * returns the server name based on the Weighted Round Robin Algorithms.
 * @author Abinashi Singh
 */
public class ServerInfo {
    /**To generate random numbers */
    private Random RandGenerator = new Random();

    /** To store the server info */
    private TreeMap<Integer, Server> servers;

    /**Sum of the weights of all the servers */
    private int totalWeight;

    /**
     * Method that will store the information of all the current servers in the Map.
     * @param servers the list of current servers
     */
    public void feed(ArrayList<Server> servers) {
        this.servers = new TreeMap<>();
        totalWeight = 0;

        // For each server, increment the global total weight
        for(Server currentServer : servers) {
            totalWeight += currentServer.getWeight();
            this.servers.put(totalWeight, currentServer);
        }
    }

    /**
     * Method to get the server to assign a request. This is calculating the total sum of the weight with a random number and on
     * the result, check with the upper limit of all the server currently in the pool.
     * @return the Server name
     */
    public Server getServer() {
        int rnd = Math.abs(RandGenerator.nextInt()%this.totalWeight+1);
        return servers.ceilingEntry(rnd).getValue();

    }



}
