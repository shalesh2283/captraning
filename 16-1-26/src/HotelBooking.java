public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

    public HotelBooking() {
        guestName = "NA";
        roomType = "NA";
        nights = 0;
    }

    public HotelBooking(String g, String r, int n) {
        guestName = g;
        roomType = r;
        nights = n;
    }

    public HotelBooking(HotelBooking h) {
        guestName = h.guestName;
        roomType = h.roomType;
        nights = h.nights;
    }

    public static void main(String[] args) {
        HotelBooking h1 = new HotelBooking();
        HotelBooking h2 = new HotelBooking("Rahul", "AC", 2);
        HotelBooking h3 = new HotelBooking(h2);

        System.out.println(h3.guestName);
    }
}
