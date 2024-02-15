package power_of_three_326

import spock.lang.Specification

class SolutionSpec extends Specification {
    def "IsPowerOfThree"() {
        expect:
        iSPower == new Solution().isPowerOfThree(num)
        where:
        num || iSPower
        1   || true
        2   || false
        3   || true
        9   || true
        27  || true
        0   || false
        -1  || false
    }
}
