//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//import java.util.Scanner;
//
//public class Felipe {
//
//    public static class Task {
//
//        int pioridad;
//        int duracion;
//
//        Task(int pioridad, int duracion) {
//            this.pioridad = pioridad;
//            this.duracion = duracion;
//        }
//
//
//        public int compareTo(Task other) {
//
//            if (this.pioridad != other.pioridad) {
//                return other.pioridad;
//            }
//        }
//
//
//        public static void main(String[] args) {
//
//            Scanner scanner = new Scanner(System.in);
//
//            while (true) {
//                int n = scanner.nextInt();
//
//
//                if (n == 0) {
//                    break;
//                }
//
//
//                List<Task> tasks = new ArrayList<>();
//
//                for (int i = 0; i < n; i++) {
//                    int pioridad = scanner.nextInt();
//                    int duracion = scanner.nextInt();
//                    tasks.add(new Task(pioridad, duracion));
//                }
//
//
//                Collections.sort(tasks);
//
//                for (tasks task : tasks) {
//                    System.out.println(task);
//                }
//
//
//            }
//        }
//    }
//}
