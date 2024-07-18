import org.junit.jupiter.api.Test;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class StringFunifierTest {

    @Test
    void getFunnyString() {

        String BoringString ="abbccCDdBCCcc";
        String expect="a(cbb)ac(C)cD(CCBd)D(cc)";
        List<Integer>startIndexes= Arrays.asList(1,5,7,11);
        List<Integer>endIndexes=Arrays.asList(3,5,10,12);
        StringFunifier funifier = new StringFunifier(BoringString, startIndexes, endIndexes);
        String actual = funifier.getFunnyString();
        assertEquals(expect,actual);





    }


}