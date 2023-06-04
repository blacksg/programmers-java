package level1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class DayIn2016Test {
    
    private DayIn2016 problem = new DayIn2016();
    
    @Test
    void test1() {
        int month = 11;
        int day = 12;
        Assertions.assertThat(problem.solution(month, day)).isEqualTo("SAT");
    }
    
    @Test
    void test2() {
        int month = 5;
        int day = 24;
        Assertions.assertThat(problem.solution(month, day)).isEqualTo("TUE");
    }
    
    @Test
    void test3() {
        int month = 2;
        int day = 1;
        Assertions.assertThat(problem.solution(month, day)).isEqualTo("MON");
    }
}