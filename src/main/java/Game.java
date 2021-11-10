import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import javax.swing.text.Position;
import java.io.IOException;

public class Game{

    private static Screen screen;
    private static Hero hero = new Hero(10, 10);


    // construtor de game
    public Game() {
        try {

            //Terminal terminal = new DefaultTerminalFactory().createTerminal();
            TerminalSize terminalSize = new TerminalSize(40, 20);
            DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory().setInitialTerminalSize(terminalSize);
            Terminal terminal = terminalFactory.createTerminal();

            screen = new TerminalScreen(terminal);
            screen.setCursorPosition(null); // we don't need acursor
            screen.startScreen(); // screens must bestarted
            screen.doResizeIfNecessary(); // resize screenif necessary


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void draw() throws IOException {
        screen.clear();
        screen.setCharacter(hero.getY(), hero.getY(), TextCharacter.fromCharacter('X')[0]);
        screen.refresh();
        hero.draw(screen);
    }

    private static void processKey(KeyStroke key) {

        if(key.getKeyType() == KeyType.ArrowUp)
           hero.moveUp();
        else if (key.getKeyType() == KeyType.ArrowDown)
           hero.moveDown();
        else if (key.getKeyType() == KeyType.ArrowLeft)
           hero.moveLeft();
        else
          hero.moveRight();

    }

    public static void run() throws IOException {

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



}




