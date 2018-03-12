/*
 * This file is generated by jOOQ.
*/
package com.epam.ta.reportportal.store.jooq.tables.records;

import com.epam.ta.reportportal.store.jooq.tables.JIssue;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record5;
import org.jooq.Row5;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;

/**
 * This class is generated by jOOQ.
 */
@Generated(value = { "http://www.jooq.org", "jOOQ version:3.10.4" }, comments = "This class is generated by jOOQ")
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JIssueRecord extends UpdatableRecordImpl<JIssueRecord> implements Record5<Long, Integer, String, Boolean, Boolean> {

	private static final long serialVersionUID = 1926290266;

	/**
	 * Setter for <code>public.issue.issue_id</code>.
	 */
	public void setIssueId(Long value) {
		set(0, value);
	}

	/**
	 * Getter for <code>public.issue.issue_id</code>.
	 */
	public Long getIssueId() {
		return (Long) get(0);
	}

	/**
	 * Setter for <code>public.issue.issue_type</code>.
	 */
	public void setIssueType(Integer value) {
		set(1, value);
	}

	/**
	 * Getter for <code>public.issue.issue_type</code>.
	 */
	public Integer getIssueType() {
		return (Integer) get(1);
	}

	/**
	 * Setter for <code>public.issue.issue_description</code>.
	 */
	public void setIssueDescription(String value) {
		set(2, value);
	}

	/**
	 * Getter for <code>public.issue.issue_description</code>.
	 */
	public String getIssueDescription() {
		return (String) get(2);
	}

	/**
	 * Setter for <code>public.issue.auto_analyzed</code>.
	 */
	public void setAutoAnalyzed(Boolean value) {
		set(3, value);
	}

	/**
	 * Getter for <code>public.issue.auto_analyzed</code>.
	 */
	public Boolean getAutoAnalyzed() {
		return (Boolean) get(3);
	}

	/**
	 * Setter for <code>public.issue.ignore_analyzer</code>.
	 */
	public void setIgnoreAnalyzer(Boolean value) {
		set(4, value);
	}

	/**
	 * Getter for <code>public.issue.ignore_analyzer</code>.
	 */
	public Boolean getIgnoreAnalyzer() {
		return (Boolean) get(4);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Record1<Long> key() {
		return (Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record5 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, Integer, String, Boolean, Boolean> fieldsRow() {
		return (Row5) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Row5<Long, Integer, String, Boolean, Boolean> valuesRow() {
		return (Row5) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Long> field1() {
		return JIssue.ISSUE.ISSUE_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Integer> field2() {
		return JIssue.ISSUE.ISSUE_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<String> field3() {
		return JIssue.ISSUE.ISSUE_DESCRIPTION;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field4() {
		return JIssue.ISSUE.AUTO_ANALYZED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Field<Boolean> field5() {
		return JIssue.ISSUE.IGNORE_ANALYZER;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long component1() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer component2() {
		return getIssueType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String component3() {
		return getIssueDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean component4() {
		return getAutoAnalyzed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean component5() {
		return getIgnoreAnalyzer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Long value1() {
		return getIssueId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Integer value2() {
		return getIssueType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public String value3() {
		return getIssueDescription();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value4() {
		return getAutoAnalyzed();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Boolean value5() {
		return getIgnoreAnalyzer();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueRecord value1(Long value) {
		setIssueId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueRecord value2(Integer value) {
		setIssueType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueRecord value3(String value) {
		setIssueDescription(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueRecord value4(Boolean value) {
		setAutoAnalyzed(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueRecord value5(Boolean value) {
		setIgnoreAnalyzer(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public JIssueRecord values(Long value1, Integer value2, String value3, Boolean value4, Boolean value5) {
		value1(value1);
		value2(value2);
		value3(value3);
		value4(value4);
		value5(value5);
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached JIssueRecord
	 */
	public JIssueRecord() {
		super(JIssue.ISSUE);
	}

	/**
	 * Create a detached, initialised JIssueRecord
	 */
	public JIssueRecord(Long issueId, Integer issueType, String issueDescription, Boolean autoAnalyzed, Boolean ignoreAnalyzer) {
		super(JIssue.ISSUE);

		set(0, issueId);
		set(1, issueType);
		set(2, issueDescription);
		set(3, autoAnalyzed);
		set(4, ignoreAnalyzer);
	}
}