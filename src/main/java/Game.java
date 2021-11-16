import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;


import java.io.IOException;

public class Game{

    private static Screen screen;
    private static Hero hero;
    private static int y,x;
    static Arena arena = new Arena(40,20);
    public int height, width;




    // construtor de game
    public Game() {
        try {

            //Terminal terminal = new DefaultTerminalFactory().createTerminal();
            TerminalSize terminalSize = new TerminalSize(40, 20);
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();

            hero = new Hero(10, 10);

            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need acursor
            screen.startScreen(); // screens must bestarted
            screen.doResizeIfNecessary(); // resize screenif necessary


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void draw() throws IOException {
        screen.clear();
        hero.draw(screen);
        screen.refresh();

    }


    void processKey(KeyStroke key) {

        if(key.getKeyType() == KeyType.ArrowUp)
            moveHero(hero.moveUp());
        else if (key.getKeyType() == KeyType.ArrowDown)
            moveHero(hero.moveDown());
        else if (key.getKeyType() == KeyType.ArrowLeft)
            moveHero(hero.moveLeft());
        else
            moveHero(hero.moveRight());
    }



    public void run() throws IOException {

        boolean go = true;
        while(go) {
            draw();
            try {
                KeyStroke key = screen.readInput();
                processKey(key);
                if (key.getKeyType() == KeyType.Character && key.getCharacter() == 'q')
                    go = false;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        screen.close();
        System.out.println("Process finished with exit code 0");

    }

    public boolean canHeroMove(Position position) {
        if (position.getX() >= 0 && position.getX() <= width && position.getY() >= 0 && position.getY() <= height){
            return true;
    }
        return false;
    }

/*
    public static boolean canHeroMove(Position position){
        if(position.getX() >= 0 && position.getX() <= arena.width && position.getY() >= 0 && position.getY() <= arena.height) return false;
        return true;
    }
*/

    private void moveHero(Position position) {
        if(canHeroMove(position));
        //System.out.println(position.getX());
        hero.setPosition(position);
    }



}




