package com.intel.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.mopub_ios_sdk.MPClosableView;
import ios.uikit.UIWindow;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MPClosableViewDelegate")
public interface MPClosableViewDelegate {
	@Generated
	@IsOptional
	@Selector("closableView:didMoveToWindow:")
	default void closableViewDidMoveToWindow(MPClosableView closableView,
			UIWindow window) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("closeButtonPressed:")
	void closeButtonPressed(MPClosableView closableView);
}