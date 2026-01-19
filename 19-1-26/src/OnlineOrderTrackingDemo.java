class Order {
    int orderId;
    String orderDate;
    Order(int i,String d){
        orderId=i; orderDate=d;
    }
}

class ShippedOrder extends Order {
    String tracking;
    ShippedOrder(int i,String d,String t){
        super(i,d); tracking=t;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;
    DeliveredOrder(int i,String d,String t,String dd){
        super(i,d,t); deliveryDate=dd;
    }
    String getOrderStatus(){
        return "Delivered";
    }
}

public class OnlineOrderTrackingDemo {
    public static void main(String[] args){
        DeliveredOrder o=new DeliveredOrder(1,"1-1-25","TR123","5-1-25");
        System.out.println(o.getOrderStatus());
    }
}
