
// parte 8 ficha

import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.screen.Screen;

public class Hero {

    private int x;
    private int y;

    //construtor
    public Hero(int x, int y){
        this.x = x;
        this.y = y;
    }
    // getters
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    //setters
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }

    // funcoes move
    void moveUp(){
        this.y = this.getY() - 1;
    }
    void moveDown(){
        this.y = this.getY() + 1;
    }
    public void moveLeft(){
        this.x = this.getX() - 1;
    }
    public void moveRight(){
        this.x = this.getX() + 1;
    }

    public void draw(Screen screen) {
        screen.setCharacter(this.x,this.y, TextCharacter.fromCharacter('X')[0]);
    }
}
