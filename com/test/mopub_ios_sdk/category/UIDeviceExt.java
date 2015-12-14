package com.test.mopub_ios_sdk.category;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCCategory;
import com.intel.inde.moe.natj.objc.ann.Selector;
import ios.uikit.UIDevice;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCCategory(UIDevice.class)
public final class UIDeviceExt {
	static {
		NatJ.register();
	}

	@Generated
	private UIDeviceExt() {
	}

	@Generated
	@Selector("mp_hardwareDeviceName")
	public static native String mp_hardwareDeviceName(UIDevice _object);
}