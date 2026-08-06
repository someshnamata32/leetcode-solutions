class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {

        int ans = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            int landFinish = landStartTime[i] + landDuration[i];
            for (int j = 0; j < waterStartTime.length; j++) {
                int waterTime = Math.max(landFinish, waterStartTime[j]);
                int waterFinish = waterTime + waterDuration[j];

                ans = Math.min(ans, waterFinish);
            }
        }

        for (int i = 0; i < waterStartTime.length; i++) {
            int waterFinish = waterStartTime[i] + waterDuration[i];
            for (int j = 0; j < landStartTime.length; j++) {
                int landTime = Math.max(waterFinish, landStartTime[j]);
                int landFinish = landTime + landDuration[j];

                ans = Math.min(ans, landFinish);
            }
        }
        return ans;
    }
}