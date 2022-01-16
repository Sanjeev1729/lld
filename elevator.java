Elevator design:
---------------
1)Is it for a office space or for a appartment?
2)How many floors are there?
3)What is the maximum capicity?
4)How should be the scheduling if two person wants to go in opposite directions.
5)will there be a basement.
6)Maximum number of people?
7)Direction
8)State : Idle , UP , DOWN

classes and interfaces:
-----------------------
enum Direction{
	 UP,DOWN,IDLE
}
enum state{
	 MOVING, STOPPED
}
Interface IEnterface{
	void status();
	void get(elevatorId);
	void update(int elevatorId,int floor);
	void pickup(int floor,direction dir);
	void reset(int elevatorId,int floor);
}

class Elevator{
    int minFloor;
	int maxFloor;
	sourceFloor
	destinationFloor;
	getGoalFloor();
	moveNext();
	setGoalFloor();
	reset();
	moveToFloor();
	getDirection();
}

class ElevatorController implemnt IEnterface{
	Elevator elevator[0] = new Elevator();
	Elevator elevator[1] = new Elevator();
}
class system{
	
	runs scheduling algorithms
	
}
	
	