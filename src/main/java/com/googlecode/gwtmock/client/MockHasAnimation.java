package com.googlecode.gwtmock.client;

import com.google.gwt.user.client.ui.HasAnimation;

public class MockHasAnimation implements HasAnimation{

	protected boolean enable;
	
	@Override
	public boolean isAnimationEnabled() {
		return enable;
	}

	@Override
	public void setAnimationEnabled(boolean enable) {
		this.enable = enable;
		
	}

}
