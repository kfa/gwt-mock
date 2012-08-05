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

import com.google.gwt.event.dom.client.DragEvent;
import com.google.gwt.event.dom.client.DragHandler;
import com.google.gwt.event.dom.client.HasDragHandlers;
import com.google.gwt.event.shared.HandlerRegistration;

/**
 * @author Katharina Fahnenbruck
 * 
 */
public class MockHasDragHandlers extends MockHasHandlers implements HasDragHandlers {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.google.gwt.event.dom.client.HasDragHandlers#addDragHandler(com.google
	 * .gwt.event.dom.client.DragHandler)
	 */
	@Override
	public HandlerRegistration addDragHandler(DragHandler handler) {
		return eventBus.addHandler(DragEvent.getType(), handler);
	}
}
