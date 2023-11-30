package br.com.cod3r.singleton.connectionPool.monoestate.conn;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    public final static int POOL_SIZE = 2;
    private static List<Connection> connectionsPool;

    static{
        System.out.println("Creating Connection Pool");
        connectionsPool = new ArrayList<Connection>();
        for(int i = 0; i < POOL_SIZE; i++){
            connectionsPool.add(new Connection());
        }
    }

    public ConnectionPool(){
        System.out.println("New instance of Connection");
    }

    public Connection getConnection(){
        Connection availabe = null;
        for (Connection conn : connectionsPool){
            if(!conn.isInUse()){
                availabe = conn;
                break;
            }
        }
        if(availabe == null){
            System.out.println("No Connections avaiable");
            return null;
        }
        availabe.setInUse(true);
        return availabe;
    }

    public void leaveConnection(Connection conn){
        conn.setInUse(false);
    }
}
