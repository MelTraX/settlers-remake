package jsettlers.logic.newmovable.interfaces;

import jsettlers.common.movable.EMovableType;
import jsettlers.common.position.ILocatable;

/**
 * This interface defines the methods needed by soldiers to able to attack the implementor of this interface.
 * 
 * @author Andreas Eberle
 * 
 */
public interface IAttackable extends ILocatable {
	/**
	 * Hits this attackable with the given strength.
	 * 
	 * @param strength
	 *            The strength of the hit.
	 */
	void receiveHit(float strength);

	/**
	 * Get the health of this {@link IAttackable}.
	 * 
	 * @return Health of the {@link IAttackable}.
	 */
	float getHealth();

	/**
	 * Gets the Player of this {@link IAttackable}.
	 * 
	 * @return Player of this {@link IAttackable}.
	 */
	byte getPlayer();

	/**
	 * 
	 * @return true if this movable is currently attackable.<br>
	 *         false otherwise.
	 */
	boolean isAttackable();

	/**
	 * 
	 * @return Gets the {@link EMovableType} of this {@link IAttackable}.
	 */
	EMovableType getMovableType();

	/**
	 * Informs this attackable of an attackable enemy.
	 * 
	 * @param attackable
	 *            The attackable enemy.
	 */
	void informAboutAttackable(IAttackable attackable);

}
