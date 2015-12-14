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
import ios.foundation.NSArray;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPLogEventCommunicator extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPLogEventCommunicator(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPLogEventCommunicator alloc();

	@Generated
	@Selector("init")
	public native MPLogEventCommunicator init();

	@Generated
	@Selector("isOverLimit")
	public native boolean isOverLimit();

	@Generated
	@Selector("sendEvents:")
	public native void sendEvents(NSArray events);
}