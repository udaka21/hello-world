//import sun.rmi.runtime.Log;
//
//import javax.jms.QueueConnection;
//import javax.jms.QueueSession;
//import javax.naming.Context;
//import javax.naming.InitialContext;
//import java.util.Properties;
//
//
//
///**
// * Created by udaka on 8/10/16.
// */
//public class SampleQueueSender {
//    public static final String QPID_ICF = "org.wso2.andes.jndi.PropertiesFileInitialContextFactory";
//    private static final String CF_NAME_PREFIX = "connectionfactory.";
//    private static final String QUEUE_NAME_PREFIX = "queue.";
//    private static final String CF_NAME = "qpidConnectionfactory";
//    private static final long RECORD_COUNT = 2000;
//    private static final Log log = LogFactory.getLog(SampleQueueSender.class);
//    private static String CARBON_CLIENT_ID = "carbon";
//    private static String CARBON_VIRTUAL_HOST_NAME = "carbon";
//    private static String CARBON_DEFAULT_HOSTNAME = "10.100.4.165";
//    private static String CARBON_DEFAULT_PORT = "5672";
//    String userName = "admin";
//    String password = "admin";
//    String queueName = "testQueue";
//    long messageCount = 0;
//    private QueueConnection queueConnection;
//    private QueueSession queueSession;
//
//    public void sendMessage () {
//
//        PropertyConfigurator.configure("log4j.properties");
//        Properties properties = new Properties();
//        properties.put(Context.INITIAL_CONTEXT_FACTORY, QPID_ICF);
//        properties.put(CF_NAME_PREFIX + CF_NAME, getTCPConnectionURL(userName, password));
//        properties.put(QUEUE_NAME_PREFIX + queueName, queueName);
//        InitialContext ctx = new InitialContext(properties);
//    }
//
//
//
//
//
//
//
//}
