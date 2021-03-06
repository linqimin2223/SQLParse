package cn.edu.fjut.bean;

public class ExerciseSubmission {

	private String id, submitted_answer, ref_answer, exercise_id;
	private boolean is_correct;
	
	

	

	public boolean is_correct() {
		return is_correct;
	}

	public void setIs_correct(boolean is_correct) {
		this.is_correct = is_correct;
	}

	public ExerciseSubmission(String id, String submitted_answer, String ref_answer, String exercise_id,
			boolean is_correct) {
		super();
		this.id = id;
		this.submitted_answer = submitted_answer;
		this.ref_answer = ref_answer;
		this.exercise_id = exercise_id;
		this.is_correct = is_correct;
	}

	public ExerciseSubmission(String id, String submitted_answer, String ref_answer, String exercise_id) {
		super();
		this.id = id;
		submitted_answer = submitted_answer.trim();
		ref_answer = ref_answer.trim();
		if(submitted_answer.endsWith(";"))
			submitted_answer = submitted_answer.substring(0, submitted_answer.length() -1);
		this.submitted_answer = submitted_answer;
		if( ref_answer.endsWith(";"))
			ref_answer = ref_answer.substring(0, ref_answer.length() -1);		
		this.ref_answer = ref_answer;
		this.exercise_id = exercise_id;
	}

	public String getExercise_id() {
		return exercise_id;
	}

	public String getId() {
		return id;
	}

	public String getSubmitted_answer() {
		return submitted_answer;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		//return id + "   " + submitted_answer + "  " + ref_answer + "  " + exercise_id + "  " + is_correct;
		return id + "   " +  exercise_id + "  " + is_correct;
	}

	public String getRef_answer() {
		return ref_answer;
	}
	
	
	
}
