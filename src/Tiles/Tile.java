package Tiles;

import Board.Point;

public abstract class Tile {
    protected char tile;
    protected Point position;

    public Tile(char tile, Point position) {
        this.tile = tile;
        this.position = position;
    }
}
