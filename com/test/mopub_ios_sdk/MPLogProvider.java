package com.test.mopub_ios_sdk;


import com.intel.inde.moe.natj.general.NatJ;
import com.intel.inde.moe.natj.general.Pointer;
import com.intel.inde.moe.natj.general.ann.Generated;
import com.intel.inde.moe.natj.general.ann.Library;
import com.intel.inde.moe.natj.general.ann.Mapped;
import com.intel.inde.moe.natj.general.ann.Owned;
import com.intel.inde.moe.natj.general.ann.Runtime;
import com.intel.inde.moe.natj.objc.ObjCRuntime;
import com.intel.inde.moe.natj.objc.ann.ObjCClassBinding;
import com.intel.inde.moe.natj.objc.ann.Selector;
import com.intel.inde.moe.natj.objc.map.ObjCObjectMapper;
import com.test.mopub_ios_sdk.protocol.MPLogger;
import ios.NSObject;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MPLogProvider extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MPLogProvider(Pointer peer) {
		super(peer);
	}

	@Generated
	@Selector("addLogger:")
	public native void addLogger(@Mapped(ObjCObjectMapper.class) MPLogger logger);

	@Generated
	@Owned
	@Selector("alloc")
	public static native MPLogProvider alloc();

	@Generated
	@Selector("init")
	public native MPLogProvider init();

	@Generated
	@Selector("logMessage:atLogLevel:")
	public native void logMessageAtLogLevel(String message, int logLevel);

	@Generated
	@Selector("removeLogger:")
	public native void removeLogger(
			@Mapped(ObjCObjectMapper.class) MPLogger logger);

	@Generated
	@Selector("sharedLogProvider")
	public static native MPLogProvider sharedLogProvider();
}