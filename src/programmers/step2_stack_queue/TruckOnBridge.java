package programmers.step2_stack_queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TruckOnBridge {
    private static final int ZERO = 0;
    private static final int ONE = 1;

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        Deque<Truck> waitingQueue = new ArrayDeque<>();
        Deque<Truck> movingQueue = new ArrayDeque<>();
        int answer = ZERO;
        for (int truckWeight : truck_weights) {
            waitingQueue.add(new Truck(truckWeight));
        }
        while (!waitingQueue.isEmpty() || !movingQueue.isEmpty()) {
            answer++;
            if (movingQueue.isEmpty()) {
                movingQueue.add(waitingQueue.poll());
                continue;
            }
            movingQueue.forEach(Truck::move);
            Truck firstMovingTruck = movingQueue.peek();
            if (firstMovingTruck.index > bridge_length) {
                movingQueue.poll();
            }
            int movingTruckCounts = movingQueue.size();
            if (!waitingQueue.isEmpty() && movingTruckCounts < bridge_length) {
                int movingTruckWeightSum = movingQueue.stream()
                        .mapToInt(truck -> truck.weight)
                        .sum();
                Truck firstWaitingTruck = waitingQueue.peek();
                if (movingTruckWeightSum + firstWaitingTruck.weight <= weight) {
                    firstWaitingTruck = waitingQueue.poll();
                    movingQueue.add(firstWaitingTruck);
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(2, 10, new int[]{7, 4, 5, 6}));
        System.out.println(solution(100, 100, new int[]{10}));
        System.out.println(solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
        System.out.println(solution(1, 1, new int[]{1}));
    }

    static class Truck {

        private final int weight;
        private int index;

        public Truck(int weight) {
            this.index = ONE;
            this.weight = weight;
        }

        public void move() {
            index++;
        }
    }
}
