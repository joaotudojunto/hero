
/*
import java.io.IOException;

public class teste {


    import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextCharacter;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

    public class Game {
        private static int y;
        private static int x;



        public Game() throws IOException {
            try {
                Terminal terminal = null;
                terminal = new DefaultTerminalFactory().createTerminal();
                Screen screen = new TerminalScreen(terminal);
                screen.setCursorPosition(null); // we don't need a cursor
                screen.startScreen();           // screens must be started
                TerminalSize terminalSize = screen.doResizeIfNecessary();// resize screen if necessary

            } catch (IOException e){
                e.printStackTrace();
            }
            Game.run();
        }

        public static void draw() throws IOException {
            Screen screen = null;
            screen.clear();
            screen.setCharacter(x, y, TextCharacter.fromCharacter('X')[0]);
            screen.refresh();
        }

        public static void processKey(KeyStroke key) {
            System.out.println(key);
        }

        public static void run() throws IOException {
            draw();
            readInput();
            processKey(key);

        }


        public static void readInput() throws IOException {
            TerminalScreen screen = null;
            KeyStroke key = screen.readInput();

        }


    }


*/
