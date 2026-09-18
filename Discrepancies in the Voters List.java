import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n1 + n2 + n3; i++) {
            int x = sc.nextInt();
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : map.keySet()) {
            if (map.get(x) >= 2) {
                ans.add(x);
            }
        }

        Collections.sort(ans);

        System.out.println(ans.size());

        for (int x : ans) {
            System.out.println(x);
        }
    }
}
