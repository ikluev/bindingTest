package com.intel.mopub_ios_sdk;


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

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MOPUBPlayerManager extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBPlayerManager(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBPlayerManager alloc();

	@Generated
	@Selector("disposePlayerViewController")
	public native void disposePlayerViewController();

	@Generated
	@Selector("init")
	public native MOPUBPlayerManager init();

	@Generated
	@Selector("playerViewControllerWithVideoConfig:nativeVideoAdConfig:logEventProperties:")
	public native MOPUBPlayerViewController playerViewControllerWithVideoConfigNativeVideoAdConfigLogEventProperties(
			MPVideoConfig videoConfig,
			MOPUBNativeVideoAdConfigValues nativeVideoAdConfig,
			MPAdConfigurationLogEventProperties logEventProperties);

	@Generated
	@Selector("sharedInstance")
	public static native MOPUBPlayerManager sharedInstance();
}