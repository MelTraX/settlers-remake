/*******************************************************************************
 * Copyright (c) 2015
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"),
 * to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense,
 * and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER
 * DEALINGS IN THE SOFTWARE.
 *******************************************************************************/
package jsettlers.graphics.utils;

import jsettlers.common.images.ImageLink;
import jsettlers.common.images.OriginalImageLink;
import jsettlers.graphics.action.Action;

/**
 * This is a button, consisting of images in the given file.
 * <p>
 * The first 3 images after the start index are images for a small, medium and big button.
 *
 * @author michael
 */
public class Button extends UIPanel implements UIButton {
	/**
	 * How many detail steps there are usually
	 */
	private boolean active = false;
	private Action action;
	private final String description;
	private OriginalImageLink image;
	private final OriginalImageLink activeImage;

	public Button(OriginalImageLink image) {
		this.image = image;
		activeImage = image;
		description = "";
	}

	public Button(Action action, OriginalImageLink image, OriginalImageLink active, String description) {
		this.action = action;
		this.image = image;
		activeImage = active;
		this.description = description;
	}

	public void setImage(OriginalImageLink image) {
		this.image = image;
	}

	@Override
	protected ImageLink getBackgroundImage() {
		return active ? activeImage : image;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public void setAction(Action action) {
		this.action = action;
	}

	@Override
	public Action getAction() {
		return action;
	}

	@Override
	public Action getAction(float relativex, float relativey) {
		return getAction();
	}

	@Override
	public String getDescription(float relativex, float relativey) {
		return description;
	}
}
