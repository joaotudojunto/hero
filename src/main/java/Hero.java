
// parte 8 ficha
import com.googlecode.lanterna.*;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import java.io.IOException;


public class Hero {

    private Position position;


    //construtor
    public Hero(int x, int y){
        position = new Position(x,y);
    }

    // getters
    public Position getPosition(){
        return position;
    }
    //setters
    public void setPosition(Position position) {
        this.position = position;
    }

    // funcoes move
    public Position moveUp(){
        return new Position(position.getX(), position.getY() - 1);
    }
    public Position moveDown(){
        return new Position(position.getX(), position.getY() + 1);
    }
    public Position moveLeft(){
        return new Position(position.getX() -1, position.getY());
    }
    public Position moveRight(){
        return new Position(position.getX() +1, position.getY());
    }


    public void draw(TextGraphics screen) {
        screen.setForegroundColor(TextColor.Factory.fromString("#FFFF33"));
        screen.enableModifiers(SGR.BOLD);
        screen.putString(new TerminalPosition(position.getX(), position.getY()),"X");

    }



}
