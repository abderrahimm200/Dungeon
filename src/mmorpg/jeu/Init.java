package mmorpg.jeu;

import mmorpg.cadre.outils.MathOutil;
import mmorpg.jeu.monde.generateur.RoomData;

public class Init {

	public static final RoomData[] ROOMS = new RoomData[] {
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1},
									   {1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.NORTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 1, 1},
									   {1, 0, 0, 0, 0, 1, 4, 4, 4, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 4, 4, 4, 4, 4, 0, 0, 0, 0, 1, 1},
									   {1, 1, 1, 0, 0, 0, 4, 4, 0, 0, 1, 0, 0, 0, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.SOUTH),
			new RoomData(new byte[][] {{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0, 2},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2, 2, 0, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}},
					MathOutil.Direction.WEST),
			new RoomData(new byte[][] {{2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
									   {2, 0, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {2, 0, 2, 0, 3, 3, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {2, 0, 2, 0, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2},
									   {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}},
					MathOutil.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 1},
									   {1, 2, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 0, 2, 0, 2, 0, 3, 3, 0, 2, 0, 2, 0, 2, 1},
									   {1, 2, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 0, 2, 0, 2, 0, 3, 3, 0, 2, 0, 2, 0, 2, 1},
									   {1, 2, 0, 0, 0, 0, 0, 3, 3, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 2, 2, 2, 2, 2, 3, 3, 2, 2, 2, 2, 2, 2, 1},
									   {1, 1, 1, 1, 1, 1, 2, 3, 3, 2, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.NORTH, MathOutil.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 0, 0, 1, 1, 4, 4, 4, 0, 0, 0, 0, 0, 0, 1, 1},
									   {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0, 0, 0},
									   {0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0},
									   {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0, 0},
									   {1, 1, 1, 0, 0, 0, 4, 4, 4, 4, 0, 0, 1, 0, 0, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.WEST, MathOutil.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 2, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 3, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 3, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 3, 2, 1, 1, 1, 0, 0, 0, 0, 0, 1},
									   {1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.NORTH, MathOutil.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1},
									   {0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1},
									   {0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1},
									   {1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.NORTH, MathOutil.Direction.WEST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 2, 3, 3, 3, 2, 0, 0, 0, 0, 4, 4, 0, 0, 0, 1},
									   {1, 2, 3, 3, 3, 0, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0},
									   {1, 2, 3, 3, 3, 2, 0, 0, 0, 0, 4, 0, 0, 4, 0, 0},
									   {1, 2, 2, 0, 2, 2, 0, 0, 0, 0, 0, 4, 4, 0, 0, 0},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.SOUTH, MathOutil.Direction.EAST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 1},
									   {1, 2, 0, 0, 0, 0, 0, 2, 0, 2, 2, 2, 2, 0, 2, 2},
									   {0, 0, 0, 2, 2, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2},
									   {0, 0, 0, 2, 0, 2, 0, 2, 0, 2, 0, 2, 2, 2, 0, 2},
									   {0, 0, 0, 2, 0, 2, 0, 2, 2, 2, 0, 2, 0, 0, 0, 2},
									   {1, 2, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 2, 0, 2},
									   {1, 2, 2, 2, 2, 2, 2, 0, 0, 0, 0, 2, 0, 2, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 2, 2, 2, 1, 1}},
					MathOutil.Direction.SOUTH, MathOutil.Direction.WEST),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1},
									   {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {1, 1, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {1, 1, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 0},
									   {1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.NORTH, MathOutil.Direction.EAST, MathOutil.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
									   {1, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 2, 0, 1},
									   {0, 0, 0, 0, 0, 0, 0, 2, 2, 1, 1, 0, 0, 3, 0, 0},
									   {0, 0, 0, 0, 0, 2, 0, 2, 1, 1, 0, 0, 0, 3, 0, 0},
									   {0, 0, 0, 1, 1, 0, 0, 2, 2, 2, 0, 0, 1, 1, 0, 0},
									   {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 1, 0, 1},
									   {1, 0, 0, 0, 0, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 0, 4, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.WEST, MathOutil.Direction.EAST, MathOutil.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 2, 0, 0, 2, 1, 1, 1, 1, 1, 1},
									   {1, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 1},
									   {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 2, 1},
									   {0, 0, 0, 2, 2, 0, 0, 0, 0, 0, 3, 3, 3, 0, 2, 1},
									   {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 0, 2, 1},
									   {2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 1},
									   {1, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 1},
									   {1, 1, 1, 1, 1, 1, 2, 0, 0, 2, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.WEST, MathOutil.Direction.NORTH, MathOutil.Direction.SOUTH),
			new RoomData(new byte[][] {{1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1},
									   {1, 0, 0, 0, 4, 4, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1},
									   {1, 0, 4, 1, 4, 4, 4, 4, 4, 0, 1, 0, 0, 0, 0, 1},
									   {0, 0, 4, 4, 4, 4, 1, 4, 4, 4, 0, 0, 0, 0, 0, 0},
									   {0, 4, 4, 4, 4, 4, 4, 4, 4, 1, 4, 4, 0, 1, 0, 0},
									   {0, 0, 0, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 0, 0, 0},
									   {1, 0, 1, 0, 0, 0, 4, 4, 1, 4, 4, 4, 4, 0, 0, 1},
									   {1, 0, 0, 0, 1, 0, 0, 0, 4, 4, 4, 0, 0, 0, 0, 1},
									   {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}},
					MathOutil.Direction.WEST, MathOutil.Direction.NORTH, MathOutil.Direction.EAST),
			new RoomData(new byte[][] {{2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 0, 2, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2},
									   {0, 0, 3, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 3, 0, 0},
									   {0, 0, 3, 3, 3, 3, 3, 2, 2, 3, 3, 3, 3, 3, 0, 0},
									   {0, 0, 3, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 3, 0, 0},
									   {2, 0, 2, 0, 0, 2, 0, 0, 0, 0, 2, 0, 0, 2, 0, 2},
									   {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2},
									   {2, 2, 2, 2, 2, 2, 2, 0, 0, 2, 2, 2, 2, 2, 2, 2}},
					MathOutil.Direction.NORTH, MathOutil.Direction.SOUTH, MathOutil.Direction.WEST, MathOutil.Direction.EAST),
	};
}
