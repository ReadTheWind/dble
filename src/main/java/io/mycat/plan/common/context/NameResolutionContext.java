package io.mycat.plan.common.context;

import io.mycat.plan.PlanNode;


public class NameResolutionContext {
	/*
	 * The name resolution context to search in when an Item cannot be resolved
	 * in this context (the context of an outer select)
	 */
	NameResolutionContext outer_context;

	private PlanNode planNode;

	private boolean findInSelect = false;

	private boolean selectFirst = false;

	public NameResolutionContext getOuter_context() {
		return outer_context;
	}

	public void setOuter_context(NameResolutionContext outer_context) {
		this.outer_context = outer_context;
	}

	public PlanNode getPlanNode() {
		return planNode;
	}

	public void setPlanNode(PlanNode pn) {
		this.planNode = pn;
	}

	public boolean isFindInSelect() {
		return findInSelect;
	}

	public void setFindInSelect(boolean findInSelect) {
		this.findInSelect = findInSelect;
	}

	public boolean isSelectFirst() {
		return selectFirst;
	}

	public void setSelectFirst(boolean selectFirst) {
		this.selectFirst = selectFirst;
	}

}