/**
 * This program creates an instance of a server to store it's name and load-capacity.
 * @author Abinashi Singh
 */
public class Server {
    /** Name of the server */
    private String name;

    /** Load-capacity of this server */
    private int capacity;

    /**
     * Constructor to initialize the server
     * @param name of the server
     * @param cap the capacity of this server
     */
    public Server(String name, int cap) {
        this.capacity = cap;
        this.name = name;
    }

    /**
     * Getter method to get a server's name
     * @return the name of this server
     */

    public String getName()
    {
        return this.name;
    }

    /**
     * Getter method to get a server's load-capacity
     * @return the load-capacity of this server
     */
    public int getWeight()
    {
        return this.capacity;
    }

}