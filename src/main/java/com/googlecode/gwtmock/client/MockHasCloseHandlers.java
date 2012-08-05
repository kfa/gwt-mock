/*
 * Copyright 2012 Katharina Fahnenbruck
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.googlecode.gwtmock.client;

import com.google.gwt.event.logical.shared.CloseEvent;
import com.google.gwt.event.logical.shared.CloseHandler;
import com.google.gwt.event.logical.shared.HasCloseHandlers;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * @author Katharina Fahnenbruck
 * 
 */
public class MockHasCloseHandlers<T> extends MockHasHandlers implements HasCloseHandlers<T> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.gwt.event.logical.shared.HasCloseHandlers#addCloseHandler(
	 * com.google.gwt.event.logical.shared.CloseHandler)
	 */
	@Override
	public HandlerRegistration addCloseHandler(CloseHandler<T> handler) {
		return eventBus.addHandler(CloseEvent.getType(), handler);
	}

}
