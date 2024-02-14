package excel_sheet_column_number_0171

import spock.lang.Specification

class SolutionSpec extends Specification {
    def "TitleToNumber"() {
        expect:
        titleNumber == new Solution().titleToNumber(title)
        where:
        titleNumber || title
        1           || "A"
        2           || "B"
        28          || "AB"
        731         || "ABC" // 1 * 26 * 26 + 2 * 26 + 3 = (1 * 26 + 2) * 26 + 3
        701         || "ZY"
    }
}
