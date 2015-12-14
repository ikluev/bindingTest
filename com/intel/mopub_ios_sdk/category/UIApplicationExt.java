package com.intel.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
import com.intel.inde.moe.natj.general.ann.NUInt;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIApplication;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(UIApplication.class)
public final class UIApplicationExt {
	static {
		NatJ.register();
	}

	@Generated
	private UIApplicationExt() {
	}

	@Generated
	@Selector("mp_doesOrientation:matchOrientationMask:")
	public static native boolean mp_doesOrientationMatchOrientationMask(
			UIApplication _object, @NInt long orientation,
			@NUInt long orientationMask);

	@Generated
	@Selector("mp_preIOS7setApplicationStatusBarHidden:")
	public static native void mp_preIOS7setApplicationStatusBarHidden(
			UIApplication _object, boolean hidden);

	@Generated
	@Selector("mp_supportsOrientationMask:")
	public static native boolean mp_supportsOrientationMask(
			UIApplication _object, @NUInt long orientationMask);
}