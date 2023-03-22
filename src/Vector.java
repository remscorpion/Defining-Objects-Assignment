/**
 * @author Tomohiro Matsunaga
 * @since 03/22/2023
 * This is a Vector object
 */
public class Vector {
    private double x;  // X coordinate
    private double y;  // Y coordinate

    /**
     * Construction without param, x and y will be 0.0
     */
    public Vector() {
        setX(0);
        setY(0);
    }

    /**
     * Construction with param, x and y will be set as param
     * @param i X coordinate
     * @param j Y coordinate
     */
    public Vector(double i, double j) {
        setX(i);
        setY(j);
    }

    /**
     * Get X coordinate
     * @return value of X as double
     */
    public double getX() {
        return this.x;
    }

    /**
     * Get Y coordinate
     * @return value of Y as double
     */
    public double getY() {
        return this.y;
    }

    /**
     * Set x value
     * @param i X coordinate
     */
    public void setX(double i) {
        this.x = i;
    }

    /**
     * Set y value
     * @param i Y coordinate
     */
    public void setY(double i) {
        this.y = i;
    }

    /**
     * Add current vector with another vector
     * @param b a vector
     * @return A new vector as the result of addition
     */
    public Vector plus(Vector b) {
        return new Vector(getX() + b.getX(), getY() + b.getY());
    }

    /**
     * Minus current vector with another vector
     * @param b a vector
     * @return A new vector as the result of subtraction
     */
    public Vector minus(Vector b) {
        return new Vector(getX() - b.getX(), getY() - b.getY());
    }

    /**
     * Multiply current vector by an integer
     * @param i factor
     * @return A new vector as the result of multiplication
     */
    public Vector times(int i) {
        return new Vector(getX() * i, getY() * i);
    }

    /**
     * Dot product
     * @param b a vector
     * @return A new vector as the result of dot product
     */
    public double dot(Vector b) {
        return getX() * b.getX() + getY() * b.getY();
    }

    /**
     * Calculate the distance to another vector
     * @param b a vector
     * @return a double number as the result
     */
    public double distanceTo(Vector b) {
        return Math.sqrt(Math.pow(b.getX() - getX(), 2) + Math.pow(b.getY() - getY(), 2));
    }

    /**
     * Returns a string representing the vector
     * @return a string of the form "<x, y>", x and y will be show as double
     */
    public String toString() {
        return "<" + getX() + ", " + getY() + ">";
    }

    /**
     * Test if this vector is equal to the current vector.
     * This method will compare the return value of the toString() method of two vectors to see if they are equal.
     * If the same will return true, vice versa.
     * @param b A object
     * @return a boolean result
     */
    public boolean equals(Object b) {
        return toString().equals(b.toString());
    }
}
