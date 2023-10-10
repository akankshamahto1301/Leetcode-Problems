class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        
        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        
        int rowIndex = 0;
        int direction = 1; 
        
        for (char c : s.toCharArray()) {
            rows[rowIndex].append(c);
            if (rowIndex == 0) {
                direction = 1; 
            } else if (rowIndex == numRows - 1) {
                direction = -1;
            }
            rowIndex += direction;
        }
        
        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String input = "PAYPALISHIRING";
        int numRows = 3;
        String result = solution.convert(input, numRows);
        System.out.println(result); 
    }
}

    
