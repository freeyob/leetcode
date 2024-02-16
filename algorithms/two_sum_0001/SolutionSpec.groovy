package two_sum_0001

import spock.lang.Specification

import java.lang.reflect.Array

class SolutionSpec extends Specification {
    def "TwoSum"() {
        expect:
        result == new Solution().twoSum(nums as int[], target) as List
        where:
        nums           || target || result
        [2, 7, 11, 15] || 9      || [0, 1]
        [3, 2, 4]      || 6      || [1, 2]
    }
}
