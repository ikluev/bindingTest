package com.test.mopub_ios_sdk.protocol;


import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.IsOptional;
import com.intel.inde.moe.natj.objc.ann.ObjCProtocolName;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.test.mopub_ios_sdk.MPAdConfiguration;
import ios.corelocation.CLLocation;
import ios.uikit.UIView;
import ios.uikit.UIViewController;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCProtocolName("MRControllerDelegate")
public interface MRControllerDelegate {
	@Generated
	@Selector("adConfiguration")
	MPAdConfiguration adConfiguration();

	@Generated
	@IsOptional
	@Selector("adDidClose:")
	default void adDidClose(UIView adView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("adDidFailToLoad:")
	default void adDidFailToLoad(UIView adView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@IsOptional
	@Selector("adDidLoad:")
	default void adDidLoad(UIView adView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("adUnitId")
	String adUnitId();

	@Generated
	@IsOptional
	@Selector("adWillClose:")
	default void adWillClose(UIView adView) {
		throw new java.lang.UnsupportedOperationException();
	}

	@Generated
	@Selector("appShouldResumeFromAd:")
	void appShouldResumeFromAd(UIView adView);

	@Generated
	@Selector("appShouldSuspendForAd:")
	void appShouldSuspendForAd(UIView adView);

	@Generated
	@Selector("location")
	CLLocation location();

	@Generated
	@Selector("viewControllerForPresentingModalView")
	UIViewController viewControllerForPresentingModalView();
}