package data;

import java.util.ArrayList;
import java.util.List;


/* this represents a whole budget (as a list of items). it's our MODEL */
public class BudgetModel {

	private List<BudgetLine> budget;
	
	public BudgetModel() {
		// create some values at start
		budget = new ArrayList<BudgetLine>();
		budget.add(new BudgetLine( "Courses", "Mes depenses en courses", 130.0f));
		budget.add(new BudgetLine( "Cinema", "Mon budget cinoche", 30.0f));
		budget.add(new BudgetLine( "Loyer", "Mon loyer", 420.0f));
	}

	public List<BudgetLine> getBudget() {
		return budget;
	}

	public void setBudget(List<BudgetLine> budget) {
		this.budget = budget;
	}
			
}
