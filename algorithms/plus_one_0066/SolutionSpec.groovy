package plus_one_0066

import spock.lang.Specification

class SolutionSpec extends Specification {
    def "PlusOne"() {
        expect:
        numPlusOne as int[] == new Solution().plusOne(num as int[])
        where:
        numPlusOne   || num
        [1, 1, 1]    || [1, 1, 0]
        [1, 0, 0, 0] || [9, 9, 9]
        [1, 0]       || [9]
        [1]          || [0]
    }
}
