package org.example;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.SUBD;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Server server= ServerBuilder.forPort(9090).addService( new SUBD() ).build();
        try {
            server.start();
            server.awaitTermination();
        }
        catch (Exception e){
            System.out.println(":(");
        }

    }


}
