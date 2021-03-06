package net.maunium.Portal2D.Blocks;

import org.newdawn.slick.Color;
import org.newdawn.slick.SlickException;

import net.maunium.Portal2D.Portal2D;

/**
 * The built-in bullethole block. Bullets can pass through, but players can't.
 * 
 * @author Tulir293
 * @since 0.1
 */
public class Bullethole extends AbstractBlock {
	public static final int ID = 7;
	public static final Color COLORID = new Color(255, 255, 0);
	
	public Bullethole(Portal2D host) throws SlickException {
		canWalkThrough = false;
		canShootThrough = true;
		canAttachPortal = false;
		collisionPriority = 80;
		texture = host.getImage("blocks/tile_bullethole");
	}
}