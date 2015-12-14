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

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPLogEventRecorder extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPLogEventRecorder(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addEvent:")
	public native void addEvent(MPLogEvent event);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPLogEventRecorder alloc();

	@Generated
	@Selector("init")
	public native MPLogEventRecorder init();
}