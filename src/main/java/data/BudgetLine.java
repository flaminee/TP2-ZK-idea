package data;

/* this represents an item of the model */
public class BudgetLine {

	String description;
	String title;
	float value;

	
	public BudgetLine(String i, String d,  float v) {
		this.description = d;
		this.title =i;
		this.value = v;
	}
	
	
	public BudgetLine() {
		title = "courses";
		description = "montant hebdo des courses";
		value = 130.0f;
		
	}

	
	public float getValue() {
		return value;
	}

	public void setValue(float valeur) {
		this.value = valeur;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String intitule) {
		this.title = intitule;
	}

	public String getDescription() {
		  return description;
	}
	
	public void setDescription(String d) {
		  this.description = d;
	}	
}
