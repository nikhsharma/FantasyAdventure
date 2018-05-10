import healingTools.HealingTool;
import healingTools.HealingToolType;
import org.junit.Before;
import org.junit.Test;
import players.Cleric;

import static org.junit.Assert.assertEquals;

public class ClericTest {

    Cleric cleric;
    HealingTool healingTool;

    @Before
    public void before() throws Exception {
        healingTool = new HealingTool(HealingToolType.SMALLPOTION);
        cleric = new Cleric("Jim", 10, healingTool );
    }

    @Test
    public void hasName() {
        assertEquals("Jim", cleric.getName());
    }

    @Test
    public void hasCurrentHealth() {
        assertEquals(10, cleric.getCurrentHealth());
    }

    @Test
    public void hasMaxHealth() {
        assertEquals(10, cleric.getMaxHealth());
    }

    @Test
    public void hasHealingTool(){
        assertEquals(healingTool, cleric.getHealingTool());
    }
}
