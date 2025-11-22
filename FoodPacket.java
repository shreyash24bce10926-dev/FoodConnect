import java.io.Serializable;

public class FoodPacket implements Serializable {
    private String id;
    private String foodName;
    private String quantity;
    private String status; // AVAILABLE or CLAIMED

    public FoodPacket(String id, String foodName, String quantity) {
        this.id = id;
        this.foodName = foodName;
        this.quantity = quantity;
        this.status = "AVAILABLE";
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ID: " + id + " | Item: " + foodName + " (" + quantity + ") | Status: " + status;
    }
}
