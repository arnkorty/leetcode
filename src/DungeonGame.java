public class DungeonGame {
    public int calculateMinimumHP(int[][] dungeon) {
        if (dungeon.length == 1 && dungeon[0].length == 1){
            if (dungeon[0][0] > 0){
                return 1;
            } else {
                return -dungeon[0][0] + 1;
            }
        }
        int len = dungeon[0].length;
        int row = dungeon.length;
        int[] min = new int[len];
        min[len - 1] = -dungeon[row - 1][len - 1] + 1;
        min[len - 1] = Math.max(min[len - 1], 1);
        for (int i = len - 2; i >= 0; i--){
            min[i] = min[i + 1] - dungeon[row - 1][i];
            min[i] = Math.max(min[i], 1);
        }
        for (int i = row - 2; i >= 0; i--){
            min[len - 1] = min[len - 1] - dungeon[i][len - 1];
            min[len - 1] = Math.max(min[len - 1], 1);
            for (int j = len - 2; j >= 0; j--){
                min[j] = Math.min(min[j + 1], min[j]) - dungeon[i][j];
                min[j] = Math.max(min[j], 1);
            }
        }
        return min[0];
    }
    public static void main(String[] args) {

    }
}
