package testdriver;
public interface Stack
{
	/**
	**	@pre o != null
	*	@post !isEmpty()
	*	@post top() == o
	*/
	void push(Object o);
	
	/**
	*	@pre !isEmpty()
	*	@post @return == top @pre
	*/
	Object pop();
	
	/**
	*	@pre !isEmpty()
	*/
	Object top();
	
	boolean isEmpty();
        
        int size();
        Object peek();
}