package exercises;


import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BracesCheckerTest {

     /**   "(){}[]"   =>  True
         * "([{}])"   =>  True
         * "(}"       =>  False
         * "[(])"     =>  False
         * "[({})](]" =>  False
      * */

    @Test
    public void testValid(){
        assertThat(BracesChecker.isValid("(){}[]")).isTrue();
        assertThat(BracesChecker.isValid("([{}])")).isTrue();
        assertThat(BracesChecker.isValid("(}")).isFalse();
        assertThat(BracesChecker.isValid("[(])")).isFalse();
        assertThat(BracesChecker.isValid("[({})](]")).isFalse();
     }
}
