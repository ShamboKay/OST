
public class HotelRoomDriver {

    public static void main(String[] args) {

        // Create two objects using the no-argument constructor
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        // Set room details for Q1
        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");

        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        // Set occupancy and nightly rates
        roomA.setOccupied(1);
        roomA.setRate(100.0);

        roomB.setOccupied(0);
        roomB.setRate(80.0);

        // Create roomC using the four-argument constructor
        HotelRoom roomC = new HotelRoom(202, "Single", 0, 90.0);

        // roomA details
        System.out.println("Room A Details:");
        System.out.println("Room Number: " + roomA.getRoomNumber());
        System.out.println("Room Type: " + roomA.getRoomType());
        System.out.println("Occupied: " + roomA.getOccupied());
        System.out.println("Nightly Rate: " + roomA.getRate());
        System.out.println();

        // roomB details
        System.out.println("Room B Details:");
        System.out.println("Room Number: " + roomB.getRoomNumber());
        System.out.println("Room Type: " + roomB.getRoomType());
        System.out.println("Occupied: " + roomB.getOccupied());
        System.out.println("Nightly Rate: " + roomB.getRate());
        System.out.println();

        // roomC details
        System.out.println("Room C Details:");
        System.out.println("Room Number: " + roomC.getRoomNumber());
        System.out.println("Room Type: " + roomC.getRoomType());
        System.out.println("Occupied: " + roomC.getOccupied());
        System.out.println("Nightly Rate: " + roomC.getRate());
    }
}