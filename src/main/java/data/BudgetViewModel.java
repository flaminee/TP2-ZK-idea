package data;
import java.util.List;

import data.*;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zul.ListModel;
import org.zkoss.zul.ListModelList;
import org.zkoss.zul.SimplePieModel;

public class BudgetViewModel {

	 private BudgetModel model;	
	 private String title = "Mon budget mensuel";
	 
	 public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	private BudgetLine newLine;

	public BudgetLine getNewLine() {
		return newLine;
	}

	public void setNewLine(BudgetLine newLine) {
		this.newLine = newLine;
	}


	public BudgetViewModel() {
		 model = new BudgetModel();
		 newLine = new BudgetLine("","",0.0f);
	 }
	 	 
	// we have an accessor which adapts the real model to the zk listmodel
	public ListModel<BudgetLine> getListModel() {
		 return new ListModelList<BudgetLine>(model.getBudget());
	}
	
	// and we have another accessor which adapts the real model to the piemodel
	// (ok this is not that clean, rather make this BudgetViewModel derive from  "PieModel"	
	public SimplePieModel getPieModel() {
		 
		SimplePieModel pieModel = new SimplePieModel();
		for (int i=0; i < model.getBudget().size(); i++) {
			// convert each budgetline to a piemodel entry
			pieModel.setValue(model.getBudget().get(i).getTitle(), model.getBudget().get(i).getValue());			
		}
		return pieModel;
	 }
	 
	 @Command
	 @NotifyChange({"listModel","pieModel","newLine"})  // notifyChange specifies which should be all the zul variables that will be affected
	 // and need to be reloaded
	 // here, we add a budget line, so listModel, pieModel and newLine are affected (as we clean the line)
	 public void create(){
		 // add to the model
	      model.getBudget().add(newLine);

	     // + clean the "newLine"
	     newLine = new BudgetLine("","",0.0f);

	 }
	 
}
