package shaun.reed.iqbusinessgroup.assessment.main;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;

public class Receiver {

  private final static String QUEUE_NAME = "sreed-iq-queue";

  public static void main(String[] args) throws Exception {

    ConnectionFactory factory = new ConnectionFactory();
    factory.setHost("localhost");

    Connection connection = factory.newConnection();
    Channel channel = connection.createChannel();
    channel.queueDeclare(QUEUE_NAME, false, false, false, null);

    System.out.println("-> Ready to receive messages");
    System.out.println("----------------------------");



    DeliverCallback deliverCallback = (consumerTag, delivery) -> {
      String message = new String(delivery.getBody(), "UTF-8");
      System.out.println("-> " + message);

      String receivedName = message.substring(18);

      if (!receivedName.isEmpty()) {
        String responseMessage = "Hello " + receivedName + ", I am your father!";
        System.out.println("-> " + responseMessage);
      } else {
        System.out.println("Invalid input given. Name of sender is empty");
      }
    };

    channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
  }

}


