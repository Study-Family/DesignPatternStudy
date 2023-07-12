package global;

public class Position {
    private int x;
    private int y;
    private int z;

    public double calcDistanceTo(Position position) {
        int distanceX = x - position.x;
        int distanceY = y - position.y;
        int distanceZ = z - position.z;
        return Math.sqrt(distanceX*distanceX + distanceY*distanceY + distanceZ + distanceZ);
    }

    public void moveTo(Position position, double speed) {
        x += position.x * speed;
        y += position.y * speed;
        z += position.z * speed;
    }
}
