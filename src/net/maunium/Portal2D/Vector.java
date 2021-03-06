package net.maunium.Portal2D;

/**
 * Vector class. Contains three values, X-coordinate, Y-coordinate and the side that was hit.
 * 
 * @author Antti
 * @since 0.1
 */
public class Vector {
	public static Vector NULL = new Vector(-1, -1);
	public int x, y;
	public SideHit sideHit;
	
	public static enum SideHit {
		TOP, BOTTOM, LEFT, RIGHT, NULL;
		public static SideHit fromInt(int i) {
			switch (i) {
				case 0:
					return TOP;
				case 1:
					return LEFT;
				case 2:
					return BOTTOM;
				case 3:
					return RIGHT;
				default:
					return null;
			}
		}
		
		public static int toInt(SideHit s) {
			switch (s) {
				case TOP:
					return 0;
				case LEFT:
					return 1;
				case BOTTOM:
					return 2;
				case RIGHT:
					return 3;
				default:
					return -1;
			}
		}
	}
	
	/**
	 * Construct a new vector with the given X and Y coordinates and the given side hit.
	 */
	public Vector(int x, int y, SideHit sideHit) {
		this.x = x;
		this.y = y;
		this.sideHit = sideHit;
	}
	
	/**
	 * Construct a new vector with the given X and Y coordinates and set the side hit to null.
	 */
	public Vector(int x, int y) {
		this(x, y, SideHit.NULL);
	}
	
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Vector)) return false;
		Vector v = (Vector) o;
		if (v.x == x && v.y == y && v.sideHit == sideHit) return true;
		else return false;
	}
	
	@Override
	public String toString() {
		return "Vector{" + x + ", " + y + ", " + sideHit + "}";
	}
}
