
class Solution {
  public int[] intersect(int[] nums1, int[] nums2) {
    if (nums1.length > nums2.length) {
      return intersect(nums2, nums1);
    }  

    List<Integer> a = new ArrayList<>();
    Map<Integer, Integer> map = new HashMap<>();

    for (final int n : nums1)
      map.put(n, map.getOrDefault(n, 0) + 1);

    for (final int n : nums2)
      if (map.containsKey(n) && map.get(n) > 0) {
        a.add(n);
        map.put(n, map.get(n) - 1);
      }

    return a.stream().mapToInt(Integer::intValue).toArray();
  }
}