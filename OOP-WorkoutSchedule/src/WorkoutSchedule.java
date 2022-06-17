public class WorkoutSchedule {

    private int sidePlank;
    private int squat;
    private int sitUp;
    private int pushUp;

    public WorkoutSchedule(int sidePlank, int squat, int sitUp, int pushUp) {

        this.sidePlank = sidePlank;
        this.squat = squat;
        this.sitUp = sitUp;
        this.pushUp = pushUp;
    }


    public int getSidePlank() {
        return sidePlank;
    }


    public int getSquat() {
        return squat;
    }


    public int getSitUp() {
        return sitUp;
    }


    public int getPushUp() {
        return pushUp;
    }


    protected void workOutSidePlank(int number) {

        if (sidePlank > 0) {
            sidePlank -= number;
            System.out.println(number + " Side plank is complete.");
            if (sidePlank < 0) {
                sidePlank = 0;
                System.out.println("Side plank workout completed.");

            } else System.out.println("Remaining Side Plank Reps = " + sidePlank);


        }

    }

    protected void workOutSquat(int number) {

        if (squat > 0) {
            squat -= number;
            System.out.println(number + " Squat is complete.");
            if (squat < 0) {
                squat = 0;
                System.out.println("Squat workout completed.");

            } else System.out.println("Remaining Squat Reps = " + squat);


        }
    }

    protected void workOutSitUp(int number) {

        if (sitUp > 0) {
            sitUp -= number;
            System.out.println(number + " SitUp is complete.");
            if (sitUp < 0) {
                sitUp = 0;
                System.out.println("SitUp workout completed.");

            } else System.out.println("Remaining SitUp Reps = " + sitUp);


        }
    }

    protected void workOutPushUp(int number) {

        if (pushUp > 0) {
            pushUp -= number;
            System.out.println(number + " PushUp is complete.");
            if (pushUp < 0) {
                pushUp = 0;
                System.out.println("PushUp workout completed.");

            } else System.out.println("Remaining PushUp Reps = " + pushUp);


        }
    }

    public boolean isExerciseFinished() {

        if ((sidePlank == 0) && (squat == 0) && (sitUp == 0) && (pushUp == 0)) {
            System.out.println("\n\n************************************");
            System.out.println("Congratulations! Workout complete.");
            System.out.println("************************************\n");
            return true;
        } else {
            return false;
        }


    }


    protected void doExercise(String exercise, int count) {
        switch (exercise) {
            case "side plank":
                workOutSidePlank(count);
                break;

            case "squat":
                workOutSquat(count);
                break;

            case "sit up":
                workOutSitUp(count);
                break;

            case "push up":
                workOutPushUp(count);
                break;

        }


    }

}

