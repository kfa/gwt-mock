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

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.HasChangeHandlers;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * @author Katharina Fahnenbruck
 * 
 */
public class MockHasChangeHandlers extends MockHasHandlers implements HasChangeHandlers {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.gwt.event.dom.client.HasChangeHandlers#addChangeHandler(com
	 * .google.gwt.event.dom.client.ChangeHandler)
	 */
	@Override
	public HandlerRegistration addChangeHandler(ChangeHandler handler) {
		return eventBus.addHandler(ChangeEvent.getType(), handler);
	}

}
