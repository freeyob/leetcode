package excel_sheet_column_number_0171

class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var num = 0
        columnTitle.forEachIndexed { index, c ->
            num = if (index == columnTitle.lastIndex) {
                ((c.code - 64) + num)
            } else {
                ((c.code - 64) + num) * 26
            }
        }
        return num
    }
}
