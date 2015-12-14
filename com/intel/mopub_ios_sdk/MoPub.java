package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.MappedReturn;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.Class;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.intel.mopub_ios_sdk.protocol.MPMediationSettingsProtocol;
import com.intel.mopub_ios_sdk.protocol.MPRewardedVideoDelegate;
import ios.NSObject;
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MoPub extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MoPub(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MoPub alloc();

	@Generated
	@Selector("bundleIdentifier")
	public native String bundleIdentifier();

	@Generated
	@Selector("globalMediationSettingsForClass:")
	@MappedReturn(ObjCObjectMapper.class)
	public native MPMediationSettingsProtocol globalMediationSettingsForClass(
			Class aClass);

	@Generated
	@Selector("init")
	public native MoPub init();

	@Generated
	@Selector("initializeRewardedVideoWithGlobalMediationSettings:delegate:")
	public native void initializeRewardedVideoWithGlobalMediationSettingsDelegate(
			NSArray globalMediationSettings,
			@Mapped(ObjCObjectMapper.class) MPRewardedVideoDelegate delegate);

	@Generated
	@Selector("locationUpdatesEnabled")
	public native boolean locationUpdatesEnabled();

	@Generated
	@Selector("setLocationUpdatesEnabled:")
	public native void setLocationUpdatesEnabled(boolean value);

	@Generated
	@Selector("sharedInstance")
	public static native MoPub sharedInstance();

	@Generated
	@Selector("start")
	public native void start();

	@Generated
	@Selector("version")
	public native String version();
}