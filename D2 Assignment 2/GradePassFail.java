class GradePassFail {
    public static void main(String[] args) {
        int subject1 = 45;
        int subject2 = 83;
        int subject3 = 50;

        int failCount = 0;

        switch (subject1 < 40 ? 1 : 0) {
		case 1: failCount++;
		}
        switch (subject2 < 40 ? 1 : 0) {
		case 1: failCount++; 
		}
        switch (subject3 < 40 ? 1 : 0) {
		case 1: failCount++;
		}

        switch (failCount) {
            case 0:
                System.out.println("Student Passed!");
                break;
            default:
                System.out.println("Student FAILED in " + failCount + " subject(s).");
        	}
    	}
}
