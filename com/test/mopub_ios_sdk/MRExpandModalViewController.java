package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.protocol.MPClosableViewDelegate;
import com.test.mopub_ios_sdk.protocol.MPForceableOrientationProtocol;
import ios.foundation.NSBundle;
import ios.foundation.NSCoder;
import ios.uikit.UIViewController;
import ios.uikit.UIWindow;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRExpandModalViewController extends UIViewController implements
		MPClosableViewDelegate, MPForceableOrientationProtocol {
	static {
		NatJ.register();
	}

	@Generated
	protected MRExpandModalViewController(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRExpandModalViewController alloc();

	@Generated
	@IsOptional
	@Selector("closableView:didMoveToWindow:")
	public native void closableViewDidMoveToWindow(MPClosableView closableView,
			UIWindow window);

	@Generated
	@Selector("closeButtonPressed:")
	public native void closeButtonPressed(MPClosableView closableView);

	@Generated
	@Selector("hideStatusBar")
	public native void hideStatusBar();

	@Generated
	@Selector("init")
	public native MRExpandModalViewController init();

	@Generated
	@Selector("initWithCoder:")
	public native MRExpandModalViewController initWithCoder(NSCoder aDecoder);

	@Generated
	@Selector("initWithNibName:bundle:")
	public native MRExpandModalViewController initWithNibNameBundle(
			String nibNameOrNil, NSBundle nibBundleOrNil);

	@Generated
	@Selector("initWithOrientationMask:")
	public native MRExpandModalViewController initWithOrientationMask(
			@NUInt long orientationMask);

	@Generated
	@Selector("restoreStatusBarVisibility")
	public native void restoreStatusBarVisibility();

	@Generated
	@Selector("setSupportedOrientationMask:")
	public native void setSupportedOrientationMask(
			@NUInt long supportedOrientationMask);
}