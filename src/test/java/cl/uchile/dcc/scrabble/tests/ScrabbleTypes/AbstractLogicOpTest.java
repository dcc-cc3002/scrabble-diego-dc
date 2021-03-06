package cl.uchile.dcc.scrabble.tests.ScrabbleTypes;

import cl.uchile.dcc.scrabble.model.ScrabbleTypes.ISTLogicalOperationCompatible;
import cl.uchile.dcc.scrabble.model.ScrabbleTypes.ScrabbleType;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public abstract class AbstractLogicOpTest extends AbstractScrabbleTypeTests{

    protected void checkNegation(ISTLogicalOperationCompatible expected, ISTLogicalOperationCompatible actualToNegate)
    {
        ISTLogicalOperationCompatible actual = actualToNegate.negation();
        assertEquals(expected, actual,
                "Negation Failed. Expected: " + expected.STtoString() + ", Actual: " + actual.STtoString());
    }

    protected void checkConjunction(ISTLogicalOperationCompatible expected,
                                    ISTLogicalOperationCompatible scrabbleTypeLeft, ISTLogicalOperationCompatible scrabbleTypeRight)
    {
        ScrabbleType actual = scrabbleTypeLeft.conjunction(scrabbleTypeRight);
        assertEquals(expected, actual,
                "Conjunction Failed. Expected: " + expected.STtoString() + ", Actual: " + actual.STtoString());
    }

    protected void checkDisjunction(ISTLogicalOperationCompatible expected,
                                    ISTLogicalOperationCompatible scrabbleTypeLeft, ISTLogicalOperationCompatible scrabbleTypeRight)
    {
        ScrabbleType actual = scrabbleTypeLeft.disjunction(scrabbleTypeRight);
        assertEquals(expected, actual,
                "Disjunction Failed. Expected: " + expected.STtoString() + ", Actual: " + actual.STtoString());
    }

    @Test
    protected abstract void LogicOperationTests();
}
