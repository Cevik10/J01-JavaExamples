import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        WorkoutSchedule training;
        String exercise;
        int sidePlank, squat, sitUp, pushUp;


        System.out.println("Create your workout schedule;\n");
        System.out.println("*****************************");

        while (true) {
            System.out.print("Side Plank: ");
            sidePlank = scanner.nextInt();
            if (sidePlank >= 0) break;
            else System.out.println("Enter a positive value!\n");
        }
        while (true) {
            System.out.print("Squat: ");
            squat = scanner.nextInt();
            if (squat >= 0) break;
            else System.out.println("Enter a positive value!\n");
        }
        while (true) {
            System.out.print("SitUp: ");
            sitUp = scanner.nextInt();
            if (sitUp >= 0) break;
            else System.out.println("Enter a positive value!\n");
        }
        while (true) {
            System.out.print("PushUp :");
            pushUp = scanner.nextInt();
            scanner.nextLine();
            if (pushUp >= 0) break;
            else System.out.println("Enter a positive value!\n");
        }


        System.out.println("*****************************\n");

        training = new WorkoutSchedule(sidePlank, squat, sitUp, pushUp);


        System.out.println("Training starts now!\n");


        while (!training.isExerciseFinished()) {
            System.out.println("____________________________________________________");
            System.out.print("Exercise --> ");
            if (training.getSidePlank() > 0) {
                System.out.print("|side plank| ");
            }
            if (training.getSquat() > 0) {
                System.out.print("|squat| ");
            }
            if (training.getSitUp() > 0) {
                System.out.print("|sit up| ");
            }
            if (training.getPushUp() > 0) {
                System.out.println("|push up| ");
            }

            while (true) {

                System.out.print("\nChose your exercise: ");
                exercise = scanner.nextLine();
                if (exercise.equals("side plank") || exercise.equals("squat") || exercise.equals("sit up") || exercise.equals("push up"))
                    break;
                else System.out.println("Please enter a valid exercise.\n");

            }

            System.out.print("Reps:");
            int count = scanner.nextInt();
            scanner.nextLine();

            training.doExercise(exercise, count);
        }


    }


}
