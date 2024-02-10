package multiply_strings_0043

import spock.lang.Specification

class SolutionSpec extends Specification {
    def "Multiply"() {
        expect:
        product == new Solution().multiply(num1, num2)
        where:
        product      || num1     || num2
        '1'          || '1'      || '1'
        '121'        || '11'     || '11'
        '56088'      || '123'    || '456'
        '0'          || '1'      || '0'
        '2469108642' || '111111' || '22222'
        "0"          || "9133"   || "0"
    }

    def "Sum"() {
        expect:
        sum == new Solution().sum(num1, num2)
        where:
        sum     || num1    || num2
        "75488" || "66600" || "8888"
    }
}
