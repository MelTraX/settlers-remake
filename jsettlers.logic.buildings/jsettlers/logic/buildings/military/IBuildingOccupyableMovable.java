package jsettlers.logic.buildings.military;

import jsettlers.common.buildings.OccupyerPlace.ESoldierType;
import jsettlers.common.movable.EMovableType;
import jsettlers.common.movable.IMovable;
import jsettlers.common.position.ShortPoint2D;
import jsettlers.logic.newmovable.interfaces.IAttackable;

/**
 * 
 * @author Andreas Eberle
 * 
 */
public interface IBuildingOccupyableMovable {

	void setOccupyableBuilding(IOccupyableBuilding building);

	EMovableType getMovableType();

	ESoldierType getSoldierType();

	IMovable getMovable();

	void leaveOccupyableBuilding(ShortPoint2D newPosition);

	void setSelected(boolean selected);

	void informAboutAttackable(IAttackable attackable);
}
