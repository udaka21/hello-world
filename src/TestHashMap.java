import java.util.ArrayList;

/**
 * Created by udaka on 11/9/16.
 */
class DeliveryEventData{}

 class DeliveryEventDataList {

    private long length;
    private ArrayList<DeliveryEventData> event;

    public  DeliveryEventDataList(){
        this.length = 0;
        this.event = null;
    }

    public void setEvent(ArrayList<DeliveryEventData> event) {
        this.event = event;
    }

    public ArrayList<DeliveryEventData> getEvent() {
        return event;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getLength() {
        return length;
    }

    public void  addDeliveryEventDataToList (DeliveryEventData dataSet) {

    }


}

public class TestHashMap {

    public static void main(String[] args) {
//        String storageQueueName=null;
//        DeliveryEventData event = null;
//        HashMap<String, DeliveryEventDataList> messageMap = new HashMap<>();
//
//
//        messageMap.get(storageQueueName).addDeliveryEventDataToList(event);
//        DeliveryEventDataList messageMetadataList = messageMap.get(storageQueueName);
//
//
//        if (null == messageMetadataList) {
//
//            //messageMetadataList = new ArrayList<>();
//            //Put storageQueueName and messageMetadataList to messageMap hash.
//            messageMap.put(storageQueueName, messageMetadataList);
//        }

        Runnable runnable = new TestRunnable();



        Thread thread = new Thread(runnable);

        Runnable runnable2 = new TestRunnable();
        Thread threa2 = new Thread(runnable2);

        Runnable runnable3 = new TestRunnable();

        Thread thread3 = new Thread(runnable3);

        thread.start();
        threa2.start();
        thread3.start();

        try {
            thread.join();
            threa2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
