import java.util.*;

class Solution {

    class Interval {
        int l, r, w, index;

        Interval(int l, int r, int w, int index) {
            this.l = l;
            this.r = r;
            this.w = w;
            this.index = index;
        }
    }

    class State {
        long score;
        List<Integer> indices;

        State(long score, List<Integer> indices) {
            this.score = score;
            this.indices = indices;
        }
    }

    State[][] dp;

    public int[] maximumWeight(List<List<Integer>> intervals) {

        int n = intervals.size();

        Interval[] arr = new Interval[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new Interval(
                intervals.get(i).get(0),
                intervals.get(i).get(1),
                intervals.get(i).get(2),
                i
            );
        }

        // Sort by starting point
        Arrays.sort(arr, (a, b) -> {
            if (a.l != b.l)
                return Integer.compare(a.l, b.l);
            return Integer.compare(a.r, b.r);
        });

        dp = new State[n + 1][5];

        State ans = solve(arr, 0, 4);

        return ans.indices.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    State solve(Interval[] arr, int i, int k) {

        if (i == arr.length || k == 0) {
            return new State(0, new ArrayList<>());
        }

        if (dp[i][k] != null) {
            return dp[i][k];
        }

        // Option 1: Don't choose current interval
        State skip = solve(arr, i + 1, k);

        // Option 2: Choose current interval
        int next = findNext(arr, i);

        State nextState = solve(arr, next, k - 1);

        List<Integer> picked = new ArrayList<>();
        picked.add(arr[i].index);
        picked.addAll(nextState.indices);

        Collections.sort(picked);

        State take = new State(
            arr[i].w + nextState.score,
            picked
        );

        dp[i][k] = better(take, skip);

        return dp[i][k];
    }

    int findNext(Interval[] arr, int i) {

        int low = i + 1;
        int high = arr.length;

        int end = arr[i].r;

        while (low < high) {

            int mid = low + (high - low) / 2;

            if (arr[mid].l > end) {
                high = mid;
            } else {
                low = mid + 1;
            }
        }

        return low;
    }

    State better(State a, State b) {

        if (a.score > b.score)
            return a;

        if (a.score < b.score)
            return b;

        // Same score → lexicographically smaller
        if (compare(a.indices, b.indices) <= 0)
            return a;

        return b;
    }

    int compare(List<Integer> a, List<Integer> b) {

        int n = Math.min(a.size(), b.size());

        for (int i = 0; i < n; i++) {

            if (!a.get(i).equals(b.get(i))) {
                return Integer.compare(a.get(i), b.get(i));
            }
        }

        return Integer.compare(a.size(), b.size());
    }
}