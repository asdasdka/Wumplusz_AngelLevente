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
        FakeScanner name = new FakeScanner("John");

        menu.mainMenu();
        player.getPlayerName();

        assertEquals(name,player.getPlayerName());
    }

    private class FakeScanner {

        public FakeScanner(String name) {

        }
    }
}
