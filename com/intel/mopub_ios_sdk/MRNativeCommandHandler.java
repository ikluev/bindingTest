package com.intel.mopub_ios_sdk;


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
import com.intel.mopub_ios_sdk.protocol.MRNativeCommandHandlerDelegate;
import ios.NSObject;
import ios.foundation.NSDictionary;

@Generated
@Library("mopub_ios_sdk")
@Runtime(ObjCRuntime.class)
@ObjCClassBinding
public class MRNativeCommandHandler extends NSObject {
	static {
		NatJ.register();
	}

	@Generated
	protected MRNativeCommandHandler(Pointer peer) {
		super(peer);
	}

	@Generated
	@Owned
	@Selector("alloc")
	public static native MRNativeCommandHandler alloc();

	@Generated
	@Selector("handleNativeCommand:withProperties:")
	public native void handleNativeCommandWithProperties(String command,
			NSDictionary properties);

	@Generated
	@Selector("init")
	public native MRNativeCommandHandler init();

	@Generated
	@Selector("initWithDelegate:")
	public native MRNativeCommandHandler initWithDelegate(
			@Mapped(ObjCObjectMapper.class) MRNativeCommandHandlerDelegate delegate);
}