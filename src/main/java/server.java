import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public  class server {
    public static void main(String[] args) {


        int port = 5023;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Server is listening on port " + port);

            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("New client connected");
                BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String clientData = " ";
                clientData = reader.readLine();
                System.out.println("clientdata "+clientData);
            }
//                char[] chars = clientData.toCharArray();
//                StringBuffer hex = new StringBuffer();
//                for (int i = 0; i < chars.length; i++)
//                {
//                    hex.append(Integer.toHexString((int)chars[i]));
//                }
//                String hex_value = hex.toString();
//                System.out.println("clientdata::::"+hex_value);
//            }

        } catch (IOException ex) {
            System.out.println("Server exception: " + ex.getMessage());
            ex.printStackTrace();
        }
    }
}