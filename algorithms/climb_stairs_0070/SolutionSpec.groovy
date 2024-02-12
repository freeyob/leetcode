package climb_stairs_0070

import spock.lang.Specification

class SolutionSpec extends Specification {
    def "ClimbStairs"() {
        expect:
        waysNum == new Solution().climbStairs(n)
        where:
        waysNum || n
        1       || 1
        2       || 2
        3       || 3
        5       || 4
    }
}
