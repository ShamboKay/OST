
public class HotelRoom {

    private int roomNumber;
    private String roomType;
    private int occupied; // 0 = vacant, 1 = occupied
    private double rate;

    public HotelRoom() {
        roomNumber = 0;
        roomType = "Single";
        occupied = 0;
        rate = 0.0;
    }

    public HotelRoom(int roomNumber, String roomType,
                     int occupied, double rate) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.occupied = occupied;
        this.rate = rate;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getOccupied() {
        return occupied;
    }

    public void setOccupied(int occupied) {
        this.occupied = occupied;
    }

   
    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}