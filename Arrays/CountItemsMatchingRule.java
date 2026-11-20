package Arrays;

public class CountItemsMatchingRule {
    public int countMatches(String[][] items, String ruleKey, String ruleValue) {
        int count = 0;
        for (String[] item : items) {
            if ((ruleKey.equals("type") && item[0].equals(ruleValue)) ||
                (ruleKey.equals("color") && item[1].equals(ruleValue)) ||
                (ruleKey.equals("name") && item[2].equals(ruleValue))) {
                count++;
            }
        }
        return count;
    }
}
