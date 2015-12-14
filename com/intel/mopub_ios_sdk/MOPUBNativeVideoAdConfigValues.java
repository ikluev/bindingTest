package com.intel.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.NInt;
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
public class MOPUBNativeVideoAdConfigValues extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MOPUBNativeVideoAdConfigValues(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MOPUBNativeVideoAdConfigValues alloc();

	@Generated
	@Selector("impressionMinVisiblePercent")
	@NInt
	public native long impressionMinVisiblePercent();

	@Generated
	@Selector("impressionVisible")
	public native double impressionVisible();

	@Generated
	@Selector("init")
	public native MOPUBNativeVideoAdConfigValues init();

	@Generated
	@Selector("initWithPlayVisiblePercent:pauseVisiblePercent:impressionMinVisiblePercent:impressionVisible:maxBufferingTime:")
	public native MOPUBNativeVideoAdConfigValues initWithPlayVisiblePercentPauseVisiblePercentImpressionMinVisiblePercentImpressionVisibleMaxBufferingTime(
			@NInt long playVisiblePercent, @NInt long pauseVisiblePercent,
			@NInt long impressionMinVisiblePercent, double impressionVisible,
			double maxBufferingTime);

	@Generated
	@Selector("isValid")
	public native boolean isValid();

	@Generated
	@Selector("maxBufferingTime")
	public native double maxBufferingTime();

	@Generated
	@Selector("pauseVisiblePercent")
	@NInt
	public native long pauseVisiblePercent();

	@Generated
	@Selector("playVisiblePercent")
	@NInt
	public native long playVisiblePercent();
}