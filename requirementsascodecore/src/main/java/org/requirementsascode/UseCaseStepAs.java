package org.requirementsascode;

/**
 * The part of the step that contains a reference to the actors
 * that are allowed to trigger a system reaction for this step.
 * 
 * @author b_muth
 *
 **/
public class UseCaseStepAs{
	private Actor[] actors;
	
	public UseCaseStepAs(UseCaseStep useCaseStep, Actor... actors) {
		this.actors = actors;
	}
	
	/**
	 * Returns the actors that determine which user groups can 
	 * cause the system to react to the event of this step.  
	 * 
	 * @return the actors
	 */
	public Actor[] actors() {
		return actors;
	}
}