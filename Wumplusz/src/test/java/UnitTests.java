import menu.Menu;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import player.Player;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(MockitoExtension.class)
public class UnitTests {
    @Mock
    private Menu menu;
    @Mock
    private Player player;
    @Test
    public void testMainMenu() {
        // Először létrehozunk egy szimulált bemeneti szkennert a teszt számára
        FakeScanner name = new FakeScanner("John");
        //String name = "John"; // A "John" a teszt szimulált felhasználói bemenete

        // Módosítjuk a Menu osztályt, hogy a FakeScanner-t használja a bemenet olvasásához


        // Teszteljük a mainMenu metódust
        menu.mainMenu();
        player.getPlayerName();

        // Ellenőrizzük, hogy a játékos neve beállításra került-e
        assertEquals(name,player.getPlayerName());
    }

    private class FakeScanner {

        public FakeScanner(String name) {

        }
    }
}
