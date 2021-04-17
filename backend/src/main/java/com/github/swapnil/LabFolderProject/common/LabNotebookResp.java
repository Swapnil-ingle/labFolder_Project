package com.github.swapnil.LabFolderProject.common;

/**
 * Generic object used to envelope all the response sent out from any controllers
 * 
 * @author Swapnil I.
 *
 * @param <T> the body type
 */
public class LabNotebookResp<T> {
	private T responseBody;
	
	private Exception exception;

	public LabNotebookResp<T> wrap(T responseDTO) {
		this.responseBody = responseDTO;
		return this;
	}
	
	public LabNotebookResp<T> error(Exception e) {
		this.exception = e;
		return this;
	}

	public T getResponseBody() {
		return responseBody;
	}

	public void setResponseBody(T responseBody) {
		this.responseBody = responseBody;
	}

	public Exception getException() {
		return exception;
	}

	public void setException(Exception exception) {
		this.exception = exception;
	}
}
