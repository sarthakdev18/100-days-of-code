class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> score = new ArrayDeque<>();

        for(String op : operations) {
            switch(op) {
            case "+":
              int lastScore = score.pop();
              int secondLastScore = score.peek();
              score.push(lastScore);
              score.push(lastScore + secondLastScore);
              break;

            case "D":
              score.push(score.peek() * 2);
              break;

            case "C":
              score.pop();
              break;

            default:
              score.push(Integer.parseInt(op));
            }
        }

        return score.stream().mapToInt(Integer::intValue).sum();
    }
}