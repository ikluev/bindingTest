package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.NSObject;
import ios.foundation.NSArray;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPRewardedVideo extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPRewardedVideo(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPRewardedVideo alloc();

	@Generated
	@Selector("hasAdAvailableForAdUnitID:")
	public static native boolean hasAdAvailableForAdUnitID(String adUnitID);

	@Generated
	@Selector("init")
	public native MPRewardedVideo init();

	@Generated
	@Selector("loadRewardedVideoAdWithAdUnitID:withMediationSettings:")
	public static native void loadRewardedVideoAdWithAdUnitIDWithMediationSettings(
			String adUnitID, NSArray mediationSettings);

	@Generated
	@Selector("presentRewardedVideoAdForAdUnitID:fromViewController:")
	public static native void presentRewardedVideoAdForAdUnitIDFromViewController(
			String adUnitID, UIViewController viewController);
}