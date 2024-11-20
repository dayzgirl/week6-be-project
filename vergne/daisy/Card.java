package vergne.daisy;

public class Card {
    private int value;
    private String name;
    
    // Constructor - Initializes a new card with a value and name
    public Card(int value, String name) {
        this.value = value;
        this.name = name;
    }
    
    // Getters and setters to access and modify private value fields
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    // Method to print card information to console
    public void describe() {
        System.out.println(this.name);
    }
}