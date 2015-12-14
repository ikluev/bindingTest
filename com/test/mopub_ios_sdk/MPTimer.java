package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.SEL;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPTimer extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPTimer(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPTimer alloc();

	@Generated
	@Selector("init")
	public native MPTimer init();

	@Generated
	@Selector("initialTimeInterval")
	public native double initialTimeInterval();

	@Generated
	@Selector("invalidate")
	public native void invalidate();

	@Generated
	@Selector("isScheduled")
	public native boolean isScheduled();

	@Generated
	@Selector("isValid")
	public native boolean isValid();

	@Generated
	@Selector("pause")
	public native boolean pause();

	@Generated
	@Selector("resume")
	public native boolean resume();

	@Generated
	@Selector("runLoopMode")
	public native String runLoopMode();

	@Generated
	@Selector("scheduleNow")
	public native boolean scheduleNow();

	@Generated
	@Selector("setRunLoopMode:")
	public native void setRunLoopMode(String value);

	@Generated
	@Selector("timerWithTimeInterval:target:selector:repeats:")
	public static native MPTimer timerWithTimeIntervalTargetSelectorRepeats(
			double seconds, @Mapped(ObjCObjectMapper.class) Object target,
			SEL aSelector, boolean repeats);
}