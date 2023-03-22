/**
 * @author Tomohiro Matsunaga
 * @since 03/22/2023
 * This is a Starship object
 */
public class Starship {
    private String name;  // the name of the ship
    private Vector position; // the position of the ship
    private Vector velocity;  // the velocity of the ship

    /**
     * Construction with params, name and position will be set as param
     * @param shipName the name of the ship
     * @param currentPosition the position of the ship
     */
    public Starship(String shipName, Vector currentPosition) {
        setName(shipName);
        setPosition(currentPosition);
        this.velocity = new Vector();
    }

    /**
     * Set the ship name
     * @param shipName the name of the ship
     */
    public void setName(String shipName) {
        this.name = shipName;
    }

    /**
     * Set the position of the ship
     * @param currentPosition the position of the ship
     */
    public void setPosition(Vector currentPosition) {
        this.position = currentPosition;
    }

    /**
     * Get the name of the ship
     * @return a string containing the name of the ship
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get the position of the ship
     * @return a vector that is the position of the ship
     */
    public Vector getPosition() {
        return this.position;
    }

    /**
     * Get the velocity of the ship
     * @return a vector that is the velocity of the ship
     */
    public Vector getVelocity() {
        return this.velocity;
    }

    /**
     * Changing the velocity of the ship
     * @param vector a vector that is the accelerate
     */
    public void accelerate(Vector vector) {
        this.velocity = this.velocity.plus(vector);
    }

    /**
     * Update the position of the ship by adding the velocity
     */
    public void drift() {
        this.position = this.position.plus(this.velocity);
    }

    /**
     * Returns a string that include the name, position, and velocity of teh ship
     * @return a string of the form "SHIP NAME at <POSITION> moving <VELOCITY>"
     */
    public String toString() {
        return getName() + " at " + getPosition().toString() + " moving " + getVelocity().toString();
    }
}
