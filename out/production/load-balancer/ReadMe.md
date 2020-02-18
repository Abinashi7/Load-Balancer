
Author: Abinashi Singh

Language: Java

Version: Java 8 and above is required

Running instructions:

1. Create a directory and add the "src" folder.
2. Add the server info ( Format -> Name:weight )in the "Test.java" via command-line arguments.
3. Run the "Test" class.

Implementation: 
In this program I chose to implement Weighted-Round-Robin Algorithm. Round robin is a simple algorithm
to distribute client requests cross a pool of available servers. I chose to implement Weighted-Round-Robin
in order to avoid overloading servers with less capacity. 

The weighted round robin load balancing algorithm allows to assign weights to each server based on a server's load-capacity. Servers with more capacity 
receive a higher proportion of the job requests. For example, we have servers A,B amd C.

• Server A can take 10 requests on average
• Server B can handle 5 requests on average
• Server C can handle 2 requests on average

Next, assume that the load balancer receives 6 requests. The output could be:

• 3 requests are sent to Server A
• 2 requests are sent to Server B
• 1 request is sent to Server C.

This way, the weighted-Round-Robin algorithm distributes the incoming requests to each server's load-capacity.

